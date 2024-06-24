package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathLocator extends Base {

	

	public void xpathLocatorMethod()
	{
		WebElement containsXpath=driver.findElement(By.xpath("//button[contains(@id,'-one')]"));
		WebElement startwithXpath=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement textXpath=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement orXpath=driver.findElement(By.xpath("//button[text()='Show' or @id='button-one']"));
		WebElement andXpath=driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
		
		//Contains-Xpath
		
	}
	public static void main(String[] args) {
	
		XpathLocator xpathLocator=new XpathLocator();
		xpathLocator.initializeBrowser();
		xpathLocator.xpathLocatorMethod();
		xpathLocator.driverQuit();
	}

}
