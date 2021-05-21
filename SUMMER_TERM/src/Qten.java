package Strings;

import java.util.Scanner;

public class Qten {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int n=sc.nextInt();
		int m=a.length();
		String s1=a.substring(m-n,m);
		for(int i=0;i<n;i++)
		{
			System.out.print(s1);
		}
	}

}
