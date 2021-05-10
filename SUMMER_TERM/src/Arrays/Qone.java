package Arrays;
import java.io.*;
import java.util.*;
public class Qone {
	public static void main(String args[])
	{
		int a[]= {3,64,24,15,20};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		float avg=sum/a.length;
		System.out.println("Sum is:"+sum);
		System.out.println("Average is:"+avg);
		
	}

}
