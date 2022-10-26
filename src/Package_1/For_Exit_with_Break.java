package Package_1;

public class For_Exit_with_Break {
	public static void main(String args[])
	{
		for(int i = 0; i<100; i++)
		{
			if(i==10) break;
			System.out.println("i = "+i);
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