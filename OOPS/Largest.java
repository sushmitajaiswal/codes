package OOPS;

import java.util.Scanner;

class Ghj
{
	Scanner S=new Scanner(System.in);
	int[] a=new int[5];
	public  Ghj()
	{
		
		System.out.println("Enter array elements");
		
		for(int i=0;i<5;i++)
		{
			a[i]=S.nextInt();
		}
	}
	public void lar()
	{
		int max=a[0];
		for(int i=1;i<5;i++)
		{
			
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}

public class Largest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ghj obj=new Ghj();
obj.lar();
	}

}
