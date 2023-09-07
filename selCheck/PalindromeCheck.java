package selCheck;

import java.util.Scanner;

public class PalindromeCheck {
	
	public void palindrome()
	{
		int num;
		int sum=0;
		int r;
		System.out.println("Enter the number to check the Palindrome");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int temp=num;
		while (num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if (temp==sum)
		{
			System.out.println("Palindrome");
			
		}
		else
		{
			System.out.println("not a palindrome");
		}
		sc.close();
	}
	public static void main(String[] args) {
		PalindromeCheck P=new PalindromeCheck();
		P.palindrome();
	}

}
