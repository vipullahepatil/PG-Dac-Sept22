import java.util.Scanner;
class OneTenRec{
	public static void pr(int x,int y){
		if(x<=y){
			System.out.println(x);
			pr(++x,y);
		}
		else
			return ;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number:");
		int a=sc.nextInt();
		System.out.print("Enter Last Number:");
		int b=sc.nextInt();
		pr(a,b);
		
	}
}