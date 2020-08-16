package pbl_madhu_arrays;
//program to print sum and average of an array
public class Arrays_1 {
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		int i,sum=0;
		for(i=0;i<5;i++)
		{
			sum+=a[i];
		}
		System.out.println("sum is: "+sum);
		System.out.println("Avg is: "+sum/i);
	}

}
