package MethodPractice;
//with return with argument
import java.util.Scanner;

public class WithArgWithReturnDemo1 {

	static int Fact(int x)
	{
		int f=1;
		for(int i=1;i<=x;i++)
		{
		  f=f*i;
		}
		return(f);
	}

	public static void main(String args[])
	{
		 int a,r;
		 Scanner S=new Scanner(System.in);
		 System.out.println("Enter value");
		 a=S.nextInt();
		 r=Fact(a);
		 System.out.println(r);
	}

}
