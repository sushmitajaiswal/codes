package ArrayPractice;

import java.util.Scanner;

//input an array and find largest element in it and its location.
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] a=new int[5];
		S;
		foystem.out.println("Enter array elements")r(int i=0;i<5;i++)
		a[i]=s.nextInt();
		int max,loc;
		max=a[0];
		loc=0;
		for(int i=0;i<5;i++)
		{
			if(max<a[i])
				max=a[i];
			loc=i;
		}
		System.out.println("Largest element is "+max);
		System.out.println("Location of largest element is "+loc);
	}

}
