import java.util.Scanner;
class Q8Salary
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your salary");
		float bs=sc.nextInt();
		if(bs<10000)
		{
			float hra=bs*(10.0f/100);
			float da=bs*(90.0f/100);
			float gs=bs+da+hra;
			System.out.println("Your Gross Salary is="+gs);
		}
		else if(bs>=10000)
		{
			float hra=2000;
			float da=bs*(98.0f/100);
			float gs=bs+da+hra;
			System.out.println("Your Gross Salary is="+gs);
		}
		else
			System.out.println("Your Gross Salary is=0");
	}
}