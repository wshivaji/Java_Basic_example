package Package_1;

public class Type_Conversion {
	public static void main(String args[])
	{
		byte b;
		int i = 257;
		double d = 323.142;
		System.out.println("\n Conversion of int to byte");
		b = (byte)i;
		System.out.println("i And b: "+i+" "+b);
		System.out.println("\n Conversion of double to int");
		i = (int) d;
		System.out.println("i And d: "+i+" "+d);
		System.out.println("\n Conversion of double to byte");
		b = (byte)d;
		System.out.println("b And d: "+b+" "+d);
	}

}


/* Output:
Conversion of int to byte
i And b: 257 1

Conversion of double to int
i And d: 323 323.142

Conversion of double to byte
b And d: 67 323.142
*/

