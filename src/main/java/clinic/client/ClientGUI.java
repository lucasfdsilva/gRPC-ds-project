package clinic.client;

import clinic.client.appointment.DeleteAppointmentGUI;
import clinic.client.appointment.UpdateAppointmentGUI;
import clinic.client.authentication.DeleteUserGUI;
import clinic.client.authentication.UpdateUserGUI;
import com.google.common.util.concurrent.ListenableFuture;
import com.proto.appointment.*;
import com.proto.email.SendEmailRequest;
import com.proto.email.SendEmailResponse;
import com.proto.email.UserRegistrationEmailGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

public class ClientGUI {
    private JPanel mainPanel;

    private JTextField firstNameInput;
    private JTextField lastNameInput;
    private JTextField dateInput;
    private JTextField timeInput;
    private JButton createAppointmentButton;
    private JButton viewAllAppointmentsButton;
    private JButton deleteAppointmentButton;
    private JButton updateAppointmentButton;

    private JTextField emailInput;
    private JTextField passwordInput;
    private JButton authenticationButton;
    private JButton registerUserButton;
    private JButton viewAllUsersButton;
    private JButton updateUserButton;
    private JButton deleteUserButton;
    private JButton sendEmailButton;
    private JTextField emailInputEmailService;

    // Implementing jmDNS on the Client GUI
    public static class SampleListener implements ServiceListener {
        @Override
        public void serviceAdded ( ServiceEvent event ) {
            System.out.println("Service added: " + event.getInfo ());
        }
        @Override
        public void serviceRemoved ( ServiceEvent event ) {
            System.out.println("Service removed: " + event.getInfo ());
        }
        @Override
        public void serviceResolved ( ServiceEvent event ) {
            System.out.println("Service resolved: " + event.getInfo());
        }
    }

