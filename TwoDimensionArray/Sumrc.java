package TwoDimensionArray;

import java.util.Scanner;

public class Sumrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[][] a=new int[4][4];
		System.out.println("Enter values ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
				a[i][j]=s.nextInt();
		}
		for(int i=0;i<3;i++)
		{ 
			int sum=0;
			for(int j=0;j<4;j++)
			{
			sum=sum+a[i][j];
			}
			System.out.println(sum);
		}
		for(int i=0;i<4;i++)
		{ 
			
			int m=0;
			for(int j=0;j<4;j++)
			{
			m=m+a[j][i];
			}
			System.out.println(m);
		}
	}

}
