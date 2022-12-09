/* tjudge3 - Method selection switch assignment*/
import java.util.Scanner;
public class dayOfWeek {
public static void printDay(int wday) 
{
   switch (wday) 
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
        default:
        System.out.println("Invalid Input");
   }
}
public static void main(String[] args) 
{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a day number of the week - 1 thru 7: ");
        int wday = s.nextInt();
        printDay(wday);
}

}
