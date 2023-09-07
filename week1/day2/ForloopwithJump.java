package week1.day2;

public class ForloopwithJump {

	
	public static void main(String[] args) {
		
	for (int i=0;i<=10;i++)
	{
		
		if(i==3)
		{
			System.out.println("Three");
			continue;
		}
		
		if(i==5)
		{
			System.out.println("Five");
			break;
		}
		System.out.println(i);
	}
	}
}
