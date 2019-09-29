package MethodPractice;

import java.util.Scanner;

public class Prime {
	
	static String pri(int x)
	{
		int flag=0;
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			return("not prime");
		else
			return("prime");
	}

	public static void main(String[] args) {
		int a;
		String r;
		 Scanner S=new Scanner(System.in);
		 System.out.println("Enter value");
		 a=S.nextInt();
         r=pri(a);
         System.out.println(r);
	}

}
