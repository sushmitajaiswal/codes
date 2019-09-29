package MethodPractice;
//with argument no return
import java.util.Scanner;

public class WithArgNoReturnDemo1 {
	
	static void Add(int x,int y)//x and y are formal argument/parameter
	{
		 int c;
		 c=x+y;
		 System.out.println("Sum is "+c);
	}

	public static void main(String[] args)
	{

		 int a,b;
		 Scanner S=new Scanner(System.in);
		 System.out.println("Enter 2 values ");
		 a=S.nextInt();
		 b=S.nextInt();
		 Add(a,b);//a and b are actual arguments / parameter

	}

}
