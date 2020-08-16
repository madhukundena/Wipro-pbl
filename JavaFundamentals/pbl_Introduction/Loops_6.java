package pbl_Introduction;
//floyds triangle formant;
public class Loops_6 {
	public static void main(String args[])
	{
		if(args.length!=0)
		{
		int n=Integer.parseInt(args[0]);
		//int n=2;
		short i=0,j=0;
		
		while(i<n)
		{ j=0;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println("");
		}
		}
		else
			System.out.println("Please an integer number");
	}

}
