package javasession;

import java.util.Scanner;

//input monthly salary of person and print annual salary.
public class AnnualSalary
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		double sal,ann,tax;
		System.out.println("Enter monthly salary ");
		sal=s.nextDouble();
		ann=sal*12;
		tax=ann*0.23;
		System.out.println("Annual salary "+ann);
		System.out.println("Tax amount is "+tax);
	}
}

