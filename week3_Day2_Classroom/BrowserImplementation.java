package week3_Day2_Classroom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserImplementation implements Browser  {

	
	public RemoteWebDriver driver;
	@Override
	public void startApp() {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		
		
		
	}

	@Override
	public void startApp(String Browser) {
		// TODO Auto-generated method stub
		
		switch(Browser)
		{
		case "chrome":
			driver=new ChromeDriver();
		    break;
		    
		case "edge":
			driver=new EdgeDriver();
			break;
			
		case "firefox":
		    driver=new FirefoxDriver();
		    break;
		
		case "ie":
		   driver=new InternetExplorerDriver();
		   break; 
		   
		default:
			break;
		}
	

}

		
		   
		
	}
	



