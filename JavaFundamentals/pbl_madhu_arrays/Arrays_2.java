package pbl_madhu_arrays;
//program to find max and min of an array
public class Arrays_2 {
	public static void main(String args[])
	{
	int a[]={1,2,3,4,-5};
	int i,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
	for(i=0;i<5;i++)
	{
		if(a[i]>max)
			max=a[i];
		if(a[i]<min)
			min=a[i];
	}
	System.out.println("Min is: "+min);
	System.out.println("Max is: "+max);
}
}