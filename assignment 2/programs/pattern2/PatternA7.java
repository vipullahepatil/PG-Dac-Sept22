class PatternA7
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<5;i++)
		{
			for(j=1;j<=9;j++)
			{
				if(j>5-i && j<5+i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=9;j++)
			{
				if(j>i-1 && j<=10-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
output:-
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
	
*/