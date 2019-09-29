package MethodPractice;
import java.util.Scanner;
//No Argument No Return
public class NoArgNoReturnDemo1 {
	
	 static void Add()//function definition
	{
	 int a,b,c;
	 Scanner S=new Scanner(System.in);
	 System.out.println("Enter 2 values ");
	 a=S.nextInt();
	 b=S.nextInt();
	 c=a+b;
	 System.out.println("Sum is "+c);
	}
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add(); //calling method

	}

}