    public ClientGUI() {
        //Service 1 (Appointment) Button invocation
        createAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameInput.getText();
                String lastName = lastNameInput.getText();
                String date = dateInput.getText();
                String time = timeInput.getText();

                if(firstName.isEmpty() || lastName.isEmpty() || date.isEmpty() || time.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Missing Required Information");
                    return;
                }

                firstNameInput.setText("");
                lastNameInput.setText("");
                dateInput.setText("");
                timeInput.setText("");

                System.out.println("Initializing a new gRPC Client");

                System.out.println("Creating a new channel");
                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                        .usePlaintext()
                        .build();

                System.out.println("Creating Channel Sync stub");
                AppointmentServiceGrpc.AppointmentServiceBlockingStub appointmentClient = AppointmentServiceGrpc.newBlockingStub(channel);

                System.out.println("Defining a new appointment using the protocol buffer message");
                Random rand = new Random();
                int upperbound = 100;
                int int_random = rand.nextInt(upperbound);

                Appointment appointment = Appointment.newBuilder()
                        .setId(int_random)
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setAppointmentDate(date)
                        .setAppointmentTime(time)
                        .build();

                System.out.println("Defining a new request using the appointment information provided");
                NewAppointmentRequest newAppointmentRequest = NewAppointmentRequest.newBuilder()
                        .setAppointment(appointment)
                        .build();

                System.out.println("Sending & Receiving request to the server...");
                NewAppointmentResponse newAppointmentResponse = appointmentClient.newAppointment(newAppointmentRequest);

                System.out.println("Server Response: " + newAppointmentResponse.getResult());
                JOptionPane.showMessageDialog(null, "Server Response: " + newAppointmentResponse.getResult());

                System.out.println("Shutting down this channel");
                channel.shutdown();
            }
        });


        viewAllAppointmentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Initializing a new gRPC Client");

                System.out.println("Creating a new channel");
                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                        .usePlaintext()
                        .build();

                System.out.println("Creating Channel Sync stub");
                AppointmentServiceGrpc.AppointmentServiceBlockingStub appointmentClient = AppointmentServiceGrpc.newBlockingStub(channel);

                System.out.println("Defining a new request");
                ViewAppointmentsRequest viewAppointmentRequest = ViewAppointmentsRequest.newBuilder()
                        .build();

                System.out.println("Receiving appointment details from the server...");
                appointmentClient.viewAppointments(viewAppointmentRequest)
                        .forEachRemaining(viewAppointmentsResponse -> {
                            System.out.println(viewAppointmentsResponse.getResult());
                        });

                System.out.println("Shutting down this channel");
                channel.shutdown();
            }
        });

        updateAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateAppointmentGUI updateAppointmentGUI = new UpdateAppointmentGUI();
                updateAppointmentGUI.startup();
            }
        });

        deleteAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteAppointmentGUI deleteAppointmentGUI = new DeleteAppointmentGUI();
                deleteAppointmentGUI.startup();
            }
        });




        //Service 2 (Authentication)
        authenticationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailInput.getText();
                String password = passwordInput.getText();

                if(email.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Missing Required Information");
                    return;
                }

                if(!email.contains("@") || !email.contains(".")){
                    JOptionPane.showMessageDialog(null, "Email address invalid");
                    return;
                }

                emailInput.setText("");
                passwordInput.setText("");

                System.out.println("Initializing a new gRPC Client");

                System.out.println("Creating a new channel");
                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                        .usePlaintext()
                        .build();

                System.out.println("Creating Channel Sync stub");
                AuthenticationServiceGrpc.AuthenticationServiceBlockingStub authenticationClient = AuthenticationServiceGrpc.newBlockingStub(channel);

                System.out.println("Defining new user credentials using the protocol buffer message");
                UserCredentials userCredentials = UserCredentials.newBuilder()
                        .setEmail(email)
                        .setPassword(password)
                        .build();
                AuthenticationRequest authenticationRequest = AuthenticationRequest.newBuilder()
                        .setUserCredentials(userCredentials)
                        .build();

                System.out.println("Authenticating with the server...");
                AuthenticationResponse authenticationResponse = authenticationClient.authentication(authenticationRequest);

                System.out.println("Server Response: " + authenticationResponse.getResult());
                JOptionPane.showMessageDialog(null, "Server Response: " + authenticationResponse.getResult());

                System.out.println("Shutting down this channel");
                channel.shutdown();
            }
        });


        registerUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailInput.getText();
                String password = passwordInput.getText();

                if(email.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Missing Required Information");
                    return;
                }

                if(!email.contains("@") || !email.contains(".")){
                    JOptionPane.showMessageDialog(null, "Email address invalid");
                    return;
                }

                emailInput.setText("");
                passwordInput.setText("");

                // Sending Request to Register the user (Service 2)
                System.out.println("Initializing a new gRPC Client for the Register User Service");

                System.out.println("Creating a new channel");
                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                        .usePlaintext()
                        .build();

                System.out.println("Creating Channel Sync stub");
                AuthenticationServiceGrpc.AuthenticationServiceBlockingStub authenticationClient = AuthenticationServiceGrpc.newBlockingStub(channel);

                System.out.println("Defining new user credentials using the protocol buffer message");
                UserCredentials userCredentials = UserCredentials.newBuilder()
                        .setEmail(email)
                        .setPassword(password)
                        .build();

                System.out.println("Defining a new request using the user information provided");
                NewUserRequest newUserRequest = NewUserRequest.newBuilder()
                        .setUserCredentials(userCredentials)
                        .build();

                System.out.println("Sending & Receiving request to the server...");
                NewUserResponse newUserResponse = authenticationClient.newUser(newUserRequest);

                System.out.println("Server Response: " + newUserResponse.getResult());
                JOptionPane.showMessageDialog(null, "Server Response: " + newUserResponse.getResult());

                System.out.println("Shutting down this channel");
                channel.shutdown();

                if(newUserResponse.getResult().contains("Successfully")) {
                    // Sending Request to the User Registration Email Confirmation Service (Service 3 - NodeJS)
                    System.out.println("Initializing a new gRPC Client for the User Registration Confirmation Email Service");

                    System.out.println("Creating a new User Registration Email Service Channel");
                    ManagedChannel emailServiceChannel = ManagedChannelBuilder.forAddress("localhost", 50053)
                            .usePlaintext()
                            .build();

                    System.out.println("Creating Channel Sync stub");
                    UserRegistrationEmailGrpc.UserRegistrationEmailBlockingStub userRegistrationEmailService = UserRegistrationEmailGrpc.newBlockingStub(emailServiceChannel);

                    System.out.println("Defining a new request");
                    SendEmailRequest sendEmailRequest = SendEmailRequest.newBuilder()
                            .setUserEmail(email)
                            .build();

                    System.out.println("Sending Email Address details to the NodeJS gRPC User Registration Email Server...");
                    SendEmailResponse sendEmailResponse = userRegistrationEmailService.newEmail(sendEmailRequest);

                    System.out.println("Server Response: " + sendEmailResponse.getResult());
                    JOptionPane.showMessageDialog(null, "Server Response: " + sendEmailResponse.getResult());

                    System.out.println("Shutting down this channel");
                    channel.shutdown();
                }
            }
        });


        viewAllUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Initializing a new gRPC Client");

                System.out.println("Creating a new channel");
                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                        .usePlaintext()
                        .build();

                System.out.println("Creating Channel Sync stub");
                AuthenticationServiceGrpc.AuthenticationServiceBlockingStub authenticationClient = AuthenticationServiceGrpc.newBlockingStub(channel);

                System.out.println("Defining a new request");
                ViewUsersRequest viewUsersRequest = ViewUsersRequest.newBuilder()
                        .build();

                System.out.println("Receiving user's details from the server...");
                authenticationClient.viewUsers(viewUsersRequest)
                        .forEachRemaining(viewUsersResponse -> {
                            System.out.println(viewUsersResponse.getResult());
                        });

                System.out.println("Shutting down this channel");
                channel.shutdown();
            }
        });

        deleteUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteUserGUI deleteUserGUI = new DeleteUserGUI();
                deleteUserGUI.startup();
            }
        });
        updateUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateUserGUI updateUserGUI = new UpdateUserGUI();
                updateUserGUI.startup();
            }
        });



        //Service 3 - User Registration Email - NodeJS gRPC Server
        sendEmailButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailInputEmailService.getText();

                if(email.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Missing Email Address");
                    return;
                }

                if(!email.contains("@") || !email.contains(".")){
                    JOptionPane.showMessageDialog(null, "Email address invalid");
                    return;
                }

                emailInputEmailService.setText("");

                System.out.println("Initializing a new gRPC Client");

                System.out.println("Creating a new channel");
                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053)
                        .usePlaintext()
                        .build();

                System.out.println("Creating Channel Sync stub");
                UserRegistrationEmailGrpc.UserRegistrationEmailBlockingStub userRegistrationEmailService = UserRegistrationEmailGrpc.newBlockingStub(channel);

                System.out.println("Defining a new request");
                SendEmailRequest sendEmailRequest = SendEmailRequest.newBuilder()
                        .setUserEmail(email)
                        .build();

                System.out.println("Sending Email Address details to the NodeJS gRPC User Registration Email Server...");
                SendEmailResponse sendEmailResponse = userRegistrationEmailService.newEmail(sendEmailRequest);

                System.out.println("Server Response: " + sendEmailResponse.getResult());
                JOptionPane.showMessageDialog(null, "Server Response: " + sendEmailResponse.getResult());

                System.out.println("Shutting down this channel");
                channel.shutdown();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lucas' Clinic Services");
        frame.setContentPane(new ClientGUI().mainPanel);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        try {
            // Create a JmDNS instance

            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            // Add a service listener
            jmdns.addServiceListener("_http._tcp.local.", new SampleListener());
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        JOptionPane.showMessageDialog(null, "Make sure All 3 Service Servers have been started before trying to use this GUI. \n" +
                "Service 1 - Appointment (Java) - root/src/main/java/clinic/services/appointment/AppointmentServer.java \n" +
                "Service 1 - Authentication/User Registration (Java) - root/src/main/java/clinic/services/authentication/AuthenticationServer.java \n" +
                "Service 1 - User Registration Confirmation Email (NodeJS) - root/NodeJS-services/src/UserRegistrationEmailServer.js \n");
    }
}
