package Arrays;
import java.util.*;
public class Qfive {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp;
		for (int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Largest two numbers: "+a[n-1]+" "+a[n-2]);
		System.out.print("\n");
		System.out.print("Largest two numbers: "+a[0]+" "+a[1]);
		
	}

}
