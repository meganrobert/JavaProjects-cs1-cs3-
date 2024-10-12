import java.util.*; 

public class NestedForLoop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter an even number between 4 and 20: "); 
        int size = input.nextInt(); 
        int r = 0; 
        int c = 0;
        for (r = 1; r < size; r++) 
        {
            for (c = 1; c <= r; c++) 
            {
               System.out.print("*"); 
            }
            System.out.println();
        }
        
        System.out.println(); 
        System.out.println();
        
        for (r = 1; r <= size; r++) 
        {
            for (c = 1; c <= size; c++) 
            {
               if (c == 1 || c == size || r == 1 || r == size)
               {
                   System.out.print("*"); 
               } else 
               {
                   System.out.print(" "); 
                }
           }
            System.out.println();
        }
        System.out.println(); 
        System.out.println();
        for (r = 1; r <= size; r++) 
        {
            for (c = size; c >= r; c--) 
            {
               System.out.print("*"); 
            }
            System.out.println();
        }
        System.out.println(); 
        System.out.println();
        //problem 2 
        System.out.print("Enter an odd number between 5 and 21: "); 
        size = input.nextInt();
        for (r = 1; r <= size; r++) 
        {
            for (c = 1; c <= size; c++) 
            {
               if  (r != 1 && r != size && c == 1 || r != 1 && r != size && c == 2 || r != 1 && r != size && c == size || r != 1 && r != size && c == size-1)
               {
                   System.out.print(" "); 
               } else 
               {
                   System.out.print("*"); 
                }
           }
            System.out.println();
        }
        //problem 3 
        System.out.println(); 
        System.out.println();
        System.out.print("Enter an odd number between 10 and 30: "); 
        size = input.nextInt();
        for (r = 1; r <= size; r++) 
        {
            for (c = 1; c <= size; c++) 
            {
               if (c == 2 && r != 1 && r != size || c == size-1 && r != 1 && r != size  || r == 2 && c != 1 && c != size || r == size-1 && c != 1 && c != size)
               {
                   System.out.print(" "); 
               }  else 
                {
                  System.out.print("*");
                }

           }
            System.out.println();
        }
        //problem 4
        System.out.println(); 
        System.out.println();
        System.out.print("Enter a size greater than 5: "); 
        size = input.nextInt();
        for (r = 1; r <= size; r++) 
        {
            for (c = 1; c <= size; c++) 
            {
               if (c == 1 && r != 1 && r != size || c == size && r != 1 && r != size || r == 1 && c != 1 && c != 2 && c != size && c != size-1 || r == size && c != 1 && c != 2 && c != size && c != size-1)
               {
                   System.out.print(" "); 
               }  else 
                {
                  System.out.print("*");
                }

           }
            System.out.println();
        }
        //problem 5
        System.out.println(); 
        System.out.println();
        System.out.print("Enter the size greater than 7: "); 
        size = input.nextInt();
        for (r = 1; r <= size; r++) 
        {
            for (c = 1; c <= size; c++) 
            {
               if (c == 1 || c == size || r == 1 || r == size)
               {
                   System.out.print("*"); 
               } else 
               {
                   System.out.print(" "); 
                }
               if (c == 3 && r == 3) 
               {
                   System.out.print("*"); 
                }
                
           }
            System.out.println();
        }
        }        
    }
    
    
