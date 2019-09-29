package ArrayPractice;

import java.util.Scanner;

//input an array and print sum of all elements
public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] a=new int[5];
		int sum=0;
		System.out.println("Enter array elements ");
		for(int i=0;i<5;i++)
			a[i]=s.nextInt();
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array elements "+sum);
	}

}
