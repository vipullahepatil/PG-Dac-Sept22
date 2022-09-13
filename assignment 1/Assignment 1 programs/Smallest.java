import java.util.Scanner;
class Smallest{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First no:");
		int a=sc.nextInt();
		System.out.print("\nEnter Second no:");
		int b=sc.nextInt();
		System.out.print("\nEnter Third no:");
		int c=sc.nextInt();
		if(a<b & a<c)
			System.out.println("Smallest No is "+a);
		else if(b<a & b<c)
			System.out.println("Smallest No is "+b);
		else
			System.out.println("Smallest No is "+c);
}
}