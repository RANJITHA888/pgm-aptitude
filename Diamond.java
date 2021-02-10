package com.xworkz.xworkzapp.pvr;

public class Diamond 
	{
		public static void main(String a[])
		{
		Diamond d=new Diamond();
	          d.triangle(7);
		}
	        void triangle(int n)
			{
			int mid=n/2;
	   		for(int i=0;i<n;i++)
				{
				for(int j=0;j<n;j++)
					{
					if(i+j==mid || i-j==mid || j-i==mid ||i+j==mid*3)
					{
						System.out.print("* ");
						}
				           else
						System.out.print("  ");  
						}
				System.out.println();
			}
		}
	}


