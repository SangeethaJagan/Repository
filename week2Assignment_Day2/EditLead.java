package week2Assignment_Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class EditLead {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launching Browser
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				
				//Login
				driver.findElement(By.id("username")).sendKeys("demoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Home Page
				driver.findElement(By.partialLinkText("CRM")).click();
				
				//Click on Lead
				driver.findElement(By.linkText("Leads")).click();
				
				//implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				//Find Lead
				driver.findElement(By.partialLinkText("Find")).click();
				driver.findElement(By.xpath("(//input[contains(@name,'first')])[3]")).sendKeys("Sangeetha");
				driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Clicking on the first result
				//Taken Parent -child xpath for the first selection
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				
				
				//Print the Title
				String title=driver.getTitle();
				System.out.println("The page title is : "+title);
				
				//Edit the Details
				driver.findElement(By.xpath("//a[text()='Edit']")).click();
				WebElement Company=driver.findElement(By.xpath("//input[@id=\"updateLeadForm_companyName\"]"));
				Company.clear();
				Company.sendKeys("Oracle");
				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				
				
				//Print the title of the page
				String title2=driver.getTitle();
				System.out.println("The page title is : "+title2);
				
				//Verify the text
				String UpdateText=driver.findElement(By.id("viewLead_companyName_sp")).getText();
				
				if(UpdateText.contains("Oracle"))
				{
					System.out.println("The Company Name has been Updated");
				}
				else
				{
					System.out.println("The Company Name is not updated");
				}
				
				
				driver.close();
				
				
				
		
	}

}
