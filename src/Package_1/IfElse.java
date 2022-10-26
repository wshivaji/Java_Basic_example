package Package_1;

public class IfElse {
	public static void main(String args[])
	{
		int month = 7;
		if(month == 12 | month == 1 | month == 2 ) System.out.println("This is Winter Season..!");
		else if(month == 3 | month == 4 | month == 5) System.out.println("This is Summer..!");
		else if(month == 6 | month == 7 | month == 8) System.out.println("This is Monsoon..!");
		else if(month == 9 | month == 10 | month == 11) System.out.println("This is autumn..!");
		else System.out.println("Bogus month..! Enter again");
	}
}



/* Output:
This is Monsoon..!
*/

