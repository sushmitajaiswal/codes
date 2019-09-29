package javasession;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
double m1,m2,m3,m4,average;
System.out.println("Enter four subject marks of a student ");
m1=s.nextDouble();
m2=s.nextDouble();
m3=s.nextDouble();
m4=s.nextDouble();
average=(m1+m2+m3+m4)/4;
if(average>=60)
	System.out.println("Grade A");
else if(average>=50&&average<60)
	System.out.println("Grade B");
else if(average>=40&&average<50)
	System.out.println("Grade C");
else
	System.out.println("Fail");
	}

}
