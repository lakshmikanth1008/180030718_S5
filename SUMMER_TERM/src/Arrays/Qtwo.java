package Arrays;

public class Qtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,64,24,15,20};
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum is:"+min);
		System.out.println("Maximum is:"+max);

	}

}
