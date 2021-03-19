package clinic.services.appointment;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class AppointmentServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Initializing Appointment Service...");

        // Create a JmDNS instance
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

        // Register a service
        ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "appointment", 50051, "path = index.html");
        jmdns.registerService(serviceInfo);
        System.out.println("Appointment Service registered in DNS");

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
