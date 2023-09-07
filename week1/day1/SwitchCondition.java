package week1.day1;

public class SwitchCondition {
	
	public static void main(String[] args) {
		String browser="Chrome";
		
		switch (browser)
		{
			case "Chrome":
			System.out.println("Chrome browser should be open");
			break;
			
			case "Edge":
			System.out.println("Edge browser should be open");
			break;
			
			default:
			System.out.println("IE browser");
			break; 
		}
	}

}
