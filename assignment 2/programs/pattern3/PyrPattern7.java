/*
output:-
9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1

   
*/
class PyrPattern7
{
	public static void main(String args[])
	{
		int i,j;
		for(i=9;i>=1;i--)
		{
			for(j=9;j>i;j--)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(i+" ");
			System.out.println();
		}
	}
}
