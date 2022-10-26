package Package_1;

public class DoWhile {
	public static void main(String args[]) {
		int n = 10;
		System.out.println("************************************");
		do {
			System.out.println("Tick: "+n);
			--n;
		}while(n>0);
		
		
		
		System.out.println("************************************");
		
		n = 10;
		
		do {
			System.out.println("Tick: "+n);
			
		}while(--n>0);
		
		System.out.println("************************************");
		
	}
}


/* Output:
************************************
Tick: 10
Tick: 9
Tick: 8
Tick: 7
Tick: 6
Tick: 5
Tick: 4
Tick: 3
Tick: 2
Tick: 1
************************************
Tick: 10
Tick: 9
Tick: 8
Tick: 7
Tick: 6
Tick: 5
Tick: 4
Tick: 3
Tick: 2
Tick: 1
************************************
*/


