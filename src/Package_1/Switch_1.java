package Package_1;

public class Switch_1 {
	public static void main(String args[])
	{
		for(int i = 0; i<6; i++ )
		{
			switch(i)
			{
			case 0:
				System.out.println("i is zero: "+i);
				break;
			case 1: 
				System.out.println("i is One: "+i);
				break;
			case 2: 
				System.out.println("i is Two: "+i);
				break;
			case 3:
				System.out.println("i is Three: "+i);
				break;
			case 4: 
				System.out.println("i is Four: "+i);
				break;
			default:
				System.out.println("i is greater than 4");
			}
			
		}
	}
}

/* Output:
i is zero: 0
i is One: 1
i is Two: 2
i is Three: 3
i is Four: 4
i is greater than 4
*/
