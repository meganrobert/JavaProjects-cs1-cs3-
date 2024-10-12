//Name: Megan Robert
//Period: 3B

import java.util.*; 

public class FullBlackjack
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rng = new Random();
        int playing = 0;
        int playerValue = 0;
        do 
        {
            int dealerValue = rng.nextInt(12);
            dealerValue = dealerValue + rng.nextInt(12);
            System.out.println("The dealer has their cards"); // save dealer value
            int firstCard = rng.nextInt(12); 
            System.out.println("Your first card is: " + firstCard);// assign and print value to first card 
            int secondCard = rng.nextInt(12); 
            System.out.println("Your second card is: " + secondCard); // assign and print value to second card  
            playerValue = firstCard + secondCard;
            System.out.println("Your total is: " + playerValue); 
            
            while (dealerValue <= 14)
            {
                dealerValue += rng.nextInt(12);
            }
            
            if (playerValue < 21) 
            {
               System.out.println("hit or stay? (1 for hit, 2 for stay): "); 
               int hit = input.nextInt();
               while (hit == 1 && playerValue < 21) 
               {
                   int newCard = rng.nextInt(12);
                    System.out.println("new card value: " + newCard); 
                    playerValue += newCard;
                    System.out.println("Current total: " + playerValue); 
                    if (hit == 2 || playerValue >= 21)
                    {
                      System.out.println("You have: " + playerValue); 
                      System.out.println("Dealer has: " + dealerValue);
                    } else {
                      System.out.println("hit or stay? (1 for hit, 2 for stay): "); 
                      hit = input.nextInt();
                    }
 
                }
               if (playerValue > 21 && dealerValue > 21) {
                    System.out.println("You have: " + playerValue); 
                    System.out.println("Dealer has: " + dealerValue);
                    System.out.println("Both players bust! Enter 1 to play again or 2 to quit: ");
                    playing = input.nextInt();
                } else if (dealerValue > playerValue && dealerValue <= 21 || playerValue > 21) {
                    System.out.println("You have: " + playerValue); 
                    System.out.println("Dealer has: " + dealerValue);
                    System.out.println("Dealer wins! Enter 1 to play again or 2 to quit: ");
                    playing = input.nextInt();
                } else if (dealerValue == playerValue && dealerValue <= 21 && playerValue <= 21) {
                    System.out.println("You have: " + playerValue); 
                    System.out.println("Dealer has: " + dealerValue);
                    System.out.println("Tie! Enter 1 to play again or 2 to quit: "); 
                    playing = input.nextInt();
                } else if (playerValue > dealerValue && playerValue <= 21 || dealerValue >= 21) {
                    System.out.println("You have: " + playerValue); 
                    System.out.println("Dealer has: " + dealerValue);
                    System.out.println("You win! Enter 1 to play again or 2 to quit: ");
                    playing = input.nextInt();
                }
           } else 
           {
                System.out.println("You won! Enter 1 to play again or 2 to quit: ");
                playing = input.nextInt();
            }
        } while (playing == 1);
    }
}

