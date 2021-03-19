package clinic.services.authentication;

import clinic.services.appointment.AppointmentServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class AuthenticationServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Initializing Authentication Service...");

        // Create a JmDNS instance
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

        // Register a service
        ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "authentication", 50052, "path = index.html");
        jmdns.registerService(serviceInfo);
        System.out.println("Authentication Service registered in DNS");

        System.out.println("gRPC Authentication Server Started");
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
