package Package_1;

public class Modulus {
	public static void main(String args[])
	{
		int x = 42;
		double y = 42.25;
		double z = 55.55;
		
		// Mod 10
		System.out.println("X Mod 10: "+x%10);
		System.out.println("Y Mod 10: "+y%10);
		System.out.println("Z Mod 10: "+z%10);
		
		
		//Mod 2
		System.out.println("X Mod 2: "+x%2);
		System.out.println("Y Mod 2: "+y%2);
		System.out.println("Z Mod 2: "+z%2);
		
	}
}

/* Output:
X Mod 10: 2
Y Mod 10: 2.25
Z Mod 10: 5.549999999999997
X Mod 2: 0
Y Mod 2: 0.25
Z Mod 2: 1.5499999999999972
*/
