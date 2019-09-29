package ForLoop;
//input a value and print its prime or not
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n,temp=0;
      System.out.println("Enter any number");
      n=s.nextInt();
      for(int i=2;i<=n-1;i++)
      {
    	  if(n%i==0)
    		  temp=temp+1;
      }
      if(temp>0)
    	  System.out.println("Number is not prime");
      else
    	  System.out.println("Number is prime");
	}

}
