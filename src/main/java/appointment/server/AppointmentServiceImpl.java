package appointment.server;

import com.proto.appointment.Appointment;
import com.proto.appointment.AppointmentRequest;
import com.proto.appointment.AppointmentResponse;
import com.proto.appointment.AppointmentServiceGrpc;
import io.grpc.stub.StreamObserver;

public class AppointmentServiceImpl extends AppointmentServiceGrpc.AppointmentServiceImplBase {

    @Override
    public void appointment(AppointmentRequest request, StreamObserver<AppointmentResponse> responseObserver) {
        // Extract the field from the request
        Appointment appointment = request.getAppointment();

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
