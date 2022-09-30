import java.util.Scanner;
class Q5YearToDay  
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Days:");
		int day=sc.nextInt();
		int carry1=day%365;
		int year=day/365;
		
		day=carry1%30;
		int month=carry1/30;
		
		System.out.println("Years :"+year+"\nMonths :"+month+"\ndays :"+day);
		
	}
}