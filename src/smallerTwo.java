/* tjudge3 - MidTerm assignment - find the smaller of two integers*/
import java.util.Scanner;
public class smallerTwo
{
public static int smaller(int numA, int numB) 
	{
		if(numA<numB)
		{
			return numA;
        }
        else
        {
        	return numB;
        }
	}
    public static void main(String args[])
    {
        int numA, numB;
        Scanner s=new Scanner(System.in);
        System.out.print("Please enter two integers : ");
        numA = s.nextInt();
        numB = s.nextInt();	
        System.out.print("The Smaller of the two intergers is " +smaller(numA,numB));
    }
}
