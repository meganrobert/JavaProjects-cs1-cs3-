import java.util.*;

public class LuckyDice
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rng = new Random();
        //problem 1
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int i = 0;
        System.out.println("");
        System.out.print("Factors of " + num + " >>> ");
        for (i = 1; i <= num; i++) 
        {
            if (num%i == 0)
            {
                System.out.print(i + " ");
            }  
        }
        System.out.println("");
        //problem 2 
        System.out.print("Enter a number: "); 
        int n = input.nextInt(); 
        i = 0;
        int cool = 0;
        for (i = 1; i <= n; i++) 
        {
            if (i%3 == 1 && i%4  == 1 && i%5 == 1 && i%6 == 1)
            {
               cool = cool + 1;
            }  
        }
        System.out.println("There are " + cool + " cool numbers up to " + n);
        
        //problem 3
        
        System.out.print("Enter a number: "); 
        n = input.nextInt(); 
        i = 1;
        cool = 0;
        while (i <= n) 
        {
            if (i%3 == 1 && i%4  == 1 && i%5 == 1 && i%6 == 1)
            {
               cool = cool + 1;
            }  
            i++;
        }
        System.out.println("There are " + cool + " cool numbers up to " + n);
        
        //problem 4 
        
        System.out.print("Enter a number: "); 
        n = input.nextInt(); 
        i = 0;
        int perfect = 0;
        for (i = 1; i < n; i++) 
        {
            if (n%i == 0)
            {
                perfect = perfect + i;
            }
        }

        if (perfect == n) 
        {
            System.out.println(n + " is a perfect number");
        } else 
        {
            System.out.println(n + " is not a perfect number");
        }
        
        //problem 5
        
        System.out.print("Enter a number: "); 
        n = input.nextInt(); 
        i = 1;
        perfect = 0;
        do
        {
            if (n%i == 0)
            {
                perfect = perfect + i;
            }
            i++;
        } while (i < n);
       

        if (perfect == n) 
        {
            System.out.println(n + " is a perfect number");
        } else 
        {
            System.out.println(n + " is not a perfect number");
        }
        
        //lucky dice 
        System.out.print("Number of faces on each die? "); 
        int faces = input.nextInt();
        System.out.print("Number of simulations? ");
        int sim = input.nextInt();
        int roll1 = 0; 
        int roll2 = 0; 
        for (i = 0; i <= sim; i ++) 
        {
            int rolls = 0; 
            int total = 0;
            while (total < 1000) 
            {
                roll1 = rng.nextInt(faces);
                roll2 = rng.nextInt(faces);
                total += roll1 + roll2;
                rolls++;
            }
        }
        
    }
}