package pbl_Introduction;
//printing prime numbers from 10 to 99 
public class Loops_4 {
	public static void main(String args[])
	{
		boolean flag=true;
		for(int k=10;k<=99;k++)
		{ flag=true;
		for(int i=2;i<=Math.sqrt(k);i++)
			if(k%i==0)
			{  
				flag = false;
				break;
			}
		if(flag==true)
			System.out.println(k);
			
		}

}
}
