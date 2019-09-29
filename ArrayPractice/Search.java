package ArrayPractice;

import java.util.Scanner;

//input an array and search a given element in that.
public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] a=new int[5];
		int item;
        boolean found=false;
        System.out.println("Enter array elements ");
		for(int i=0;i<5;i++)
			a[i]=s.nextInt();
		System.out.println("Enter value to search ");
		item=s.nextInt();
		for(int i=0;i<5;i++)
		{
			if(item==a[i])
			{
				found=true;
				break;
			}
			
		}
		if(found==true)
		  System.out.println("Item found");
		else
			System.out.println("Item not found");	
	}

}
