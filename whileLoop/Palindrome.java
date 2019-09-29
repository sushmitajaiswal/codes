package whileLoop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,r,rev=0,temp;
		System.out.println("Enter any number");
		n=s.nextInt();
		temp=n;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(temp==rev)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}

}
