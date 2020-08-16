package pbl_Introduction;

public class If_6 {
  public static void main(String args[])
  {
	  int age=Integer.parseInt(args[1]);
	  if(args[0].equals("Female"))
	  {
		  if(age>=0&&age<=58)
		  {
			  System.out.println("The percentage of interest is:+8.2%");
		  }
		  else if(age>=59&&age<=100)
		  {
			  System.out.println("The percentage of interest is:+9.2%");
		  }
		  else 
		  {
			  System.out.println("Age should be inbetween 1 and 100");
		  }
	  }
	  else if(args[0].equals("Male"))
	  {
		  if(age>=0&age<=58)
		  {
			  System.out.println("The percentage of interest is:+8.4%");
		  }
		  else if(age>=59&&age<=100)
		  {
			  System.out.println("The percentage of interest is:+10.5%");
		  }
		  else
		  {
			  System.out.println("Age should be inbetwen 0 and 100");
		  }
		  
	  }
	  else
	  {
		  System.out.println("Enter the input as Male or Female");
	  }
  }
}
