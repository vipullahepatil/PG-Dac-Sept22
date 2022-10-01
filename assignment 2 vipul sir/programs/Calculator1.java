import java.math.*;
class Calculator
{
	static int powerInt(int num1,int num2)
	{
		return (int)Math.pow(num1,num2);
	}
	static double powerDouble(double num1,int num2) 
	{
		return Math.pow(num1,num2);
	}	
}
public class Calculator1
{
	public static void main(String[] args)
	{
		//Calculator c =new Calculator();
		int a=10,b=5,d=3;
		double c=5.5;
		System.out.println(Calculator.powerInt(a,b));
		System.out.println(Calculator.powerDouble(c,d));
	}
}