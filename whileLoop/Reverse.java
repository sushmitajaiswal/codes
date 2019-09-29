package whileLoop;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	int n,r,rev=0;
		System.out.println("Enter any number");
		n=s.nextInt();
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("Reversed number="+rev);
	}

}
