package Strings;

import java.util.Scanner;

public class Qsix {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		int n=s.length();
		int m=s1.length();
		if(n>m)
		{
			System.out.println(s+s1+s);
		}
		else
		{
			System.out.println(s1+s+s1);
		}
	}
}
