package Strings;

import java.util.Scanner;

public class Qfive {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		String a=s.substring(1,n-1);
		System.out.println(a);
	}
}
