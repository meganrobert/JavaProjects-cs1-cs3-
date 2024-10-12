//Name: Megan 
//Period: 3B 

import java.util.*; 

public class BasicBlackjack 
{
    public static void main(String [] args) 
    {
        Scanner input = new Scanner(System.in); 
        
        //problem 1
        System.out.print("Enter left tire pressure: "); 
        int leftPressure = input.nextInt(); 
        System.out.print("Enter right tire pressure: "); 
        int rightPressure = input.nextInt(); 
        if (leftPressure < 36 || rightPressure < 36) 
        {
            System.out.println("Warning! low tire pressure"); 
        }
        //problem 2
        System.out.print("Enter left tire pressure: "); 
        leftPressure = input.nextInt(); 
        System.out.print("Enter right tire pressure: "); 
        rightPressure = input.nextInt(); 
        if (leftPressure - rightPressure < 4 || rightPressure - leftPressure < 4)
        {
            System.out.println("Warning! uneven tire pressure!"); 
        }
        //problem 4 
        System.out.print("Enter grade: ");
        double grade = input.nextDouble(); 
        if (grade >= 90 && grade <= 100) 
        { 
            System.out.println("A"); 
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B"); 
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("c"); 
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("D"); 
        } else if (grade <= 59) {
            System.out.println("F"); 
        }
        //Blackjack App 
        System.out.print("Player 1, enter hand value: "); 
        int p1 = input.nextInt();
        System.out.print("Player 2, enter hand value: "); 
        int p2 = input.nextInt();
        if (p1 > 21 && p2 > 21) { 
            System.out.println("Both players bust!");     
        } else if (p2 > p1 && p2 <= 21 || p1 > 21) { 
            System.out.println("Player 2 wins!");     
        } else if (p2 == p1 && p2 <= 21 && p1 <= 21) {
            System.out.println("Tie!"); 
        } else if (p1 > p2 && p1 <= 21 || p2 >= 21) { 
            System.out.println("Player 1 wins!");
        }
    }
}
