package dk.via.group4;

import dk.via.group4.client.SlaughterhouseClient;

import java.util.Scanner;

public class RunClient
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    //SlaughterhouseClient client = new SlaughterhouseClient("localhost", 9090);

    while (true)
    {
      System.out.print("Enter command: ");
      String line = scanner.nextLine();
      if (line.equalsIgnoreCase("exit")) break;

      String[] parts = line.split(" ");
      if (parts[0].equalsIgnoreCase("get-animals") && parts.length == 2)
      {
        //client.getAnimalsByProduct(parts[1]);
      }
      else if (parts[0].equalsIgnoreCase("get-products") && parts.length == 2)
      {
        //client.getProductsByAnimal(parts[1]);
      }
      else
      {
        System.out.println("Unknown command. Try 'get-animals <productId>' or 'get-products <animalId>'");
      }
    }
  }
}
