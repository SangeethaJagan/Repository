package assignment.Week1.Class1;

public class PositiveorNegative {

	public void type()
	{
		int i=35;
		if(i>0)
		System.out.println("The number is Positive");
		else if (i<0)
		System.out.println("The number is Negative");
		else if(i==0)
		System.out.println("The number is neither positive nor negative");
	}
	
	public static void main(String[] args) {
	  PositiveorNegative P=new PositiveorNegative();
	  P.type();
	  
	}
}
