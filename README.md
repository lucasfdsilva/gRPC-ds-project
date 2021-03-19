# gRPC-ds-project
This project was developed as part of the Distributed Systems module in the last year of my Computer Science Degree at National College of Ireland. 

## Application
The application consists of a JAVA Client GUI with 3 decoupled services, developed in Java and NodeJS, which exchange information with the Client using gRPC protocols. 
The remote services publish themselves to DNS and the Client discovers all available services through DNS as well.

## How to use
1. Clone this repo locally
2. Run the server file for each of the services:
  * Service 1 - Appointment (Java) - root/src/main/java/clinic/services/appointment/AppointmentServer.java
  * Service 2 - Authentication/User Registration (Java) - root/src/main/java/clinic/services/authentication/AuthenticationServer.java
  * Service 3 - User Registration Confirmation Email (NodeJS) - root/NodeJS-services/src/UserRegistrationEmailServer.js
3. Run the Client GUI
  * root/src/main/java/clinic/client/ClientGUI.java
4. Use the GUI to interact with the services accordingly

![alt text](https://github.com/lucasfdsilva/gRPC-ds-project/blob/master/images/gui-screenshot.jpg?raw=true)
