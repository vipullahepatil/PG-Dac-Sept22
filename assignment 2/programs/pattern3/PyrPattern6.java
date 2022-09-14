/*
output:-
* * * * * * * * *
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
   
*/
class PyrPattern6
{
	public static void main(String args[])
	{
		int i,j;
		for(i=9;i>=1;i--)
		{
			for(j=9;j>i;j--)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
