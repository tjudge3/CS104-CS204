/* tjudge3 - This assignment was making sure we knew how to use forloops. */
import java.util.Scanner;
public class ForLoopDPR 
{
    public static void main(String[] args) 
    {
        int dsum = 0, fnum;
    	Scanner s = new Scanner(System.in);
    	
        for (int i = 0; i < 10; i++) {
        System.out.print("Please input a number (input -6 to end the loop): ");
        fnum = s.nextInt();
        if (fnum == -6)
        break;
        dsum += fnum;
        }
        
        System.out.println("The sum of all the numbers entered (sans the -6) is " + dsum);
    }
}
