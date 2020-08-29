package string_stringbuffer;
import java.io.*;

public class Question_8 {
 public static void main(String args[]) throws IOException
 {
	 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	 String s= br.readLine();
	 int len=s.indexOf('*');
	 if(len>0)
		 System.out.println(s.substring(0,len));
	 else
		 System.out.println(s);
 }
	
}
