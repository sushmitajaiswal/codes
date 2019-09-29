package StringPractice;

import java.util.Scanner;

public class Display2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		int a=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				System.out.print(str.charAt(i));
			continue;
			}
			else
				System.out.print(a);
			if(a==9)
				a=0;
			else 
				a++;
		}

	}

}
