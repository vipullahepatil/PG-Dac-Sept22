class Pattern16
{
	public static void main(String args[])
	{
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
/*
output:-
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/