package pbl_madhu_arrays;

public class Array_12 {
	static int middleWay(int arr[])
	{
		return arr[arr.length/2]; 
		
	}
	public static void main(String args[])
	{
		int arr1[]={1,2,3};
		int arr2[]={4,5,6};
		System.out.print("[");
		System.out.print(middleWay(arr1)+", ");
		System.out.print(middleWay(arr2));
		System.out.print("]");
		
	}
}
