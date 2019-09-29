package whileLoop;

import java.util.Scanner;
// input any number and print no of digits in it.
public class CountDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,count=0;
		System.out.println("Enter any number");
		n=s.nextInt();
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		
		System.out.println(count);
	}

}
