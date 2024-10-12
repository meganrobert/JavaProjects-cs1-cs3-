//Name: Megan Robert 
//Period: 3B 

import java.util.*; 

public class NutsAndBolts 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in); 
        System.out.println("Number 1 and 2");
        System.out.print("Enter an int number >>> "); 
        int apples = input.nextInt();
        if (apples%2 == 0)
        {
            System.out.println("omg it's even!!"); 
        } else 
        {
            System.out.println("hmmm that's odd!"); 
        }
        System.out.println("Number 3");
        int votingAge = 18; 
        System.out.print("Enter your age: "); 
        int actualAge = input.nextInt(); 
        if (actualAge >= votingAge)
        {
            System.out.println("you can vote"); 
        } else 
        {
            System.out.println("you can't vote"); 
        }
        System.out.println("Number 4");
        System.out.print("Int 1: "); 
        int angle1 = input.nextInt(); 
        System.out.print("Int 2: ");         
        int angle2 = input.nextInt(); 
        System.out.print("Int 3: ");         
        int angle3 = input.nextInt(); 
        if (angle1 + angle2 + angle3 < 180 || angle1 + angle2 + angle3 > 180)
        { 
            System.out.println("Error"); 
        } else if (angle1 == angle2 && angle2 == angle3) {
            System.out.println("Equilateral"); 
        } else if (angle1 == angle2 || angle2 == angle3 || angle3 == angle1 || angle2 == angle3 || angle3 == angle1 || angle1 == angle2) { 
            System.out.println("Isosceles"); 
        } else if (angle1 != angle2 && angle2 != angle3 && angle3 != angle1)  { 
            System.out.println("Scalene"); 
        }
        System.out.println("Number 5");
        System.out.print("Player 1 - choose 1 for paper, 2 for rock or 3 for scissors >>> "); 
        int p1 = input.nextInt();
        System.out.print("Player 1 - choose 1 for paper, 2 for rock or 3 for scissors >>> ");         
        int p2 = input.nextInt();
        if (p1 == 1 && p2 == 1) { 
            System.out.println("Paper vs. Paper. Draw!"); 
        } else if (p1 == 2 && p2 == 1) { 
            System.out.println("Rock vs. Paper. Player 2 wins!");
        } else if (p1 == 3 && p2 == 1) { 
            System.out.println("Scissors vs. Paper. Player 1 wins!");
        } else if (p1 == 2 && p2 == 3) { 
            System.out.println("Rocks vs. Scissors. Player 1 wins!");
        } else if (p1 == 2 && p2 == 2) { 
            System.out.println("Rock vs. Rock. Draw!");
        } else if (p1 == 3 && p2 == 3) { 
            System.out.println("Scissors vs. Scissors. Draw!");
        } else if (p1 == 1 && p2 == 2) { 
            System.out.println("Paper vs. Rock. Player 1 wins!");
        } else if (p1 == 1 && p2 == 3) { 
            System.out.println("Paper vs. Scissors. Player 2 wins!");
        } else if (p1 == 3 && p2 == 2) { 
            System.out.println("Scissors vs. Rock. Player 2 wins!");
        } 
        
        System.out.println("Number 6");

        System.out.print("Number of bolts: ");
        int bolts = input.nextInt();
        int boltsPrice = bolts*5;
        System.out.print("Number of nuts: ");
        int nuts = input.nextInt();
        int nutsPrice = nuts*3;
        System.out.print("Number of washers: "); 
        int washers = input.nextInt();
        int washersPrice = washers*1;

        
        if (nuts >= bolts && washers >= 2*bolts) { 
            System.out.println("Order ok!"); 
        } else if (nuts < bolts){ 
            System.out.println("Check order! Too few nuts.");
        }
        else {
             System.out.println("Check order! Too few washers."); 
            }
        

        

        System.out.println("total cost (in cents): " + (boltsPrice+washersPrice+nutsPrice));
        

        

    }
}