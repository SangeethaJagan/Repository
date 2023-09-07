package week2_Assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
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
		
		//Click on Leads
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Creating Lead
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangeetha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jagannathan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sangee");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Automation-Selenium Webdriver Testing");
		driver.findElement(By.name("primaryEmail")).sendKeys("ssangitha01@gmail.com");
		
		//dropdown selection
		WebElement dropdown=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select S=new Select(dropdown);
		S.selectByVisibleText("New York");
		
		//Click on Create 
		driver.findElement(By.name("submitButton")).click();
		
		//Print the Title
		String title=driver.getTitle();
		System.out.println("The page title is :"+title);
		
			
	}

}
