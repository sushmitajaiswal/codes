package MethodPractice;

import java.util.Scanner;
public class Largest
{
static int largest(int x,int y)
{
	if(x>y)
		return (x);
	else 
		return (y);
}

public static void main(String[] args) 
{
	int a,b,r;
	 Scanner S=new Scanner(System.in);
	 System.out.println("Enter 2 values ");
	 a=S.nextInt();
	 b=S.nextInt();
	 r=largest(a,b);
	 System.out.println(r);
}
}