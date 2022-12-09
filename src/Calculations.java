/* tjudge3 - Assignment on Inheritance using calculations */
class Calculations{
	int z;

	public void addition(int x, int y){
		z = x+y;
		System.out.println("The sum of the given numbers:"+z);
	}

	public void Subtraction(int x,int y){
		z = x-y;
		System.out.println("The difference between the given numbers:"+z);
	}
}

class divisionClass extends Calculations
	{
	public void division(int x,int y)
		{
			z=x/y;
			System.out.println("The quotient of the given numbers:"+z);
		}
	}

class My_Calculation extends divisionClass{

	public void multiplication(int x, int y){
		z = x*y;
		System.out.println("The product of the given numbers:"+z);
	}

public static void main(String args[]){
	int a = 20, b = 10;
	My_Calculation demo = new My_Calculation();
	demo.addition(a, b);
	demo.Subtraction(a, b);
	demo.multiplication(a, b);
	demo.division(a, b);

}

}
