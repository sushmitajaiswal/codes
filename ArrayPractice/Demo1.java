package ArrayPractice;

import java.util.Scanner;

//input an array of 10 elements and print all even elements
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] a=new int[10];
		int i;
		System.out.println("Enter array elements ");
		for(i=0;i<10;i++)
			a[i]=s.nextInt();
		for(i=0;i<10;i++)
		{
			if(a[i]%2==0)
				System.out.print(a[i]+" ");	
		}
	}

}
