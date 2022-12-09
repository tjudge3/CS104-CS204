/* tjudge3 - The assignment was making sure we knew how to use While Loops */
import java.util.Scanner;
public class WhileLoopDPR 
{
    public static void main(String[] args) 
    {
        int dproduct = 1, wnum; 
        Scanner s = new Scanner(System.in);
        
        while (true) {
        System.out.print("Please input a number (input 0 to end the loop): ");
        wnum = s.nextInt();
        if (wnum == 0)
        break;
        dproduct *= wnum;
        }
        
        System.out.println("The product of all the numbers entered (sans the 0) is " + dproduct);
    }
}
