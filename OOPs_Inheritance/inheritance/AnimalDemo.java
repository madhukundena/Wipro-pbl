package inheritance;

class Animal
{
	public void eat()
	{
		 System.out.println("Eat method called");
	}
	public void sleep()
	{
		System.out.println("sleep method called");
	}
}
class Birds extends Animal
{
	public void fly()
	{
		System.out.println("fly method called");
	}
}
public class AnimalDemo {
public static void main(String args[])
{
  Animal ani = new Animal();
  System.out.println("calling methods of animal");
  ani.eat();
  ani.sleep();
  Birds b = new Birds();
  System.out.println("calling the methods of animal and birds using bird obj:");
  b.eat();
  b.sleep();
  b.fly();

}
}
