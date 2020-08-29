//input hi,hello output:hihellohi
package string_stringbuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_6 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		 int l1=str[0].length();
		 int l2=str[1].length();
		 int i=0,j=1; 
		 if(l1>l2){
			  i=1;
			  j=0;
		  }
		 System.out.println(str[i]+str[j]+str[i]);
		  
	}
	
}
