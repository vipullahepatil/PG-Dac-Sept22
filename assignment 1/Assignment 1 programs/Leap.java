import java.util.Scanner;
class Leap{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=sc.nextInt();
		if((num%4==0 & num%100!=0) | (num%400==0))
			System.out.print(num+" is a Leap Year");
		else
			System.out.print(num+" is a Not Leap Year");
	}
}