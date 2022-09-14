class Pattern18
{
	public static void main(String args[])
	{
		int i,j;
		
		for(i=5;i>=1;i--)
		{
			char a=65;
			for(j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
}
/*
output:-
A B C D E
A B C D
A B C
A B
A
*/