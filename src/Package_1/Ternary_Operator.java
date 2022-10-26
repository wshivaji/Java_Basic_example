package Package_1;

public class Ternary_Operator {
	public static void main(String args[])
	{
		int i,k;
		i=10;
		k = i<0?-i:i;
		System.out.print("Absolute Value of ");
		System.out.println(i+" is "+k);
		i=-10;
		k=i<0?-i:i;
		System.out.print("Absolute Value of ");
		System.out.println(i+" is "+k);
		
	}
}


/* Output:
Absolute Value of 10 is 10
Absolute Value of -10 is 10
*/
