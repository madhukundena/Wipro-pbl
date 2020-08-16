package pbl_madhu_arrays;
//sorting of an array
public class Arrays_6 {
	public static void main(String args[]){
		int i,temp;
		int[] arr={1,7,6,5,4,3,2,7,3};
		for(i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
			
	}

}
