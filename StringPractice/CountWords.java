package StringPractice;

import java.util.Scanner;

//count no of words in String
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				count++;
		}
		System.out.println("No of Words are "+(count+1));
	}

}
