import java.util.Scanner;
class Patient
{
	static String pName;
	static double pWeight,pHeight;
	
	static double BMI()
	{
		return ((pWeight/(pHeight*pHeight))*703);
	}
}
class Patients
{
	public static void main(String[] args)
	{
		Patient p1=new Patient();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Patient Name:");
		p1.pName=sc.nextLine();
		System.out.println("Enter Patient Wieght in Pounds:");
		p1.pWeight=sc.nextDouble();
		System.out.println("Enter Patient Height in Inches:");
		p1.pHeight=sc.nextDouble();
		System.out.println("BMI of "+p1.pName+" is ="+p1.BMI());
	}
}
	