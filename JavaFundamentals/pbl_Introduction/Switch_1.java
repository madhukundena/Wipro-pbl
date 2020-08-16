package pbl_Introduction;

public class Switch_1 {
public static void main(String args[])
{
	char ch='R';
	switch(ch)
	{
	case 'R':
	System.out.println("Red"); break;
	
	case 'B':
	System.out.println("Blue"); break;
	
	case 'G':
	System.out.println("Green"); break;
	
	case 'Y':
	System.out.println("Yellow"); break;
	
	case 'W':
	System.out.println("White"); break;
	
	default:
		System.out.println("Invaild code");
		break;
	}
}
}
