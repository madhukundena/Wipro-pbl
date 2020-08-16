package pbl_Introduction;
//Checking prime of not.
public class Loop_3 {
	public static void main(String args[])
	{
		int num=10;
		boolean flag=true;
		for(int i=2;i<=Math.sqrt(num);i++)
			if(num%i==0)
			{  
				flag = false;
				break;
			}
		if(flag==false)
			System.out.println("Not prime");
		else 
			System.out.println("Prime");
			
		}
	}

