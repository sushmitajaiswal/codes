package TwoDimensionArray;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] a=new int[4][4];
		int i,j;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter Matrix ");
		for(i=0;i<3;i++)//rows
		{
			for(j=0;j<3;j++)//columns
				a[i][j]=S.nextInt();
		}
		System.out.println("Matrix is  ");
		for(i=0;i<3;i++)//rows
		{
			for(j=0;j<3;j++)//columns
				System.out.print(a[i][j]+" ");
			System.out.println(); //to move to next row
		}
		System.out.println("Transpose of Matrix is  ");
		for(i=0;i<3;i++)//rows
		{
			for(j=0;j<3;j++)//columns
				System.out.print(a[j][i]+" ");
			System.out.println(); //to move to next row
		}
	}

}
