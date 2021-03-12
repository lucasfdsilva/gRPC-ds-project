const grpc = require('@grpc/grpc-js');
const protoLoader = require('@grpc/proto-loader');

const PROTO_PATH = __dirname + '../../../../GUI-java-services/src/main/proto/clinic/email.proto';
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
const protoDescriptor = grpc.loadPackageDefinition(packageDefinition);

// Build the methods to be available in this service
function getHelloWorld(call, callback) {
  const result = "Hello World from NodeJS gRPC Server";

  callback(null, result);
}

// Build the gRPC server for this service
function getServer() {
  var grpcServer = new grpc.Server();
  grpcServer.addService(protoDescriptor.UserRegistrationEmail.service, {
    getHelloWorld: getHelloWorld
  });
  return grpcServer;
}

var routeServer = getServer();
routeServer.bindAsync('127.0.0.1:50053', grpc.ServerCredentials.createInsecure(), () => {
  console.log('gRPC User Registration Email Server Started. Running at http://localhost:50053');
  routeServer.start();
});

