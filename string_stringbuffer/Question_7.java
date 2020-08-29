package string_stringbuffer;

import java.io.*;

public class Question_7 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String str= br.readLine();
		int len=str.length();
		str=str.toLowerCase();
		
		int first=0,last=len;

		if(str.charAt(0)=='x')
			first=1;
		
		if(str.charAt(len-1)=='x')
			last=len-1;
		
		if(first==1||last==len-1)
		{
		   System.out.println(str.substring(first,last));
		}
		else
		{
			System.out.println(str);
		}
	}

}
