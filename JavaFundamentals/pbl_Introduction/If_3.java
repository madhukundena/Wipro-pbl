package pbl_Introduction;

public class If_3 {
	public static void main(String args[])
	{
		if(args.length!=0)
		{
			for(int i=0;i<args.length;i++)
				{
				System.out.print(args[i]);
				if(i!=args.length-1)
					System.out.print(",");
				}
		}
		else
		{
			System.out.println("No Values");
		}
	}

}
