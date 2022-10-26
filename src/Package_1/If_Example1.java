package Package_1;

public class If_Example1 {
	public static void main(String args[])
		{
			int x, y;
			x = 10;
			y = 20;
			if(x<y) System.out.println("X is less than y...!     x: "+x+" y: "+y);
			
			x = x*2;
			if(x==y) System.out.println("x is equal to y...!      x: "+x+" y: "+y);
			
			x = x*2;
			if(x>y) System.out.println("x is greater than y...!  x: "+x+" y: "+y);
			
		}

}


/* Output:

X is less than y...!     x: 10 y: 20
x is equal to y...!      x: 20 y: 20
x is greater than y...!  x: 40 y: 20

*/




