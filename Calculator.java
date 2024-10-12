//Name: Megan Robert
//Period: 3B

import java.util.*; 

public class Calculator 
{ 
    public static void main(String[] args)
    { 
        Scanner input = new Scanner(System.in); 
        
        //1
        System.out.println("Enter a number");
        int a = input.nextInt(); 
        if (a == 9) 
        {
            System.out.println("#1"); 
        }
        //2
        System.out.println("Enter a number"); 
        int b = input.nextInt(); 
        if (b == 9 || b < 20) 
        {
            System.out.println("#2"); 
        }
         //3
        System.out.println("Enter a number"); 
        int c = input.nextInt(); 
        if (c == 9 || c == 6) 
        {
            System.out.println("#3"); 
        }
         //5
        System.out.println("Enter a number"); 
        int d = input.nextInt(); 
        if (d != 4)
        {
            System.out.println("#5"); 
        }
         //6
        System.out.println("Enter a number"); 
        double e = input.nextDouble(); 
        if (e != 7.5 || e < 10 || e > 2)
        {
            System.out.println("#6"); 
        }
        //7
        System.out.println("Enter a number"); 
        double f = input.nextDouble(); 
        if (f > 1 || f < 20)
        {
            System.out.println("#7"); 
        }
        //8
        System.out.println("Welcome to Megan's Quest, assign stats to your character (max 15 points TOTAL)"); 
        System.out.println("Enter strength (from 1 to 10) >>> "); 
        double strength = input.nextInt(); 
        System.out.println("Enter health (from 1 to 10) >>> "); 
        double health = input.nextDouble();
        System.out.println("Enter magic (from 1 to 10) >>> "); 
        double magic = input.nextInt();
        if (strength + magic + health > 15)
        { 
            System.out.println("Point limit exceeded! Default values assigned"); 
            strength = 5; 
            health = 5; 
            magic = 5;
            System.out.println("Strength = " + strength + ", Health = " + health + ", Magic = " + magic + ". Good Luck!");
        }   else {  
            System.out.println("Strength = " + strength + ", Health = " + health + ", Magic = " + magic + ". Good Luck!");
        }
        //9
        System.out.println("1 - addition (+)\n2 - subtraction (-)\n3 - multiplication (*)\n4 - division (/)\n5 - modulus (%) (calculates remainder)");
        System.out.print("Enter the number of your desired operation from the list above >> "); 
        int op = input.nextInt(); 
        System.out.print("Enter first number >>> ");
        double first = input.nextDouble(); 
        System.out.print("Enter second number >>> ");       
        double second = input.nextDouble(); 
        if (op == 1) { 
           
            System.out.println( first + " + " + second + " = " + (first + second));
        }  
        else if (op == 2) {
            
            System.out.println( first + " - " + second + " = " + (first - second));
        } 
        else if (op == 3) {
            
            System.out.println( first + " * " + second + " = " + (first * second)); 
        }
        else if (op == 4) {
            
            System.out.println( first + " / " + second + " = " + (first / second)); 
        }
        else { 
            System.out.println( first + " % " + second + " = " + (first % second)); 
        }


   }
}    