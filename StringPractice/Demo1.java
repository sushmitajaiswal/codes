package StringPractice;

import java.util.Scanner;

//input a string and print its length
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String str=s.nextLine();
		int l=str.length();
		System.out.print(l);
		}

}
