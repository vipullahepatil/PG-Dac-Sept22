/*
output:-
                9
              8 9 8
            7 8 9 8 7
          6 7 8 9 8 7 6
        5 6 7 8 9 8 7 6 5
      4 5 6 7 8 9 8 7 6 5 4
    3 4 5 6 7 8 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
   
*/
class PyrPattern5
{
	public static void main(String args[])
	{
		int i,j;
		for(i=9;i>=1;i--)
		{
			for(j=1;j<i;j++)
				System.out.print("  ");
			for(j=i;j<9;j++)
				System.out.print(j+" ");
			for(j=9;j>=i;j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
