class RightTri
{
	public static void main(String a[])
	{
		int n=5;
   		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j||j==0||i==n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
