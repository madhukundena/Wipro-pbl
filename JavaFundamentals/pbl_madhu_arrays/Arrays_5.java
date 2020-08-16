package pbl_madhu_arrays;
//program to find 2 max and min of an array
public class Arrays_5 {
	public static void main(String args[])
	{
		int a[]={1,2,3,4,-5};
		int i,fmax,fmin,smax,smin,temp;
		  fmax=a[0];
		  fmin=a[0];
		  smin=a[1];
		  smax=a[1];
		  if(fmax<smax)
		  {
			   temp=fmax;
			   fmax=smax;
			   smax=temp;  
		  }
		  if(fmin>smin)
		  {
			  temp=fmin;
			  fmin=smin;
			  smin=temp;
		  }
		  
		  
		for(i=2;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(smax<a[i]&&fmax!=a[i])
			{
				smax=a[i];
			}
			if(fmin>a[i])
			{
				smin=fmin;
				fmin=a[i];
			}
			else if(smin>a[i]&&a[i]!=fmin)
			{
				smin=a[i];
			}
		}
		System.out.println(fmin+" "+smin);
		System.out.println(fmax+" "+smax);
	}
}
