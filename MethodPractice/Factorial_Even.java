package MethodPractice;

import java.util.Scanner;

//input a number in main() and pass it to a method Check(), this method return trueif no is even
//or false if no is odd.to main() back . True means number is even , false means no is odd. 
//if number is even , pass it to a method fact() to calculate its factorial.
public class Factorial_Even {
	static boolean Check(int x)
	{
		if(x%2==0)
			return(true);
			else
				return(false);
	}
	static void fact(int x)
	{
		int f=1;
		for(int i=1;i<=x;i++)
		{
			f=f*i;
			
		}
		System.out.println(f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		boolean r=false;
		Scanner S=new Scanner(System.in);
		 System.out.println("Enter a value");
		 a=S.nextInt();
		 r=Check(a);
		 if(r==true)
			 fact(a);

	}

}
