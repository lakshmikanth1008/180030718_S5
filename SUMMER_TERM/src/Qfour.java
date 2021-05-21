package Strings;

import java.util.Scanner;

public class Qfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int n=a.length();
		if(n%2==0)
		{
			String s=a.substring(0,n/2);
			System.out.println(s);
		}
		else
		{
			System.out.println("null");
		}

	}

}
