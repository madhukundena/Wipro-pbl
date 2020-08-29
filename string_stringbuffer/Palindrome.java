package string_stringbuffer;

import java.io.*;

public class Palindrome {
	public static void main(String args[]) throws IOException
	{
	boolean flag=true;
	String str;
	int len;
    System.out.println("Enter the String ");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	str=br.readLine();
	len=str.length();
	str=str.toLowerCase();
	for(int i=0;i<len/2;i++)
	{
		if(str.charAt(i)!=str.charAt(len-i-1))
		{
		  flag=false;
		}
	}
	if(flag==true)
		System.out.println(str+" is a Palindrome");
	else
		System.out.println(str+" is Not a Palindrome");
	}
}
