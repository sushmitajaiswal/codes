package ArrayPractice;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of array elements ");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array elements ");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int temp;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]);
		}

}
