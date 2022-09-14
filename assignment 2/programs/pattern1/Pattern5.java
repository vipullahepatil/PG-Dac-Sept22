class Pattern5
{
	public static void main(String args[])
	{
		int i,j;
		char A=65;
		for(i=1;i<=5;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				System.out.print(A+" ");
				
			}
			A++;
			System.out.println();
		}
			
	}
}
/*
output-
A
B B
C C C
D D D D
E E E E E

*/