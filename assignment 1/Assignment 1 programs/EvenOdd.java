
// program check odd even number
import java.util.Scanner;
class EvenOdd{
	public static void main(String args[]){
		System.out.print("enter a number");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		if(num<0)
			System.out.println("No is Negative");
		else
			System.out.println("No is Positive");
	}

}
	