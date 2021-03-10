package clinic.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGUI {
    private JButton appointmentServiceButton;
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton createAppointmentButton;
    private JTextField textField5;
    private JTextField textField6;
    private JButton loginButton;
    private JLabel clinicAvailableServicesLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lucas' Clinic Services");
        frame.setContentPane(new ClientGUI().mainPanel);
        frame.setPreferredSize(new Dimension(1200,800));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
