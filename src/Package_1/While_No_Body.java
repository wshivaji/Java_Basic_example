package Package_1;

public class While_No_Body {
	public static void main(String args[])
	{
		int i,j;
		i=100;
		j=200;
		
		while(++i < --j);
		System.out.println("Mid Point: "+i+ "  "+j);
	}
}

//Output: Mid Point: 150  150
