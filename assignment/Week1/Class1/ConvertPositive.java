package assignment.Week1.Class1;

import java.util.Scanner;



public class ConvertPositive {
	
	
	private void convert() {
		// TODO Auto-generated method stub
		int Negno=-40;
		int PosNo;
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a Negative number\n");
		//Negno=sc.nextInt();
		
		
		if (Negno<0)
		{
			PosNo=Math.abs(Negno);
			System.out.println("\nThe Number "+Negno+" is converted to"+PosNo);
			
		
			
		}
		
		
	}
	
	public static void main(String[] args) {
		ConvertPositive C =new ConvertPositive();
		C.convert();
	}

}
