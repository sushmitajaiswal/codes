package ForLoop;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,fact=1;
		System.out.println("Enter any number");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);

	}

}
