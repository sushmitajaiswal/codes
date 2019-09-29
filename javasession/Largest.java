package javasession;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a,b,c;
System.out.println("Enter three values ");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if(a>b&&a>c)
	System.out.println("Largest value is "+a);
else if(b>a&&b>c)
	System.out.println("Largest value is "+b);
else
	System.out.println("Largest value is "+c);
	}

}
