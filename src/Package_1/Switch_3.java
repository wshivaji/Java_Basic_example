package Package_1;

public class Switch_3 {
	public static void main(String args[])
	{
		int month = 7;
		switch(month){
		case 12:
		case 1:
		case 2:
			System.out.println("This is Winter..!");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("This is Summer..!");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("This is Monsoon..!");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("This is Autumn..!");
			break;
		default:
			System.out.println("This is wrong month, enter again..!");	
		}
	}
}

// Output: This is Monsoon..!

