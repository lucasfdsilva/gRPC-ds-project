package clinic.server;

import com.proto.appointment.Appointment;
import com.proto.appointment.AppointmentRequest;
import com.proto.appointment.AppointmentResponse;
import com.proto.appointment.AppointmentServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;

public class AppointmentServiceImpl extends AppointmentServiceGrpc.AppointmentServiceImplBase {
    ArrayList<Appointment> appointmentsList = new ArrayList<Appointment>();

    @Override
    public void appointment(AppointmentRequest request, StreamObserver<AppointmentResponse> responseObserver) {
        // Extract the field from the request
        Appointment appointment = request.getAppointment();

        // Creating new object in Appointments array from details received
        appointmentsList.add(appointment);

        // Extracting object details from appointments array
        Appointment appointmentDetails = (Appointment) appointmentsList.get(0);
        System.out.println(appointmentDetails.getFirstName());

        // Create the response
        String result = "Hello " + appointment.getFirstName() + " " + appointment.getLastName();
        AppointmentResponse response = AppointmentResponse.newBuilder()
                .setResult(result)
                .build();

        // Send Response
        responseObserver.onNext(response);

        // Complete the RPC call
        responseObserver.onCompleted();
    }
}
