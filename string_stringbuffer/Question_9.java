//input: hello,worldadfasd
//output: hweolrllod
package string_stringbuffer;

import java.io.*;

public class Question_9 {
	public static void main( String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String s[]=br.readLine().split(",");
		int ind=0;
		while(ind<s[0].length()&&ind<s[1].length())
		{
			System.out.print(s[0].charAt(ind)+""+s[1].charAt(ind++));
		}
	}
}
