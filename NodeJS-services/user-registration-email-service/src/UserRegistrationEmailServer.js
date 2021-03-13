var PROTO_PATH = __dirname + '../../../../src/main/proto/clinic/email.proto';

const grpc = require('@grpc/grpc-js');
const protoLoader = require('@grpc/proto-loader');

const aws = require('aws-sdk');
const ses = new aws.SES({region: 'eu-west-1'});

// This is defining the loading of the proto file properties. 
// Suggested options for similarity to existing grpc.load behavior
const packageDefinition = protoLoader.loadSync(
  PROTO_PATH,
  {keepCase: true,
   longs: String,
   enums: String,
   defaults: true,
   oneofs: true
  });
const emailServiceProto = grpc.loadPackageDefinition(packageDefinition);


//Building this Service Methods
function newEmail(call, callback) {
  const userEmailAddress = call.request.userEmail;

  console.log("New Email request received. User Email Address: " + userEmailAddress)

  var params = {
    Source: "support@asystec-restaurant.co.uk",
    Destination: {
        ToAddresses: [userEmailAddress],
    },
    ReplyToAddresses: ["support@asystec-restaurant.co.uk"],
    Message: {
      Subject: {
        Charset: "UTF-8",
        Data: `DS Clinic User Registration Confirmation`
      },
      Body: {
        Html: {
          Charset: "UTF-8",
          Data: `
          <h3>Thank you for registering with the DS Smart Clinic Service</h3>
          `
        }
      }
    }
  }
   ses.sendEmail(params, function (err, data) {
      //callback(null, {err: err, data: data});
      if (err) {
          console.log(err);
      } else {
          console.log("Email Sent Successfully " + data);

          const result = "User Registration Email Sent Successfully to: " + userEmailAddress;
          callback(null, { result: result })
      }
  });
}


// Build the gRPC server for the User Registration Email service
function getServer() {
  var grpcServer = new grpc.Server();
  grpcServer.addService(emailServiceProto.UserRegistrationEmail.service, {
    newEmail: newEmail
  });
  return grpcServer;
}

// Initializing the gRPC Server
var routeServer = getServer();
routeServer.bindAsync('127.0.0.1:50053', grpc.ServerCredentials.createInsecure(), () => {
  console.log('gRPC User Registration Email Server Started. Running at http://localhost:50053');
  routeServer.start();
});

