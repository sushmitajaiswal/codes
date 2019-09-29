package ArrayPractice;

import java.util.Scanner;

//Input An Array and sort elements in ascending order
//bubble sort
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of array elements ");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array elements ");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int temp;
		for(int i=0;i<n;i++)
		{
			int flag=0;
			for(int j=0;j<n-1-i;j++)
			{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				flag=1;
			}
			}
			if(flag==0)
				break;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");	
	}

}
