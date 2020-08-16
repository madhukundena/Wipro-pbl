package pbl_Introduction;

public class If_7 {
 public static void main(String args[])
 {
	 char ch='a';
	 if(ch>='a'&&ch<='z')
	 {
		 System.out.println(ch+"->"+(char)(ch-32)); 
	 }
	 else if(ch>='A'&&ch<='Z')
	 {
		 System.out.println(ch+"->"+(char)(ch+32));
	 }
	 else
	 {
		 System.out.println("Not a Alphabet");
	 }
	 
 }
}
