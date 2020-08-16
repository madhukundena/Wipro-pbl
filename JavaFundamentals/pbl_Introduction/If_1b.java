package pbl_Introduction;
//checking the equality of the last digits of given two numbers
public class If_1b {
	public static void main(String args[])
	{
		int a=27,b=57;
	if(a>0&&b>0)
		if(a%10==b%10)
			System.out.println("TRUE");
		else
			System.out.println("False");
	else
		System.out.println("Enter positive values");
	}

}
