import java.util.Scanner;
class Q6Temp
{
	static void c_To_f()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temprature:");
		float c=sc.nextFloat();
		float temp=(float)((c*(9.0f/5))+32.0f);
		System.out.println("Enter Temprature in Fahrenheit is:"+temp);	
	}
	static void f_To_c()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temprature:");
		float f=sc.nextFloat();
		float temp=((f-32)*5)/9;
		System.out.println("Enter Temprature in celccius is:"+temp);	
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("If you want to convert temp from celccius to fahrenheit Enter 1");
		System.out.println("If you want to convert temp from fahrenheit to celccius Enter 2");
		int x=sc.nextInt();
		switch(x)
		{
			case 1:
				c_To_f();
				break;
			case 2:
				f_To_c();
				break;
			default:
				System.out.println("Enter Valid No");
				break;
		}
	}
}