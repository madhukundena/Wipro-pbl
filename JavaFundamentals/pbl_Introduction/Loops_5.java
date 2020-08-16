package pbl_Introduction;
//printing the sum of the given number i/p=1234
public class Loops_5 {
	public static void main(String args[])
	{
		int num=1234,sum=0;
		while(num>0)
		{
			sum+=num%10;
			num/=10;
		}
		System.out.println(sum);
	}

}
