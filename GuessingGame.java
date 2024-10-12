import java.util.*;

    public class GuessingGame
    {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in); //Allows you to ever values from the keyboard.
            Random randomGen = new Random(); //Allows you to generate random numbers.See notes in lab.
            
            //Problem 1
            System.out.println("Problem 1");
            System.out.println();
            // Write problem 1 here
            System.out.print("Enter an integer: "); 
            int n = input.nextInt(); 
            int i = 1;
            while (i <= n)
            {
               System.out.print(i + " "); 
               i++; 
            }
            
            //Problem 2
            System.out.println();
            System.out.println("Problem 2");
            // Write problem 2 here
            System.out.print("Enter an integer: "); 
            n = input.nextInt();
            
            int sum = 0; 
            int j = 1; 
            
            while (j <= n)
            {
                sum = sum + j; 
                j++;
            }
            
            System.out.println("Sum of all numbers from 1 to " + n + ": " + sum);
                
            
            System.out.println();
            
            //Problem 3
            System.out.println();
            System.out.println("Problem 3");
            System.out.println();
            // Write problem 3 here
            
            System.out.print("Enter an integer: "); 
            n = input.nextInt();
            
            sum = 0; 
            j = 0; 
            
            while (j <= n)
            {
                sum = sum + j; 
                j += 2;
            }
            
            System.out.println("Sum of all numbers even from 1 to " + n + ": " + sum);
                
            
            System.out.println();
            
            
            
            //Problem 4 - Riddle
            System.out.println();
            System.out.println("Problem 4 - Riddle");
            System.out.println();
            //Output riddle answer here (optional)
            
            
            
            
            //Problem 5
            System.out.println();
            System.out.println("Problem 5");
            System.out.println();
            // Write problem 5 here
            
            System.out.print("Enter an integer: "); 
            n = input.nextInt();
            
            sum = 0; 
            j = 0; 
            
            while (j <= n)
            {
                sum = sum + j; 
                j += 7;
            }
            
            System.out.println("Sum of all multiples of seven from 1 to " + n + ": " + sum);
                
            
            System.out.println();
            
            
            
            
            
            
            //Guessing Game
            System.out.println();
            System.out.println("Guessing Game");
            System.out.println();
            // Write the Guessing Game here
            
            int guesses = 7;
            
            int number = randomGen.nextInt(1000) + 1; 
           
            int userGuess = 0;
            do {
                
                System.out.println("Enter a number: "); 
                userGuess = input.nextInt();  
                if (userGuess == number) {
                    System.out.println("You won! You guessed correctly"); 
                } else if (userGuess > number) {
                    System.out.println("Too high!"); 
                } else if (userGuess < number) {
                    System.out.println("Too low!"); 
                }
                guesses = guesses - 1;
                
                
            } while (userGuess != number && guesses > 0);
            
            System.out.println("You lost!"); 
            
            
            
            
            
            
            
        }
	}
