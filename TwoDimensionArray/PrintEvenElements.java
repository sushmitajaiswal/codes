package TwoDimensionArray;

import java.util.Scanner;

//input a matrix and print all even elements
public class PrintEvenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[][] a=new int[3][4];
		System.out.println("Enter values ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
				a[i][j]=s.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(a[i][j]%2==0)
					System.out.print(a[i][j]+" ");	
			}
		}
		
	}

}
