package TwoDimensionArray;
import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args) {
		int[][] a=new int[3][4];
		int i,j;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter values ");
		for(i=0;i<3;i++)//rows
		{
			for(j=0;j<4;j++)//columns
				a[i][j]=S.nextInt();
		}
		System.out.println("Matrix is  ");
		for(i=0;i<3;i++)//rows
		{
			for(j=0;j<4;j++)//columns
				System.out.print(a[i][j]+" ");
			System.out.println(); //to move to next row
		}
	}

}
