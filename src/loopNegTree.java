/* tjudge3 - a very basic assignment where -3 was the exit condition and besides that we just looped*/
import java.util.Scanner;
public class loopNegTree
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = 1;
		while(t!=-3)
		{
			System.out.println("Please enter a number (input -3 to exit) ");
			t = s.nextInt();
			System.out.println("Your number is "+t);
		}
	}
}
