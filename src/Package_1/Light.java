package Package_1;

public class Light {
	
	public static void main(String args[])
		{
			int lightspeed;
			
			long days;
			long seconds;
			long distance;
			
			lightspeed = 186000;
			days = 1000;
			seconds = days * 24 *60 *60;
			distance = lightspeed * seconds;
			System.out.print("In "+days);
			System.out.print(" Days Light will Travel About: ");
			System.out.print(distance+" miles. ");
		}

}

//Output:  In 1000 Days Light will Travel About: 16070400000000 miles. 


