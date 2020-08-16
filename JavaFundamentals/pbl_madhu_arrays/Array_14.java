package pbl_madhu_arrays;
//Finding maximum of the given 9 numbers as commandline arguments;
public class Array_14 {
	public static void main(String args[])
	{
		if(args.length==9)
		{
		int arr[][]=new int[3][3];
		int ind=0,i,j,max=0;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				arr[i][j]=Integer.parseInt(args[ind++]);
		System.out.println("The given array is:");
		for(i=0;i<3;i++,System.out.println())
			for(j=0;j<3;j++)
				System.out.print(arr[i][j]+" ");
		
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				if(max<arr[i][j])
				{
					max=arr[i][j];
				}
		System.out.println(max);
		}
		else
		{
			System.out.println("Please enter 9 integers");
		}
	}


}
