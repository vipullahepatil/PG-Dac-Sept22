import java.util.Scanner;
class Palindrome
{
	public static void main(String argc[])
	{
		System.out.print("Enter a Number:");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int sum=0,digit,n2=n1;
		while(n1!=0)
		{
			digit=n1%10;
			n1=n1/10;
			sum=sum*10+digit;
		}
		if(sum==n2)
			System.out.println("This is a Palindrome Number");
		else
			System.out.println("This is Not Palindrome Number");
	}
}