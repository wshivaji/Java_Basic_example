package Package_1;

public class While_Break {
	public static void main(String args[])
	{
		int i=0;
		while(i<100)
		{
			if(i==10) break;
			System.out.println("i = "+i);
			i++;
		}
		
		
	}
}


/* Output: 

i = 0
i = 1
i = 2
i = 3
i = 4
i = 5
i = 6
i = 7
i = 8
i = 9

*/
