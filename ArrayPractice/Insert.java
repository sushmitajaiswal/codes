package ArrayPractice;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,p,x;
		System.out.println("Enter number of array elements ");
		n=s.nextInt();
		int[] a=new int[n+1];
		System.out.println("Enter array elements ");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("Enter a position to insert an element");
		p=s.nextInt();
		System.out.println("Enter a number to insert");
		x=s.nextInt();
		for(int i=(n-1);i>=(p-1);i--)
		{
			a[i+1]=a[i];
		}
		a[p]=x;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print(a[n]);
	}

}
