package ForLoop;
//input any number and print table of it.
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter any number");
n=s.nextInt();
for(int i=1;i<=12;i++)
{
	System.out.println(n*i);

}
	}

}
