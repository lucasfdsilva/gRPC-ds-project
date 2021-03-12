package clinic.client.authentication;

import clinic.client.appointment.UpdateAppointmentGUI;
import com.proto.appointment.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateUserGUI {
    private JPanel UpdateUserPanel;
    private JTextField emailInput;
    private JTextField passwordInput;
    private JButton updateUserButton;
    JFrame frame = new JFrame("Update User Details");

    public void startup() {
        frame.setContentPane(new UpdateUserGUI().UpdateUserPanel);
        frame.setPreferredSize(new Dimension(400,200));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public UpdateUserGUI() {
        updateUserButton.addActionListener(new ActionListener() {
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
                AuthenticationServiceGrpc.AuthenticationServiceBlockingStub authenticationService = AuthenticationServiceGrpc.newBlockingStub(channel);

                System.out.println("Defining new user credentials using the protocol buffer message");
                UserCredentials userCredentials = UserCredentials.newBuilder()
                        .setEmail(email)
                        .setPassword(password)
                        .build();

                System.out.println("Defining a new request using the appointment information provided");
                UpdateUserRequest updateUserRequest = UpdateUserRequest.newBuilder()
                        .setUserCredentials(userCredentials)
                        .build();

                System.out.println("Sending & Receiving request to the server...");
                UpdateUserResponse updateUserResponse = authenticationService.updateUser(updateUserRequest);

                System.out.println("Server Response: " + updateUserResponse.getResult());
                JOptionPane.showMessageDialog(null, "Server Response: \n" + updateUserResponse.getResult());

                System.out.println("Shutting down this channel");
                channel.shutdown();
            }
        });
    }


}
