package TwoDimensionArray;

import java.util.Scanner;

//input 2 matrices and print common elements in that
public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[3][4];
		int[][] b=new int[3][4];
		int i,j;
		Scanner S=new Scanner(System.in);

		System.out.println("Enter values of a");
		for(i=0;i<3;i++)//rows
		{
			for(j=0;j<4;j++)//columns
				a[i][j]=S.nextInt();
		}
		System.out.println("Enter values of b");
		for(i=0;i<3;i++)//rows
		{
			for(j=0;j<4;j++)//columns
				b[i][j]=S.nextInt();
		}
		System.out.println("Common Elements are ");
		for(i=0;i<3;i++)//rows
		{
			for(j=0;j<4;j++)//columns
			{
				for(int l=0;l<3;l++)//rows
				{
					for(int m=0;m<4;m++)//columns
					{
						if(a[i][j]==b[l][m])
							System.out.print(a[i][j]+" ");
					}
				
			}
		}
		
	}

}
}

