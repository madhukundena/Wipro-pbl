package string_stringbuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_5 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String str = br.readLine();
		
			System.out.println(str.substring(1,str.length()-1));
	}

}
