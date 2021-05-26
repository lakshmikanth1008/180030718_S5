package Strings;

import java.util.Scanner;

public class Qone {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		sb.reverse();
		String rev=sb.toString();  
		if(s.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
