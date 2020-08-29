package overriding_polymorphism;

public class Shape_Sol {
	public static void main(String args[])
	{
		Shape c=new Circle();
			c.draw();
			c.earse();
		Shape t = new Trinangle();
			t.draw();
			c.earse();
		Shape s = new Square();
			s.draw();
			s.earse();
			
	}

}
