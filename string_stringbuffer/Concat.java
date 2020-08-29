package string_stringbuffer;

import java.io.*;

public class Concat {
 public static void main(String args[]) throws IOException
 {
	
	 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	 String s[]=br.readLine().split(",");
	char a,b;
	a=s[0].charAt(s[0].length()-1);
	b=s[1].charAt(0);
	 boolean flag=a==b?true:false;
	 if(flag)
		 System.out.println(s[0].concat(s[1].substring(1)));
	 else
		 System.out.println(s[0].concat(" ").concat(s[1]));
 }
}
