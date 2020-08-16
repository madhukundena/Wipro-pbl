package class_object_encap_abs;

public class Box {
	private int lenght,height,widith;
	 Box(int length,int height,int witdth)
	{
		this.lenght=length;
		this.height=height;
		this.widith=witdth;
	}
	void getVolume()
	{
		System.out.println("The volume is: "+lenght*height*widith);
	}
	public static void main(String args[])
	{
		Box bx=new Box(1,2,4);
		bx.getVolume();
	}
}
