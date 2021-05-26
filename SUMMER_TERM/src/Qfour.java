import java.util.Scanner;
public class Qfour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a=sc.nextLine().charAt(0);
		char b=sc.nextLine().charAt(0);
		if(a>b)
		{
			System.out.println(b+" "+a);
		}
		else
		{
			System.out.println(a+" "+b);
		}
		
		

	}

}
