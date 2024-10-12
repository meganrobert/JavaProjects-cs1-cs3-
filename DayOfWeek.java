
import java.util.*; 
public class DayOfWeek 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); 
        
        calculateDay(getMonth(), getDay(), getYear());
    }
    public static String getMonth() 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth month: "); 
        String month = input.next(); 
        return month;
    }
    public static int getDay() 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth day: "); 
        int day = input.nextInt(); 
        return day;
    }
    public static int getYear() 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth year: "); 
        int year = input.nextInt(); 
        return year;
    }
    public static void calculateDay(String month, int day, int year)
    {
        int total = 0; 
        total += year%100; 
        total = total/4;
        total += day; 
        
        switch (month) 
        {
            case "January": case "October": 
                total += 1; 
                break;
            case "February": case "March": case "November": 
                total += 4; 
                break;
            case "April": case "July":
                total += 0; 
                break; 
            case "May":   
                total += 2; 
                break;
            case "June":  
                total += 5; 
                break;
            case "August": 
                total += 3; 
                break;
            case "September": case "December": 
                total += 6; 
                break;
  
        }
        leapYear(year, month);
        
        if (year > 1799 && year < 1900)
        {
            total += 2; 
        } else if (year > 1899 && year < 2000)
        {
            total += 0; 
        } else if (year > 1999 && year < 2100)
        {
            total += 6; 
        }
        total += year%100; 
        
        int remainder = total%7;
        
        switch (remainder)
        {
            case 1: 
                System.out.println("Sunday");
                break;
            case 2: 
                System.out.println("Monday");
                break;
            case 3: 
                System.out.println("Tuesday");
                break;
            case 4: 
                System.out.println("Wednesday");
                break;
            case 5: 
                System.out.println("Thursday");
                break;
            case 6: 
                System.out.println("Friday");
                break;
            case 7: 
                System.out.println("Saturday"); 
                break;
        }
    }
    public static int leapYear(int year, String month)
    {
        if (year%4 == 0)
        {
            if (year%400 == 0 && year%100 == 0 || year%100 != 0)
            {
                if (month.equals("January") || month.equals("February"))
                {
                    return 1;
                }
            }
        } else 
        {
            return 0;
        }
        return 0;
    }
}
