package selCheck;

public class ReverseNumber {
	
	public void Reverse() {
		// TODO Auto-generated constructor stub
		int num=12345;
		int Reverse=0;
		int remainder;
		while (num!=0)
		{
		remainder=num%10;
		Reverse=Reverse*10+remainder;
		num=num/10;
		
		
		}
		System.out.println("Reversed number "+Reverse);
	}
	public static void main(String[] args) {
		
	    ReverseNumber R=new ReverseNumber();
	    R.Reverse();
	}

}
