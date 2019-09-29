package javasession;
// Input 2 values and print square of largest value and cube of smallest value
import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two values");
		a=s.nextInt();
		b=s.nextInt();
		if(a>b)
		{
			System.out.println("Square of largest value "+(a*a));
			System.out.println("Cube of smallest value "+(b*b*b));


		}
		else
		{
			System.out.println("Square of largest value "+(b*b));
			System.out.println("Cube of smallest value "+(a*a*a));

		}
			


	}

}
