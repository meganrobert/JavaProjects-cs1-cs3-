
//Name: Megan 
//Period: 3B
import java.util.Scanner;
public class RoadTrip
{
   public static void main (String[] args)
   {
      //problem 1
      Scanner input = new Scanner (System.in);
      System.out.print("Enter an integer variable >>> "); 
      int num1 = input.nextInt();
      //problem 2 
      System.out.print("Enter your name >>> ");
      String name1 = input.next(); 
      System.out.println("Hello, " + name1 + "!");
      //problem 3 
      System.out.print("Enter a double variable >>> "); 
      double something = input.nextDouble();
      System.out.println(something*something);
      //problem 4 
      System.out.print("Enter your name again >>> "); 
      String name2 = input.next(); 
      System.out.print("Enter your age >>> "); 
      int age = input.nextInt();
      System.out.println(name2 + " is " + age + " years old."); 
      //problem 6 
      System.out.print("Enter an integer number >>> "); 
      int radius = input.nextInt(); 
      System.out.println(3.14*(radius*radius));
      //problem 7 
      System.out.print("Enter your name one more time >>> "); 
      name1 = input.next(); 
      System.out.println(name1+name1+name1);        
      
      //roadTripCalculator
      System.out.println("Enter your vehicle mileage");
      double vehicleMileage = input.nextDouble();
      System.out.print("Enter the number of miles your trip is: "); 
      double tripMiles = input.nextDouble();
      System.out.print("Enter the average speed: ");
      double averageSpeed = input.nextDouble(); 
      System.out.print("Enter tank capacity: ");
      double tankCapacity = input.nextDouble(); 
      System.out.print("Enter average price of gas: "); 
      double avgPriceOfGas = input.nextDouble();
      
      System.out.println("Road trip calculations:");
      
      double gallonsOfGas = tripMiles/vehicleMileage;
      System.out.println("Gallons of gas used: " + gallonsOfGas);
      System.out.println("Total cost of gas: " + gallonsOfGas*avgPriceOfGas); 
      int refuelStops = (int) gallonsOfGas/(int) tankCapacity;
      System.out.println("Minimum number of refueling stops: " + (double)(refuelStops + 1));      
      System.out.println("Total driving hours: " + tripMiles/averageSpeed);
      

      
      
      
      
        
        
    }
}  