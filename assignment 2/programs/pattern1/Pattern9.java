class Pattern9
{
	public static void main(String args[])
	{
		int i,j;
		for(i=5;i>=1;i--)
		{
			char A=65;
			for(j=1;j<i;j++)
				System.out.print(" ");
			for(j=i;j<=5;j++)
			{
				System.out.print(A+" ");
				A++;
			}
			
			
			System.out.println();
		}
			
	}
}
/*
output-
    A
   A B
  A B C
 A B C D
A B C D E
*/