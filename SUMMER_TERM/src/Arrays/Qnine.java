package Arrays;
import java.util.*;
public class Qnine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<4)
		{
			System.out.println("Please enter 4 numbers");
		}
		else
		{
		int a[][]=new int[n][n];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The given array is:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The reverse of array is:");
	    for(int i=1;i>=0;i--)
	    {
	        for(int j=1;j>=0;j--)
	        {
	        System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	        
	    }
		}
	}

}
