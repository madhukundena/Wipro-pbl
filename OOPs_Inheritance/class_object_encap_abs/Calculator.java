package class_object_encap_abs;

public class Calculator {
	public static void powerInt(int num1,int num2)
	{
		System.out.println((int)Math.pow(num1, num2));
	}
	public static void PowerDouble(double num1,double num2)
	{
	  System.out.println(Math.pow(num1, num2));	
	}
	public static void main(String args[])
	{
		Calculator.powerInt(2, 5);
		Calculator.PowerDouble(2.2, 2);
	}
}
