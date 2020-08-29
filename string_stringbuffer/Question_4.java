package string_stringbuffer;

import java.io.*;

public class Question_4 {
public static void main(String args[]) throws IOException
{
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	String str = br.readLine();
	if(str.length()%2==0)
	{
		System.out.println(str.substring(0,str.length()/2));
	}
	else
		System.out.println("null");
}
}
