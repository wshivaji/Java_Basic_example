package Package_1;

public class DoWhile_1 {
	public static void main(String args[]) throws java.io.IOException
	{
		char Choice;
		do {
			System.out.println("Select Choice from Below: ");
			System.out.print(" 1. if\n 2. switch\n 3. while\n 4. do-while\n 5. for\n");
			Choice = (char)System.in.read();
		}while(Choice < '1' || Choice > '5');
		System.out.print("Your Choice: "+Choice);
		
		switch(Choice) {
		case '1':
			System.out.println("\nif(condition){");
			System.out.print("Statement 1...\nStatement 2...\n Statement 3...\n}");
			break;
		case '2':
			System.out.println("\nswitch(choice){");
			System.out.print("case 1: \n Statement 1...\n Stateement 2...\n Staetment 3...\n break;\n");
			System.out.print("Case 2: \n Staetement 1..\n Staement 2... \n Statement 3...\n break;\n");
			System.out.print("default: \n Staetement 1...\n break; \n}");
			break;
		case '3': 
			System.out.println("\nwhile(condition){");
			System.out.print("Statement 1...\n Statement 2...\n Statement 3...\n}");
			break;
		case '4':
			System.out.println("\ndo{");
			System.out.print("Statement 1..\n Statement 2...\n Statement 3...\n}");
			System.out.println("while(condition); \n");
			break;
		case '5':
			System.out.println("\nfor(initialization;condition;increment/decrement){\n");
			System.out.print("Statement 1...\n Statement 2...\n Statement 3...\n}");
			break;
		default:
			System.out.println("\nEnter valid Choice..!");
		}
	}
}



/* Output:

Select Choice from Below: 
	 1. if
	 2. switch
	 3. while
	 4. do-while
	 5. for

*/



