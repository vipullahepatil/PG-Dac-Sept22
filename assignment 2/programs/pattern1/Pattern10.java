class Pattern10
{
	public static void main(String args[])
	{
		int i,j;
		for(i=5;i>=1;i--)
		{
			char A=65;
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
				A++;
			}
			A--;	
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
     E
    D E
   C D E
  B C D E
 A B C D E
*/