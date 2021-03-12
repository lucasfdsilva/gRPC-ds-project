package clinic.services.authentication;

import clinic.services.appointment.AppointmentServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AuthenticationServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("gRPC Authentication Server Started. Running at http://localhost:50052");

        Server server = ServerBuilder.forPort(50052)
                .addService(new AuthenticationServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("Received Shutdown request");
            server.shutdown();
            System.out.println("Successfully stopped the Authentication server");
        }));

        server.awaitTermination();
    }

}
