import java.util.Scanner;
class GCD
{
	public static void main(String args[])
	{
		System.out.print("Enter Two No:");
		Scanner sc =new Scanner(System.in);
		int a,b;              // a=4  b=8
		a=sc.nextInt();
		b=sc.nextInt();
		if(b>a)          //8>4 true  | 13 >5             |a=4 >b=0
		{
			int temp=a;   //temp= 4  | 5                 |
			a=b;          //a=8      | 13                |
			b=temp;       //b=4      | 5                 |
		}
		int rem=b;        //rem=4    | 5                 |rem=0
		while(rem!=0)
			{             //1st       1st  2nd 3rd 4th loop
				b=rem;    // b=4     | 5    3   2   1 |
				rem=a%b;  // rem=0   | 3    2   1   0 |
				a=b;      // a=4     | 5    3   2   1 |
			}
		System.out.println("GCD="+a); //a
	}
}