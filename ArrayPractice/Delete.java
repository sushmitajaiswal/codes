package ArrayPractice;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,d;
		System.out.println("Enter number of array elements ");
		n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array elements ");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("Enter an element to delete");
		d=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(d==a[i])
			{
				for(int j=i;j<n-1;j++)
				{
					a[j]=a[j+1];
				}
				break;
			}
		}
		for(int i=0;i<n-1;i++)
		{
			System.out.print(a[i]+" ");
		}

}
}
