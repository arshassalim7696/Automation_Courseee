package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public WebDriver driver;  //declared globally
	public void initializeBrowser()
	{
		driver =new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();//maximixe chyn
		
	}
	public void driverQuit()   //Separate method to close all tabs and session terminates 
	{
	driver.quit();	
	}
	public void driverClose()    
	{
	driver.close();	
	}
	public static void main(String[] args) {
		Base base=new Base();
		base.initializeBrowser();
		base.driverQuit();

	}

}