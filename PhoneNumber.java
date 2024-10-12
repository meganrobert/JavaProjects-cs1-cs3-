import java.util.*; 
public class PhoneNumber 
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);  
       question();
       daysInMonth(11, 2020);
       phoneNumber('K');
    }
    public static void question() 
    {
       Scanner input = new Scanner(System.in);  
       System.out.println("Which of the following is a valid variable declaration in Java? (Enter 1, 2, 3, 4)");
       System.out.println("1. int 1a = 4;"); 
       System.out.println("2.  double circle-area = 5.78;"); 
       System.out.println("3.  String s = 'hello!';"); 
       System.out.println("4.  boolean whoaNow = true; "); 
       int answer = input.nextInt(); 
       switch (answer) 
       {
           case 1:
            System.out.println("wrong answer"); 
            break;
           case 2: 
            System.out.println("wrong answer");
            break;
           case 3: 
            System.out.println("wrong answer"); 
            break;
           default: 
            System.out.println("right answer!");
           
        }
    }
    public static void daysInMonth(int month, int year)
    {
      
            switch(month) 
            {
              case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                System.out.println("31 days"); 
                break;
              case 4: case 6: case 9: case 11:
                System.out.println("30 days"); 
                break;
              case 2: 
                if (year%4 == 0 && year%100 == 0 && year%400 == 0 || year%4 == 0 && year%100 != 0) 
                {
                    System.out.println("29 days");
                } else
                {
                    System.out.println("28 days"); 
                }
                break;
              default: 
                System.out.println("invalid month or year");
            }
           
      }
    public static void phoneNumber(char ltr)
    {
        switch(ltr) 
        {
            case 'A': case 'B': case 'C': 
                System.out.println("The numerical equivalent is 2");
                break;
            case 'D': case 'E': case 'F': 
                System.out.println("The numerical equivalent is 3");
                break;
            case 'G': case 'H': case 'I': 
                System.out.println("The numerical equivalent is 4");
                break;
            case 'J': case 'K': case 'L': 
                System.out.println("The numerical equivalent is 5");
                break;
            case 'M': case 'N': case 'O': 
                System.out.println("The numerical equivalent is 6");
                break;
            case 'P': case 'Q': case 'R': 
                System.out.println("The numerical equivalent is 7");
                break;
            case 'S': case 'T': case 'U': 
                System.out.println("The numerical equivalent is 8");
                break;
            case 'W': case 'X': case 'Y': 
                System.out.println("The numerical equivalent is 9");
                break;
            default: 
                System.out.println("The numerical equivalent is 10");     
                
        }
    }
}


