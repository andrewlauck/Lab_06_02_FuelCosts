import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
      String trash = "";
      double gallons = 0;
      double gas = 0;
      double efficiency = 0;
      double gasRate;

      gasRate = gas/efficiency

      Scanner in = new Scanner(System.in);

      System.out.println("The number of gallons of gas in the tank");
      if (in.hasNextDouble())
      {
          gallons = in.nextDouble();
          in.nextLine();
      }
      else
      {
          trash = in.nextLine();
          System.out.println("Must enter valid number for gallons");
      }
      System.out.println("The fuel efficiancy in miles per gallon");
      if (in.hasNextDouble())
      {
          efficiency = in.nextDouble();
          in.nextLine();
      }
      else
      {
          trash = in.nextLine();
          System.out.println("must enter a valid number for fuel efficiancy");
      }
      System.out.println("The price of gas per gallon");
      if (in.hasNextDouble())
      {
          gas = in.nextDouble();
          in.nextLine();
      }
      else
      {
          trash = in.nextLine();
          System.out.println("Must enter valid number");
      }
      System.out.println("Price of gas per 100 miles");
      if (in.hasNextDouble())
      {
          gasRate = in.nextDouble();
      }
      else
      {
          trash = in.nextLine();
          System.out.println("must enter a valid number");
      }

      System.out.println("Gallons of gas: " +gallons);
      System.out.println("Fuel efficiency in miles: " +efficiency);
      System.out.println("Price of gas per gallon: " +gas);
      System.out.println("Cost per 100 miles: " +gasRate);
    }
}