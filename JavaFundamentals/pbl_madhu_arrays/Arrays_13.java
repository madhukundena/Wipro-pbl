package pbl_madhu_arrays;

public class Arrays_13 {
	public static void main(String args[])
	{
		if(args.length==4)
		{
		int arr[][]=new int[2][2];
		int ind=0,i,j;
		for(i=0;i<2;i++)
			for(j=0;j<2;j++)
				arr[i][j]=Integer.parseInt(args[ind++]);
		System.out.println("The given array is:");
		for(i=0;i<2;i++,System.out.println())
			for(j=0;j<2;j++)
				System.out.print(arr[i][j]+" ");
		System.out.println("Reverser of array");
		for(i=0;i<2;i++,System.out.println())
			for(j=0;j<2;j++)
				System.out.print(arr[j][i]);
		}
		else
		{
			System.out.println("Please enter 4 integers");
		}
	}

}
