import java.util.Scanner;
public class Qfive {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char n=sc.next().charAt(0);
		if((n>=65 && n<=90)||(n>=97 && n<=122))
		{
			System.out.println("Alphabet");
		}
		else if(n>=48 && n<=57)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
	}
	

}
