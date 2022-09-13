import java.util.Scanner;
class SumDigi{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=sc.nextInt();
		int rem,n=num;
		int sum=0;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.print("Sum of Digit of Number "+n+" is "+sum);
	}
}