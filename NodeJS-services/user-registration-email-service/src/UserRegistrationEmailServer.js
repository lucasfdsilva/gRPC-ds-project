var PROTO_PATH = __dirname + '../../../../src/main/proto/clinic/email.proto';

const grpc = require('@grpc/grpc-js');
const protoLoader = require('@grpc/proto-loader');

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
  const result = "Hello World from the NodeJs gRPC Server"
  console.log("new request received...Email Address: " + call.request.userEmail)
  callback(null, { result: result })
}


// Build the gRPC server for this service
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

