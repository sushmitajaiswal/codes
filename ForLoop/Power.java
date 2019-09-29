package ForLoop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,e;
		long p=1;
		System.out.println("Enter a value");
		n=s.nextInt();
		System.out.println("Enter the exponent value");
		e=s.nextInt();
		for(int i=1;i<=e;i++)
		{
			p=n*p;
		}
		System.out.println(n+" power "+e+"="+p);
	}

}
