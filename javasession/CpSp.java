package javasession;
import java.util.Scanner;

public class CpSp{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		double cp,sp,dis,famount;
		System.out.println("Enter cost price ");
		cp=s.nextDouble();
		System.out.println("Enter selling price ");
		sp=s.nextDouble();
		System.out.println("Total amount to pay "+sp);
		dis=0.12*sp;
		System.out.println("Discount amount "+dis);
		famount=sp-dis;
		System.out.println("amount to pay after discount "+famount);
	}
	
}
	


