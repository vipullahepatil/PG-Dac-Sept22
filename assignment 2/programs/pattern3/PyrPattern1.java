/*
output:-
         1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
   
*/
class PyrPattern1
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=9;j>=i;j--)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(i+" ");
			System.out.println();
		}
	}
}
