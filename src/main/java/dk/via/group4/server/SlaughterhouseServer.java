package dk.via.group4.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class SlaughterhouseServer
{


  public static void main( String[] args )
      throws Exception
  {
    new SlaughterhouseServer().run();
  }


  private void run()
      throws Exception
  {

    Server server = ServerBuilder
        .forPort(9090)
        .addService( new SlaughterhouseServiceImpl() )
        .build();

    server.start();
    server.awaitTermination();
  }
}
