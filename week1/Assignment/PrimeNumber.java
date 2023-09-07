package week1.Assignment;

public class PrimeNumber {

	
	private void prime() {
		// TODO Auto-generated method stub
		int num=89;
		int flag = 0;
		
		for (int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				flag=0;
				
			}
			else
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("Given number "+num+" is a prime number");
		}
		else
		{
			System.out.println("Given number "+num+" is not a prime number");
		}

	}
	public static void main(String[] args) {
		PrimeNumber P=new PrimeNumber();
		P.prime();
		
	}
}
