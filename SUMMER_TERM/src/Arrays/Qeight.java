package Arrays;
import java.util.*;
public class Qeight {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]==6 && a[i+1]==7)
			{
				continue;
			}
			else
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}
