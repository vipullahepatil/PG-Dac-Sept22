import java.util.Scanner;
class Q4Si    //A=P(1+rt)
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No of Principle amount:");
		float principleAmount=sc.nextFloat();
		
		System.out.println("Enter No of Rate of Interest:");
		float rateOfInterest=sc.nextFloat();
		
		System.out.println("Enter No of Years:");
		float time=sc.nextFloat();
		
		float intrest=principleAmount*rateOfInterest*time/100;
		System.out.println("The Intrest amount is :"+intrest);
		
		float total=principleAmount+intrest;
		System.out.println("The Final amount is :"+total);
	}
}