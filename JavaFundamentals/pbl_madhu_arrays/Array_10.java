package pbl_madhu_arrays;
//separate odd and even numbers in an array
public class Array_10 {
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,9,5,6,7};
		int i,j,temp,counter=0;
		
		for(i=0;counter<arr.length;i++)
		{ //System.out.println("ival:"+i);
			if(arr[i]%2==1)
				{
					temp=arr[i];
				 for(j=i;j<arr.length-1;j++)
				  {
				    arr[j]=arr[j+1];
			      }
				 arr[j]=temp;
				  i--;
				}
			counter++;
		}
		for(i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
}
