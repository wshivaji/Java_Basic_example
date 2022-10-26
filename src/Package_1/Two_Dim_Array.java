package Package_1;

public class Two_Dim_Array {
	public static void main(String args[])
		{
			int TowD[][] = new int[3][4];
			int i, j, k=0;
			for(i=0;i<3;i++)
				for(j=0;j<4;j++)
				{
					TowD[i][j] = k;
					k++;
				}
			
				
			for(i=0;i<3;i++)
			{
				for(j=0;j<4;j++)
					System.out.print(TowD[i][j]+" ");
				System.out.println(" ");
			}
				
				
		}
}


/* Output:
0 1 2 3  
4 5 6 7  
8 9 10 11
*/
