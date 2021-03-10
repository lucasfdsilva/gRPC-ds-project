package clinic.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AppointmentServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("gRPC Appointment Server Started");

        Server server = ServerBuilder.forPort(50051)
                .addService(new AppointmentServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("Received Shutdown request");
            server.shutdown();
            System.out.println("Successfully stopped the Appointment server");
        }));

        server.awaitTermination();
    }

}
