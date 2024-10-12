import java.util.*;

public class NestedLoops
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //problem 1
        System.out.print("enter an even number between 4 and 20: ");
        int size1 = input.nextInt();
        for (int r = 1; r <= size1; r++)
        {
            for (int c = 1; c <= r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int r = 1; r <= size1; r++)
        {
            for (int c = 1; c <= size1; c++)
            {
                if(c == 1 || c == size1 || r == 1 || r == size1)
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
        for (int r = 1; r <= size1; r++)
        {
            for (int c = 1; c <= size1 - r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //problem 2
        System.out.println();
        System.out.println();
        System.out.print("enter an odd number between 5 and 21: ");
        int size2 = input.nextInt();
        for (int r = 1; r <= size2; r++)
        {
            for (int c = 1; c <= size2; c++)
            {
                if (r == 1 || r  == size2 || c >= size2 - (size2*.7) && c <= size2 - size2*.25)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //problem 3
        System.out.println();
        System.out.println();
        System.out.print("enter a size between 10 and 30: ");
        int size3a = input.nextInt();
        int size3b = size3a - 4;
        for (int r = 1; r <= size3a; r++)
        {
            for (int c = 1; c <= size3a; c++)
            {
                if((c == 1 || c == size3a || r == 1 || r == size3a) || r >= ((size3a - size3b) / 2 + 1) && r <= size3a - ((size3a - size3b) / 2) && (c >= ((size3a - size3b) / 2) + 1) && c <= size3a - ((size3a - size3b) / 2))
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
        //problem 4
        System.out.println();
        System.out.println();
        System.out.print("enter a size greater then 5: ");
        int size3d = input.nextInt();
        for (int r = 1; r <= size3d; r++)
        {
            for (int c = 1; c <= size3d; c++)
            {
                if ((r == 1 && (c <= 2 || c >= size3d - 1)) || r == size3d && (c <= 2 || c >= size3d - 1) || (r > 1 && r < size3d && c > 1 && c < size3d))
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
         //problem 5
        System.out.println();
        System.out.println();
        System.out.print("enter a size greater then 7: ");
        int size3c = input.nextInt();
        for (int r = 1; r <= size3c; r++)
        {
            for (int c = 1; c <= size3c; c++)
            {
                if((c == 1 || c == size3c || r == 1 || r == size3c) || r == size3c - 2 && ( c >= 3 && c <= size3c - 2) || r == 3 && (c >= 3 && c <= size3c - 2) || (c == 3 || c == size3c - 2) && (r >= 3 && r <= size3c -2))
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
        //problem 6
        System.out.println();
        System.out.println();
        System.out.print("enter an odd value for size greater then 3: ");
        int size = input.nextInt();
        for (int r = 1; r <= size/2; r++)
        {
            for (int c = 1; c <= size; c++)
            {
                if (c > size/2 - r && c < size/2 + r)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
           
            System.out.println();
        }
        for (int r = size/2 - 1; r >= 1; r--)
        {
            for (int c = 1; c <= size; c++)
            {
                if (c > size/2 - r && c < size/2 + r)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
           
            System.out.println();
        }
    }
}
