/* tjudge3 - Final - Number 4 -Find the average of 3 numbers*/
import java.util.Scanner;
public class avgThree {
public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
    System.out.print("Please input three numbers: ");
    double numA = s.nextDouble();
    double numB = s.nextDouble();
    double numC = s.nextDouble();
    System.out.print("The average of the three entered numbers is " + average(numA,numB,numC)+"\n" );
    }
  public static double average(double numA, double numB, double numC)
    {
        return (numA+numB+numC)/3;
    }
}
