package pbl_madhu_arrays;
//removing of duplicates
public class Arrays_7 {
	public static void main(String args[])
	{
		int i,len,k,j;
		int[] arr={12,34,12,45,67,89,99};
		len=arr.length;
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
				  for(k=j;k<len-1;k++)
				  {
					  arr[k]=arr[k+1];
				  }
				  j--;
				  len--; 
				}
				
			}
		}
		for(i=0;i<len;i++)
			System.out.print(arr[i]+" ");
	}

}
