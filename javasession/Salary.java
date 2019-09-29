package javasession;
//input monthly salary of a person. If his salary is more than 20000, he gets HRA 23% of monthly
//salary and
//12% DA of salary. otherwise HRA is 3000, Da is 2000.
//print HRA, Da and total salary.
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		double sal,hra,da,totalsal;
		System.out.println("Enter monthly salary of a person ");
		sal=s.nextDouble();
		if(sal>20000)
		{
		hra=0.23*sal;
		da=0.12*sal;
		}
		else
		{
			hra=3000;
			da=2000;
		}
		System.out.println("HRA "+hra);
		System.out.println("DA "+da);
		totalsal=sal+hra+da;
		System.out.println("Total salary is "+totalsal);
	}

}
