class Pattern13
{
	public static void main(String args[])
	{
		int i,j;
		char a=65;
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)
				System.out.print(" ");
			for(j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				
			}
			a++;
			System.out.println();
		}
	}
}
/*
output:-
    A
   B B
  C C C
 D D D D
E E E E E

*/