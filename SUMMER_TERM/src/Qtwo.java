package Strings;

import java.util.Scanner;

public class Qtwo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int n=a.length();
		String a1=null,a2 = null; 
		for(int i=0;i<n;i++)
		{
			if(a.charAt(i)==',')
			{
				a1=a.substring(0,i);
				a2=a.substring(i+1,n);
			}
			else
			{
				continue;
			}
		}
		a1=a1.toLowerCase();
		a2=a2.toLowerCase();
		System.out.print(a1+" "+a2);
	}

}
