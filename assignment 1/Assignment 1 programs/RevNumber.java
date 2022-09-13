import java.util.Scanner;
class RevNumber
{
	public static void main(String args[])
	{
		System.out.print("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int n1= sc.nextInt();
		int digit,revNo=0;
		while(n1>0)
		{
			digit=n1%10;
			revNo = revNo * 10 + digit;
			n1=n1/10;
		}
		System.out.print("Reverse Number:"+revNo);
		sc.close();
	}
}