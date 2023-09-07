package selCheck;

import java.util.Scanner;

public class FactorialCheck {
	
	public void calcFact()
	{
		int fact,value;
		System.out.println("Enter the number to calculate factorial");
		Scanner sc=new Scanner(System.in);
		fact=sc.nextInt();
		value=fact;
		for (int i=value-1;i>1;i--)
		{
			fact=fact*i;
		}
		System.out.println("\nFactorial Value: "+fact);
	}

	public static void main(String[] args) {
		FactorialCheck F=new FactorialCheck();
		F.calcFact();
	}
}
