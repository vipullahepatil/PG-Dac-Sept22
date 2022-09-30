import java.util.Scanner;
class Q2Circle
{
	static void area(float r)
	{
		double area=3.14*r*r;
		System.out.println("Area of circle is = "+area);
	}
	static void cirm(float r)
	{
		double cirm=2*3.14*r;
		System.out.println("Circumferance of circle is = "+cirm);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle :");
		float r=sc.nextFloat();
		
		while(true)
		{
			System.out.println("Enter 1 for Area of circle");
			System.out.println("Enter 2 for Circumferance of circle");
			System.out.println("Enter 3 for exit");
			int x=sc.nextInt();
			switch(x)
			{
				case 1:
					area(r);
					break;
				case 2:
					cirm(r);
					break;
				case 3:
					System.out.println("Thank You");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Entry");
					break;
			}
		}
	}
}