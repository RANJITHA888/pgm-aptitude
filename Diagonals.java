class Diagonals
{
	public static void main(String a[])
	{
   		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
			if((i==j ||i+j==4))
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}	
			}
			System.out.println();

		}
	}
}