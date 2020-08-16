package pbl_Introduction;

public class If_5 {
	public static void main(String args[])
	{
	char ch='&';
	if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
	{
		System.out.println("Alphabet");
	}
	else if(ch>='0'&&ch<='9')
	{
		System.out.println("Digit");
	}
	else 
	{
		System.out.println("Special Character");
	}
	}
}
