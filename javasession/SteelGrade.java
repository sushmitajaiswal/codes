package javasession;

import java.util.Scanner;

import java.util.Scanner;
public class SteelGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
double h,c,t;
System.out.println("Enter values ");
h=s.nextDouble();
c=s.nextDouble();
t=s.nextDouble();
if(h>50&&c<0.7&&t>5600)
	System.out.println("Grade 10");
else if(h>50&&c<0.7)
	System.out.println("Grade 9");
else if(c<0.7&&t>5600)
	System.out.println("Grade 8");
else if(h>50&&t>5600)
	System.out.println("Grade 7");
else if(h>50||c<0.7||t>5600)
	System.out.println("Grade 6");
else
	System.out.println("Grade 5");
	}

}
