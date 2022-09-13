import java.util.Scanner;
class FactRec{
	public static int fact(int n){    //factorial method
		if(n>1)
			return n*fact(n-1);
		else
			return n;
	}
	public static void main(String args[]){  // main function
	Scanner sc=new Scanner(System.in);	
	System.out.print("Enter a Number:");
	int num= sc.nextInt();
	int factorial=1;
	if(num==0)
		System.out.print("Factorial of "+num+" is = "+factorial);
	else
	{
		factorial=fact(num);
		System.out.print("Factorial of "+num+" is = "+factorial);
	}
	}
}