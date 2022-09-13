import java.util.Scanner;
class Factors{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=sc.nextInt();
		int i;
		System.out.println("Factors of "+num);
		for(i=1;i<=num;i++){
			if(num%i==0)
				System.out.println(i);
		}
	}
}