package Strings;

import java.util.Scanner;

public class Qseven {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		if(s.charAt(0)=='x' && s.charAt(n-1)=='x')
		{
			System.out.println(s.substring(1,n-1));
		}
		else
		{
			System.out.println(s);
		}
	}

}
