package Strings;

import java.util.Scanner;

public class Qnine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		String f="";
		for (int i = 0; i < a1.length() || i < a2.length(); i++)
		{

			if (i < a1.length())
				f += a1.charAt(i);
			if (i < a2.length())
				f += a2.charAt(i);
		}
		System.out.println(f);
	}

}
