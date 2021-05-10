package Arrays;

import java.util.Scanner;

public class Qthree {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a number to search");
		int n=sc.nextInt();
		int f=0;
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				System.out.println(i);
				f=1;
			}
		}
		if(f==0)
		{
			System.out.println(-1);
		}
	}

}
