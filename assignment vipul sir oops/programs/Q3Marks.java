import java.util.Scanner;
class Q3Marks
{
	static float tot(float a[])
	{
		float tot=0;
		for(int i=0;i<a.length;i++)
		{
			tot=tot+a[i];
		}
		return tot;
	}
	static float perc(float t,int s)
	{
		float prec=t/s;
		return prec;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Subjects:");
		int s=sc.nextInt();
		float arr[]=new float[s];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Subjects"+(i+1)+"marks:");
			float m=sc.nextFloat();
			arr[i]=m;
		}
		float total=tot(arr);
		System.out.println("Total = "+total);
		float percentage=perc(total,s);
		System.out.println("Percentage = "+(int)percentage+" %");
	}
}