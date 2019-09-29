package javasession;
//input 2 values and print largest value.
import java.util.Scanner;
public class demo1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two number ");
		a=s.nextInt();
		b=s.nextInt();
		if(a>b)
			System.out.println("Largest value " +a);
		else
			System.out.println("Largest value " +b);
	}
}
