package overriding_polymorphism;

class Fruit {
	protected String name,taste;
	protected int size;
	
	public void Eat()
	{
		System.out.println(name +" tastes "+taste+" and they are "+size);
	}
}
class Apple extends Fruit
{
	private String name="Apple",taste="sweet";
	private int size;
	public Apple(int size)
	{
		this.size = size;
	}
	public void Eat()
	{
		System.out.println(name +" tastes "+taste+" and they are "+size);
	}
}
class Orange extends Fruit
{
	private String name="Oranges",taste="soure";
	private int size;
	public Orange(int size)
	{
		this.size = size;
	}
	public void Eat()
	{
		System.out.println(name +" tastes "+taste+" and they are "+size);
	}
}
public class Fruit_Sol
{
public static void main(String args[])
{
	Apple apple=new Apple(10);
	apple.Eat();
	Orange orange = new Orange(20);
	orange.Eat();
}

}