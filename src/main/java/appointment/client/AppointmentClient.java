package appointment.client;

import com.proto.appointment.Appointment;
import com.proto.appointment.AppointmentRequest;
import com.proto.appointment.AppointmentResponse;
import com.proto.appointment.AppointmentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AppointmentClient {
    public static void main(String[] args) {
        System.out.println("Initializing a new gRPC Client");

        System.out.println("Creating a new channel");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("Creating Channel Sync stub");
        AppointmentServiceGrpc.AppointmentServiceBlockingStub appointmentClient = AppointmentServiceGrpc.newBlockingStub(channel);

        System.out.println("Defining a new appointment using the protocol buffer message");
        Appointment appointment = Appointment.newBuilder()
                .setFirstName("Lucas")
                .setLastName("Silva")
                .setAppointmentDate("22/02/2021")
                .setAppointmentTime("13:30")
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
}
