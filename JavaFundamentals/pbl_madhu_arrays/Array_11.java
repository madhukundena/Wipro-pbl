package pbl_madhu_arrays;

public class Array_11 {
	static void only14(int arr[])
	{ 
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1||arr[i]==4)
			{
				continue;
			}
			else
			{   flag=false;
				break;
			}
		}
		System.out.println(flag);
	}
	public static void main(String args[])
	{
		int arr[]={1,4,1,4,2};
		only14(arr);
	}

}
