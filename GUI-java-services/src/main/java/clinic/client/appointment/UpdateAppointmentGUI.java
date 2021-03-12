package clinic.client.appointment;

import com.proto.appointment.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateAppointmentGUI {
    private JTextField idInput;
    private JTextField firstNameInput;
    private JTextField lastNameInput;
    private JTextField dateInput;
    private JTextField timeInput;
    private JButton updateAppointmentButton;
    private JPanel UpdateAppointmentPanel;
    JFrame frame = new JFrame("Update Appointment Details");

    public void startup() {
        frame.setContentPane(new UpdateAppointmentGUI().UpdateAppointmentPanel);
        frame.setPreferredSize(new Dimension(400,200));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public UpdateAppointmentGUI() {
        updateAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idInput.getText();
                String firstName = firstNameInput.getText();
                String lastName = lastNameInput.getText();
                String date = dateInput.getText();
                String time = timeInput.getText();

                if(id.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || date.isEmpty() || time.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Missing Required Information");
                    return;
                }

                idInput.setText("");
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
                int idConvertedToInt = Integer.parseInt(id);
                Appointment appointment = Appointment.newBuilder()
                        .setId(idConvertedToInt)
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setAppointmentDate(date)
                        .setAppointmentTime(time)
                        .build();

                System.out.println("Defining a new request using the appointment information provided");
                UpdateAppointmentRequest updateAppointmentRequest = UpdateAppointmentRequest.newBuilder()
                        .setAppointment(appointment)
                        .build();

                System.out.println("Sending & Receiving request to the server...");
                UpdateAppointmentResponse updateAppointmentResponse = appointmentClient.updateAppointment(updateAppointmentRequest);

                System.out.println("Server Response: " + updateAppointmentResponse.getResult());
                JOptionPane.showMessageDialog(null, "Server Response: \n" + updateAppointmentResponse.getResult());

                System.out.println("Shutting down this channel");
                channel.shutdown();
            }
        });
    }

}
