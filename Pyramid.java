package com.xworkz.xworkzapp.pvr;

public class Pyramid {

		public static void main(String a[])
		{
		Diamond d=new Diamond();
	          d.triangle(5);
		}
	        void triangle(int n)
			{
	        	int mid=n/2;
	   		for(int i=0;i<n;i++)
				{
				for(int j=0;j<n;j++)
					{
					if(i+j==mid||j-i==mid||i==mid)
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




