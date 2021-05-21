package Strings;

import java.util.Scanner;

public class Qeight {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		String a=null,b=null;
		if(s.charAt(0)=='@')
		{
			String s1=s.substring(2,n);
			System.out.println(s1);
		}
		else if(s.charAt(1)=='@')
		{
			String s1=s.substring(3,n);
			System.out.println(s1);
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(s.charAt(i)=='@')
				{
					a=s.substring(0,i-1);
					b=s.substring(i+1,n);
				}
				else
				{
					continue;
				}

			}
			System.out.println(a+b);
			
		}
	}
}
