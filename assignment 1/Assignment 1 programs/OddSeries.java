import java.util.Scanner;
class OddSeries
{
	public static void main(String args[])
	{
		System.out.print("Enter A Number till where to print Odd no series:");
		int n,i;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();

		for(i=1;i<=n;i+=2)
		{
			System.out.print(i+" ");
		}
	}
}