/*
output:-
    *
   **
  * *
 *  *
*****
   
*/
class PatternA16
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=(5-i);j++)
				System.out.print(" ");
			for(j=1;j<=i;j++)// Not Solved yet
			{
				if(j==1 || i==j  ||  i==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
