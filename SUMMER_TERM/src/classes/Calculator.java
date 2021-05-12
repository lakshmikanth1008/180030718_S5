package classes;

public class Calculator {
	
	static int powerInt(int num1,int num2)
	{
		return num1^num2;
	}
	static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1, num2);
	}
	public static void main(String args[])
	{
		// TODO Auto-generated constructor stub
		Calculator c= new Calculator();
		Calculator c1= new Calculator();
		System.out.println(c.powerInt(2,5));
		System.out.println(c1.powerDouble(2.5,3.5));
		
	}

}
