class Pattern12
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			
			for(j=1;j<=5;j++)
			{
				if((j>5-i )&(j<5+i))
					System.out.print(i+" ");
				else
					System.out.print(" ");
			}	
			System.out.println();
		}	
	}
}
/*
output-
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
*/