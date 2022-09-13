import java.util.Scanner;
class PosNeg{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=sc.nextInt();
		if(num<0)
			System.out.print(num+" is a Negative Number");
		else
			System.out.print(num+" is a Positive Number");
	}
}