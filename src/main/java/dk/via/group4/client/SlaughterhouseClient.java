package dk.via.group4.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
//import slaughterhouse.*; // generated from slaughterhouse.proto

public class SlaughterhouseClient
{
  private final ManagedChannel channel = ManagedChannelBuilder
      .forAddress("localhost", 9090) // must match RunServer port
      .usePlaintext()
      .build();

//  Create a blocking stub for synchronous calls
//  private final SlaughterhouseServiceGrpc.SlaughterhouseServiceBlockingStub stub =
//      SlaughterhouseServiceGrpc.newBlockingStub(channel);

  public static void main(String[] args) {new SlaughterhouseClient().run();}

  public void run()
  {
//    getProductsForAnimal("P123");
//    getAnimalsForProduct("A001");

    // Close the channel when done
    channel.shutdown();
  }
}
