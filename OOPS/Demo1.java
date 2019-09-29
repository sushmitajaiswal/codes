package OOPS;
import java.util.Scanner;
class Abc
{
	int a,b,c;
	Scanner s=new Scanner(System.in);
	public void getdata()
	{
		System.out.println("Enter two values");
		a=s.nextInt();
		b=s.nextInt();
		
	}
	public void add()
	{
		c=a+b;
		System.out.println(c);
	}
	
}
public class Demo1
{
	public static void main(String[] args)
	{
		Abc obj=new Abc();
		obj.getdata();
		obj.add();
	}
}