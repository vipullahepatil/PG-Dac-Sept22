import java.util.Scanner;
class LcmCmm
{
	public static void main(String args[])
	{
		System.out.print("Enter Two No:");
		Scanner sc =new Scanner(System.in);
		int a,b;                //a=6,b=9 
		a=sc.nextInt();        
		b=sc.nextInt();
		int [] arr=new int[b];  // arr=int[9]
		for(int i=0;i<=(b-1);i++)//i<8 
			arr[i]=a*(i+1);      //arr[0]=6*1=6,arr[1]=6*2=12,arr[2]=6*3=18....
		
		int [] brr=new int[a];    //brr=int[6]
		for(int i=0;i<=(a-1);i++) //i<=5
			brr[i]=b*(i+1);       //brr[0]=9*1=9,brr[1]=9*2=18,
		int i=0,j=0;          //arr=6,12,18,....  brr=9,18,....
		
		while(arr[i]!=brr[j]) //  6!=9|12!=9  |12!=18  |  18==18
		{
			if(arr[i]<brr[j])//  6<9  |  12<9 |12<18   |
				i++;         // arr 12|       |arr 18
			else
				j++;         //       |brr 18
		}
		System.out.println("Lcm="+arr[i]); //print 18
	}
}