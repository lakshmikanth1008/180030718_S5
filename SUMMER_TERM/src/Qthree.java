package Strings;

import java.util.Scanner;

public class Qthree {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.nextLine();
		String a=s.substring(0,3);
		for(int i=0;i<n;i++)
		{
			System.out.print(a);
		}
	}

}
