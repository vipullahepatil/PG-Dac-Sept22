import java.util.Scanner;
class AddTwoWOper
{
	public static void main(String args[])
	{
		System.out.print("Enter two No:");
		int a,b,i=1;
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		while(i<=b)
		{
			a++;
			i++;
		}
		System.out.print("sum="+a);
	}
}