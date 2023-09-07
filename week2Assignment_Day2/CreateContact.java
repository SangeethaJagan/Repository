package week2Assignment_Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	
public static void main(String[] args) {
		
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
		
		//Click on Contact
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Creating Lead
		
		driver.findElement(By.id("firstNameField")).sendKeys("Sangeetha");
		driver.findElement(By.id("lastNameField")).sendKeys("Jagannathan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sangee");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("J");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Automation-Selenium Webdriver Testing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ssangitha01@gmail.com");
		
		//dropdown selection
		WebElement dropdown=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select S=new Select(dropdown);
		S.selectByVisibleText("New York");
		
		//Click on Create 
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Print the Title
		String title=driver.getTitle();
		System.out.println("The page title is :"+title);
		
			


}
}
