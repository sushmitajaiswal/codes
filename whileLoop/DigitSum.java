package whileLoop;
import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int n,r,sum=0;
		System.out.println("Enter any number");
		n=s.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum of digits "+sum);
	}

}
