/* tjudge3 - AnimalInheritance - This was an assignment to help the class understand inheritance*/
class Animal 
        {
	    public Animal() 
               {
	        System.out.println("A new animal has been created!");
	       }
	    public void sleep() 
               {
	        System.out.println("An animal sleeps...");
	       }
	    public void eat() 
               {
	        System.out.println("An animal eats..."); 
               }
	}

class Cat extends Animal
	{
	public Cat()
		{
			super();
			System.out.println("A new cat has been created!");
		}
	public void sleep()
		{
			System.out.println("A cat sleeps...");
		}
	public void purr()
		{
			System.out.println("A cat purrs...");
		}
	public void eat()
		{
			System.out.println("A cat eats...");
		}
	}
class Cow extends Animal
	{
	public Cow()
		{
			super();
			System.out.println("A new cow has been created!");
		}
	public void sleep()
		{
			System.out.println("A Cow sleeps...");
		}
	public void moo()
		{
			System.out.println("A Cow mooos...");
		}
	public void eat()
		{
			System.out.println("A Cow eats...");
		}
	}
public class HappyAnimals
{
	public static void main(String args[])
	{
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.purr();
		System.out.println("\r\n");
		Cow cow = new Cow();
		cow.eat();
		cow.sleep();
		cow.moo();
	}

}
