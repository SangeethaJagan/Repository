package week1.day2;

public class MyCalculator {
	
	public static void main(String[] args) {
		
	Calculator C=new Calculator();
	float multiplication=C.mul(10.8f, 20);
	System.out.println("Multiplication of two numbers\n"+multiplication);
	C.sub();
	
	}

}
