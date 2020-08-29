
package string_stringbuffer;
import java.io.*;
public class Question_3 {
	public static void main(String args[]) throws IOException
	{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  String str=br.readLine();
	  int n = str.length();
	  for(int i=0;i<n;i++)
		  System.out.print(str.substring(0, 2));
	  
	  
	}

}
