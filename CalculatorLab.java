import java.util.*;  
public class CalculatorLab 
{
    public static void main(String[] args) 
    {
        showMenu();
        int operation = showMenu();
        double a = getValue(); 
        double b = getValue();
        
        
        switch(operation)
            {
               case 1: 
                add(a, b);
                break;
               case 2: 
                subtract(a, b);
                break;
               case 3: 
                multiply(a, b);
                break;
               case 4: 
                divide(a, b);
                break;
               case 0: 
                break;
            }
        
   }
   public static int showMenu()
    {
        Scanner input = new Scanner(System.in); 
        System.out.println("Calculator Program"); 
        System.out.println("1 - Add");
        System.out.println("2 - Subtract"); 
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide"); 
        System.out.println("0 - End Program"); 
        System.out.print("Select the operation to perform: "); 
        int operation = input.nextInt();
        return operation;
    }
   public static double getValue()
    {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter a number: ");
        double num = input.nextInt(); 
        return num;
    }
   public static void add(double a, double b)
    {
        double sum = a+b;
        System.out.println(a + " + " + b + " = " + sum);
    }
   public static void subtract(double a, double b)
    {
        double difference = a-b;
        System.out.println(a + " - " + b + " = " + difference);         
    }
   public static void multiply(double a, double b)
    {
        double product = a*b;
        System.out.println(a + " * " + b + " = " + product);
    }
   public static void divide(double a, double b)
    {
        double quotient = a/b;
        System.out.println(a + " / " + b + " = " + quotient);
    }
}