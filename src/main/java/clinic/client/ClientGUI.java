package clinic.client;

import com.proto.appointment.Appointment;
import com.proto.appointment.AppointmentRequest;
import com.proto.appointment.AppointmentResponse;
import com.proto.appointment.AppointmentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ClientGUI {
    private JPanel mainPanel;
    private JButton createAppointmentButton;
    private JTextField firstNameInput;
    private JTextField lastNameInput;
    private JTextField dateInput;
    private JTextField timeInput;

    private JButton loginButton;
    private JTextField usernameInput;
    private JTextField passwordInput;

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
                AppointmentRequest appointmentRequest = AppointmentRequest.newBuilder()
                        .setAppointment(appointment)
                        .build();

                System.out.println("Sending & Receiving request to the server...");
                AppointmentResponse appointmentResponse = appointmentClient.appointment(appointmentRequest);

                System.out.println("Result: " + appointmentResponse.getResult());

                System.out.println("Shutting down this channel");
                channel.shutdown();
            }
        });

        //Service 2 (Authentication) Button invocation
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //do something
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lucas' Clinic Services");
        frame.setContentPane(new ClientGUI().mainPanel);
        frame.setPreferredSize(new Dimension(1200,800));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
