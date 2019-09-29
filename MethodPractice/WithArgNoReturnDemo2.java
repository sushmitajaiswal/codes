package MethodPractice;

import java.util.Scanner;

public class WithArgNoReturnDemo2 {
	static void fact(int x)
	{
		int  f=1;
		for(int i=1;i<=x;i++)
		{
			f=f*i;
		}
		 System.out.println(f);
	}
	public static void main(String[] args)
	{
		int a;
		Scanner S=new Scanner(System.in);
		 System.out.println("Enter value");
		 a=S.nextInt();
		 fact(a);
	}
}
