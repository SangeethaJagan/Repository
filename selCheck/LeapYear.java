package selCheck;

import java.util.Scanner;

public class LeapYear {
	
	public void leapCheck()
	{
		System.out.println("Enter the year to check the leap");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Entered year :"+a);
		
		if (((a%4==0) && (a%100!=0)) || (a%400==0))
		
		{
			System.out.println("Entered year is a leap year");
		}
		else
		{
			System.out.println("Entered year is not a leap year");
		}
		sc.close();
		
		
	}

	public static void main(String[] args) {
		LeapYear L=new LeapYear();
		L.leapCheck();
	}
}
