package clinic.client;

import com.proto.appointment.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteAppointmentGUI {
    private JButton deleteAppointmentButton;
    private JPanel DeleteAppointment;
    private JTextField idInput;
    JFrame frame = new JFrame("Delete Appointment");

    public void startup() {
        frame.setContentPane(new DeleteAppointmentGUI().DeleteAppointment);
        frame.setPreferredSize(new Dimension(400,200));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public DeleteAppointmentGUI() {
        deleteAppointmentButton.addActionListener(new ActionListener() {
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
                int idConvertedToInt = Integer.parseInt(idInput.getText());
                DeleteAppointmentRequest deleteAppointmentRequest = DeleteAppointmentRequest.newBuilder()
                        .setId(idConvertedToInt)
                        .build();

                idInput.setText("");

                System.out.println("Sending Appointment Deletion Request to the server...");
                DeleteAppointmentResponse deleteAppointmentResponse = appointmentClient.deleteAppointment(deleteAppointmentRequest);

                System.out.println(deleteAppointmentResponse.getResult());
                JOptionPane.showMessageDialog(null, deleteAppointmentResponse.getResult());

                System.out.println("Shutting down this channel");
                channel.shutdown();
            }
        });
    }


}
