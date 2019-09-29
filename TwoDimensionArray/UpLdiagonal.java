package TwoDimensionArray;

import java.util.Scanner;

public class UpLdiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[3][3];
		int i,j,max=0;
		
		Scanner S=new Scanner(System.in);
		System.out.println("Enter values ");
		for(i=0;i<3;i++)//rows
		{
			for(j=0;j<3;j++)//columns
				a[i][j]=S.nextInt();
		}
	for(i=0;i<3;i++)//rows
	{
		for(j=0;j<3;j++)//columns
		{
			if(i<j)
			{
				max=a[0][1];
				if(max<a[i][j])
				max=a[i][j];
			}
		}
	}
	System.out.println(max);
	for(i=0;i<3;i++)//rows
	{
		for(j=0;j<3;j++)//columns
		{
			if(j<i)
			{
				max=a[1][0];
				if(max<a[i][j])
					max=a[i][j];
			}		
		}
	}
	System.out.println(max);
	}

}
