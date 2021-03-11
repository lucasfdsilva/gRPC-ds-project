package clinic.services.appointment;

import com.proto.appointment.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;

public class AppointmentServiceImpl extends AppointmentServiceGrpc.AppointmentServiceImplBase {
    ArrayList<Appointment> appointmentsList = new ArrayList<Appointment>();

    @Override
    public void newAppointment(NewAppointmentRequest request, StreamObserver<NewAppointmentResponse> responseObserver) {
        // Extract the field from the request
        Appointment appointment = request.getAppointment();

        // Creating new object in Appointments array from details received
        appointmentsList.add(appointment);

        // Extracting object details from appointments array
        Appointment appointmentDetails = (Appointment) appointmentsList.get(0);

        // Create the response
        String result = "Hi " + appointment.getFirstName() + ". Your Appointment was registered successfully. Appointment ID: " + appointment.getId();

        NewAppointmentResponse response = NewAppointmentResponse.newBuilder()
                .setResult(result)
                .build();

        // Send Response
        responseObserver.onNext(response);

        // Complete the RPC call
        responseObserver.onCompleted();
    }

    @Override
    public void viewAppointments(ViewAppointmentsRequest request, StreamObserver<ViewAppointmentsResponse> responseObserver) {

        try{
            if(appointmentsList.size() == 0){
                // Create the response if there are no appointments registered
                String resultNoAppointments = "There are no registered appointments. Please register new appointments";

                ViewAppointmentsResponse response = ViewAppointmentsResponse.newBuilder()
                        .setResult(resultNoAppointments)
                        .build();
                // Send Response
                responseObserver.onNext(response);
                // Complete the RPC call
                responseObserver.onCompleted();
            }

            for (int i = 0; i < appointmentsList.size()+1; i++){
                String result = appointmentsList.get(i).toString();

                // Create the response
                ViewAppointmentsResponse response = ViewAppointmentsResponse.newBuilder()
                        .setResult(result)
                        .build();

                // Send Response
                responseObserver.onNext(response);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            // Complete the RPC call
            responseObserver.onCompleted();
        }

    }
}
