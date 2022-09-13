import java.util.Scanner;
class Fact{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=sc.nextInt();
		int i,fact=1;
		if(num==0)
			System.out.println("factorial of "+num+" is="+fact);
		else
		{
			for(i=num;i>0;i--)
				fact=fact*i;
		}
		System.out.println("factorial of "+num+" is="+fact);
		}
}