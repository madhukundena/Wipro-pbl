package pbl_Introduction;
//checking palindrome or not
public class Loops_9 {
	public static void main(String args[])
	{
		int num=110011,rev=0,safe;
		safe=num;
		while(num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		if(rev==safe)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
