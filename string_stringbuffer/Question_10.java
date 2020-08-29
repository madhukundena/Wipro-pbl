//input:wipro,3  
//output: propropro
package string_stringbuffer;

import java.io.*;

public class Question_10 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String s[]=br.readLine().split(",");
		int n=Integer.parseInt(s[1]);
		System.out.println("");
		for(int i=0;i<n;i++)
			System.out.print(s[0].substring(s[0].length()-n));
	}

}
