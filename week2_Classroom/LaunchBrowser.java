package week2_Classroom;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Title: "+title);
		Thread.sleep(2000);
		driver.close();
		
		driver.getTitle();
		
	}
}
