package clinic.services.authentication;

import com.proto.appointment.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;

public class AuthenticationServiceImpl extends AuthenticationServiceGrpc.AuthenticationServiceImplBase {
    ArrayList<UserCredentials> userCredentialsList = new ArrayList<UserCredentials>();

    @Override
    public void authentication(AuthenticationRequest request, StreamObserver<AuthenticationResponse> responseObserver) {
        if(userCredentialsList.size() == 0){
            // Create the response if there are no users registered
            String resultNoAppointments = "There are no registered users.";

            AuthenticationResponse response = AuthenticationResponse.newBuilder()
                    .setResult(resultNoAppointments)
                    .build();
            // Send Response
            responseObserver.onNext(response);
            // Complete the RPC call
            responseObserver.onCompleted();
        }

        for (int i = 0; i <= userCredentialsList.size(); i++){
            UserCredentials userCredentials = (UserCredentials) userCredentialsList.get(i);

            if(userCredentials.getEmail().equals(request.getUserCredentials().getEmail())){

                if(userCredentials.getPassword().equals(request.getUserCredentials().getPassword())){
                    String result = "Credentials Match. User Authenticated Successfully";
                    AuthenticationResponse response = AuthenticationResponse.newBuilder()
                            .setResult(result)
                            .build();

                    // Send Response
                    responseObserver.onNext(response);

                    // Complete the RPC call
                    responseObserver.onCompleted();

                }else{
                    String result = "Password Incorrect. Please try again.";
                    AuthenticationResponse response = AuthenticationResponse.newBuilder()
                            .setResult(result)
                            .build();

                    // Send Response
                    responseObserver.onNext(response);

                    // Complete the RPC call
                    responseObserver.onCompleted();
                }
            }else{
                //Response if no user with specified Email was found
                String result = "No User registered with this Email Address was found. Please try again.";
                AuthenticationResponse response = AuthenticationResponse.newBuilder()
                        .setResult(result)
                        .build();

                // Send Response
                responseObserver.onNext(response);

                // Complete the RPC call
                responseObserver.onCompleted();
            }
        }
    }

    @Override
    public void newUser(NewUserRequest request, StreamObserver<NewUserResponse> responseObserver) {
        // Extract the field from the request
        UserCredentials userCredentialsOnRequest = request.getUserCredentials();

        if(userCredentialsList.size() > 0){
            for (int i = 0; i <= userCredentialsList.size(); i++){
                UserCredentials userCredentials = (UserCredentials) userCredentialsList.get(i);

                if(userCredentials.getEmail().equals(userCredentialsOnRequest.getEmail())){
                    //Response if there's already an user registered using this email address
                    String result = "Email Address already registered. Please use another email address.";
                    NewUserResponse response = NewUserResponse.newBuilder()
                            .setResult(result)
                            .build();

                    // Send Response
                    responseObserver.onNext(response);

                    // Complete the RPC call
                    responseObserver.onCompleted();
                }
            }
        }

        // Creating new object in Appointments array from details received
        userCredentialsList.add(userCredentialsOnRequest);

        // Create the response
        String result = "User " + userCredentialsOnRequest.getEmail() + " Registered Successfully.";
        NewUserResponse response = NewUserResponse.newBuilder()
                .setResult(result)
                .build();

        System.out.println("User " + userCredentialsOnRequest.getEmail() + " Registered Successfully.");

        // Send Response
        responseObserver.onNext(response);

        // Complete the RPC call
        responseObserver.onCompleted();
    }

    @Override
    public void viewUsers(ViewUsersRequest request, StreamObserver<ViewUsersResponse> responseObserver) {
        try{
            if(userCredentialsList.size() == 0){
                // Create the response if there are no users registered
                String resultNoUsers = "There are no registered users. Please register new users";

                ViewUsersResponse response = ViewUsersResponse.newBuilder()
                        .setResult(resultNoUsers)
                        .build();
                // Send Response
                responseObserver.onNext(response);
                // Complete the RPC call
                responseObserver.onCompleted();
            }

            for (int i = 0; i < userCredentialsList.size()+1; i++){
                String result = userCredentialsList.get(i).toString();

                // Create the response
                ViewUsersResponse response = ViewUsersResponse.newBuilder()
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

    @Override
    public void updateUser(UpdateUserRequest request, StreamObserver<UpdateUserResponse> responseObserver) {
        if(userCredentialsList.size() == 0){
            // Create the response if there are no users registered
            String resultNoUsers = "There are no registered users. Please register new users";

            UpdateUserResponse response = UpdateUserResponse.newBuilder()
                    .setResult(resultNoUsers)
                    .build();
            // Send Response
            responseObserver.onNext(response);
            // Complete the RPC call
            responseObserver.onCompleted();
        }

        for (int i = 0; i <= userCredentialsList.size(); i++){
            UserCredentials userCredentialsDetails = (UserCredentials) userCredentialsList.get(i);

            if(userCredentialsDetails.getEmail().equals(request.getUserCredentials().getEmail())){
                userCredentialsList.set(i, request.getUserCredentials());

                UserCredentials updatedUsersCredentials = (UserCredentials) userCredentialsList.get(i);

                String result = "User " + updatedUsersCredentials.getEmail() + " Updated Successfully.";
                UpdateUserResponse response = UpdateUserResponse.newBuilder()
                        .setResult(result)
                        .build();

                // Send Response
                responseObserver.onNext(response);

                // Complete the RPC call
                responseObserver.onCompleted();
            }
        }

        //Response if no user with specified email address was found
        String result = "No user with email address (" + request.getUserCredentials().getEmail() + ") was found";
        UpdateUserResponse response = UpdateUserResponse.newBuilder()
                .setResult(result)
                .build();

        // Send Response
        responseObserver.onNext(response);

        // Complete the RPC call
        responseObserver.onCompleted();
    }

    @Override
    public void deleteUser(DeleteUserRequest request, StreamObserver<DeleteUserResponse> responseObserver) {
        if(userCredentialsList.size() == 0){
            // Create the response if there are no users registered
            String resultNoUsers = "There are no registered users. Please register new users";

            DeleteUserResponse response = DeleteUserResponse.newBuilder()
                    .setResult(resultNoUsers)
                    .build();
            // Send Response
            responseObserver.onNext(response);
            // Complete the RPC call
            responseObserver.onCompleted();
        }

        for (int i = 0; i <= userCredentialsList.size(); i++){
            UserCredentials userCredentialsDetails = (UserCredentials) userCredentialsList.get(i);

            if(userCredentialsDetails.getEmail().equals(request.getEmail()) ){
                userCredentialsList.remove(i);

                String result = "User (" + request.getEmail() + ") Deleted Successfully.";
                DeleteUserResponse response = DeleteUserResponse.newBuilder()
                        .setResult(result)
                        .build();

                // Send Response
                responseObserver.onNext(response);

                // Complete the RPC call
                responseObserver.onCompleted();
            }
        }

        //Response if no user with specified email address was found
        String result = "No user with email address (" + request.getEmail() + ") was found";
        DeleteUserResponse response = DeleteUserResponse.newBuilder()
                .setResult(result)
                .build();

        // Send Response
        responseObserver.onNext(response);

        // Complete the RPC call
        responseObserver.onCompleted();
    }
}
