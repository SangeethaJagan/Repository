package week1.Assignment;

public class FibonacciSeries {
	
	public void Fibonnaci()
	{
	int n1=0;
	int n2=1;
	int n3;
	System.out.println(n1);
	//System.out.println(n2);
	for(int i=1;i<11;i++)
	{
		
	
	n3=n1+n2;
	if(n3<56)
	{
	System.out.println(n3);
	n1=n2;
	n2=n3;
	}	
	}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Fibonacci Series");
		System.out.println("========= ======\n");
	     FibonacciSeries F=new FibonacciSeries();
	     F.Fibonnaci();
	}
		

			
		
		
	}

