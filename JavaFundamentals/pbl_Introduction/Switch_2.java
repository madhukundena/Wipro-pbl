package pbl_Introduction;

public class Switch_2 {
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.println("Please Enter the month in Number");
		}//System.out.println("Please Enter");
		else
		{
			switch(args[0])
		{
		case "1":
		System.out.println("January"); break;
		
		case "2":
		System.out.println("Feburary"); break;
		
		case "3":
		System.out.println("March"); break;
		
		case "4":
		System.out.println("April"); break;
		
		case "5":
		System.out.println("May"); break;
		
		case "6":
			System.out.println("June");
		case "7":
			System.out.println("July"); break;
		case "8":
			System.out.println("Augest"); break;
		case "9":
			System.out.println("September"); break;
		case "10":
			System.out.println("October"); break;
		case "11":
			System.out.println("November"); break;
		case "12":
			System.out.println("December"); break;
			
		default:
			System.out.println("Invaild month");
			break;
		}
	  }
	}

}
