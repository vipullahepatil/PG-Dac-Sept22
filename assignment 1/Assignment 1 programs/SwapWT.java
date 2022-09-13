import java.util.Scanner;
class SwapWT{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter First No:");
		int n1=sc.nextInt();
		System.out.print("Enter Second No:");
		int n2=sc.nextInt();
		System.out.println("before swap n1="+n1+" n2="+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swap n1="+n1+" n2="+n2);
	}
}