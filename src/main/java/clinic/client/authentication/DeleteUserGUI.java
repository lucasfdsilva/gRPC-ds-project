package clinic.client.authentication;

import com.proto.appointment.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteUserGUI {
    private JPanel DeleteUser;
    private JTextField emailInput;
    private JButton deleteUserButton;
    JFrame frame = new JFrame("Delete User");

    public void startup() {
        frame.setContentPane(new DeleteUserGUI().DeleteUser);
        frame.setPreferredSize(new Dimension(400,200));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public DeleteUserGUI() {
        deleteUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailInput.getText();

                if(!email.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Missing Email Address");
                    return;
                }

                if(!email.contains("@") || !email.contains(".")){
                    JOptionPane.showMessageDialog(null, "Email address invalid");
                    return;
                }

                System.out.println("Initializing a new gRPC Client");

                System.out.println("Creating a new channel");
                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                        .usePlaintext()
                        .build();

                emailInput.setText("");

                System.out.println("Creating Channel Sync stub");
                AuthenticationServiceGrpc.AuthenticationServiceBlockingStub authenticationService = AuthenticationServiceGrpc.newBlockingStub(channel);

                System.out.println("Defining a new request");
                DeleteUserRequest deleteUserRequest = DeleteUserRequest.newBuilder()
                        .setEmail(email)
                        .build();

                System.out.println("Sending User Deletion Request to the server...");
                DeleteUserResponse deleteUserResponse = authenticationService.deleteUser(deleteUserRequest);

                System.out.println(deleteUserResponse.getResult());
                JOptionPane.showMessageDialog(null, deleteUserResponse.getResult());

                System.out.println("Shutting down this channel");
                channel.shutdown();
            }
        });
    }
}
