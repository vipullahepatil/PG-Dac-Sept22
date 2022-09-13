import java.util.Scanner;
class PrimeFact
{
	public static void main(String args[])
	{
		System.out.print("Enter a Number:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		System.out.print("Prime Factor of Number:");
		while(n!=1)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}	
			else
				i++;	
		}	
	}
}	