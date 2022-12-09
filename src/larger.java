/* tjudge3 - Assignment where we were asked to find the largest of three integers*/
import java.util.*;
public class larger
{
    public static void main(String args[])
    {
        int numA, numB, numC;
        Scanner s=new Scanner(System.in);
        System.out.print("Please input three integers : ");
        numA = s.nextInt();
        numB = s.nextInt();
        numC = s.nextInt();

        if( numA >= numB && numA >= numC)
            System.out.println(numA+" is the largest integer");
        else if (numB >= numA && numB >= numC)
            System.out.println(numB+" is the largest integer");
        else
            System.out.println(numC+" is the largest integer");
    }
}
