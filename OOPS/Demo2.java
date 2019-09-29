package OOPS;

import java.util.Scanner;

class XYZ
{
	int a,f=1;
	Scanner S=new Scanner(System.in);
	public void getdata()
	{
		System.out.println("Enter a value");
		 a=S.nextInt();
	}
	public void fact()
	{
		for(int i=1;i<=a;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial is "+f);
	}
}
public class Demo2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		XYZ obj=new XYZ();
		obj.getdata();
		obj.fact();
	}

}
