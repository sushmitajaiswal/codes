package ArrayPractice;

import java.util.Scanner;

//input an array and search a given element in that and print how many times its in array.
public class CountSearchedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter array elements ");
		for(int i=0;i<5;i++)
			a[i]=s.nextInt();
		int item,c;
		c=0;
		System.out.println("Enter value to search ");
		item=s.nextInt();
		for(int i=0;i<5;i++)
		{
			if(item==a[i])
			c++;
		}
		
		
		System.out.println("Item found"+c+"times");
		
	}

}
