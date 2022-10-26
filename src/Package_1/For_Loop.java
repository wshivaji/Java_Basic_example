package Package_1;

public class For_Loop {
	public static void main(String args[])
	{
		boolean done = true;
		
		for(int i = 0; done; i++)
		{
			System.out.println("i = "+i);
			if(i==8)
			{
				done = false;
			}
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



*/