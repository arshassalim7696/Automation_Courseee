package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathLocator extends Base {

	

	public void xpathLocatorMethod()
	{
		//contains
		WebElement containsXpath=driver.findElement(By.xpath("//button[contains(@id,'-one')]"));
		
		//starts-with
		WebElement startwithXpath=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		
		//text()
		WebElement textXpath=driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		//or
		WebElement orXpath=driver.findElement(By.xpath("//button[text()='Show' or @id='button-one']"));
		
		//and
		WebElement andXpath=driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
		
		//axes Method
		//following
		 WebElement XpathFollowing=driver.findElement(By.xpath("//div[@id='message-one']//following::button[@id='button-two']")); 

		 //Preceding
         WebElement XpathPreceding=driver.findElement(By.xpath("//div[@id='message-one']//preceding::button[@id='button-one']")); 

         //shortcut to identify parent 
         WebElement XpathParent=driver.findElement(By.xpath("//button[@id='button-one']/..")); 

         //parent
         WebElement XpathParentMethod=driver.findElement(By.xpath("//button[@id='button-one']//parent::form")); 

         //child
         WebElement XpathChild=driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-one']")); 

         //ancestor
         WebElement XpathAncestor=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='card']")); 
        
         //Descendant
         WebElement XpathDescendant=driver.findElement(By.xpath("//div[@class='form-group']//descendant::label[@for='inputEmail4']")); 
        
         //following-sibling
         WebElement Xpathfollowing_sibling=driver.findElement(By.xpath("//label[@for='inputEmail4']//following-sibling::input")); 

         //preceding-sibling
         WebElement Xpathpreceding_sibling=driver.findElement(By.xpath("//input[@id='single-input-field']//preceding-sibling::label[@for='inputEmail4']")); 

         
	}
	public static void main(String[] args) { 
	
		XpathLocator xpathLocator=new XpathLocator();
		xpathLocator.initializeBrowser();
		xpathLocator.xpathLocatorMethod();
		xpathLocator.driverQuit();
	}

}
