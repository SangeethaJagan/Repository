package week2Assignment_Day2;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook {

	
    
		public static void main(String[] args) {
			
			//Launching Fb
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			
			//ImplicitWait
		  	
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		   //Create New
		     driver.findElement(By.linkText("Create new account")).click();
		     driver.findElement(By.name("firstname")).sendKeys("Sangeetha");
		     driver.findElement(By.name("lastname")).sendKeys("Jagannathan");
		     driver.findElement(By.name("reg_email__")).sendKeys("9003122111");
		     driver.findElement(By.name("reg_passwd__")).sendKeys("Happylife123");
		     
		     //Day dropdown
		     WebElement dropdown1=driver.findElement(By.id("day"));
		     Select day=new Select(dropdown1);
		     day.selectByIndex(10);
		     
		     //Month dropdown
		     WebElement dropdown2=driver.findElement(By.id("month"));
		     Select month=new Select(dropdown2);
		     month.selectByValue("6");
		     
		     //Year dropddown
		     WebElement dropdown3=driver.findElement(By.id("year"));
		     Select year=new Select(dropdown3);
		     year.selectByVisibleText("1991");
		     
		     //Gender
		     driver.findElement(By.xpath("(//input[@name=\"sex\"])[1]")).click();
		     
			
		}

	}


