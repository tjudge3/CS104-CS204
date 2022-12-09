/* Midterm - tjudge3 - This assignemnt was to make sure we knew how to use switch statements*/
import java.util.Random;
class goodWillSwitch
{
	public static void main(String arg[])
	{
		Random r = new Random();
		int gwm = r.nextInt(6)+1;
		System.out.println("Your random goodwill message is \r\n");
		switch (gwm) 
		{
			case 1 :
			System.out.println("You are Amazing");
			break;
			case 2 :
			System.out.println("You are Great");
			break;
			case 3 :
			System.out.println("You are Fantastic");
			break;
			case 4 :
			System.out.println("You are Awesome");
			break;
			case 5 :
			System.out.println("You are really cool");
			break;
			case 6 :
			System.out.println("You rock!");
			break;
			default:
			System.out.println("Congrats! Something went wrong!");
			break;
		}
  }
}
