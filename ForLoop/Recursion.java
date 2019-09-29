package ForLoop;
import java.util.Scanner;
public class Recursion {

		static int fact(int x)
		{
			int f;
			if(x==1)
				return(1);
			else
				f=x*fact(x-1);
			return(f);
		}
	
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int f,n;
		System.out.println("Enter any value ");
		n=S.nextInt();
		f=fact(n);
		System.out.println("Factorial is "+f);

	}

}
