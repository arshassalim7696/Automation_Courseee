package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsMethod extends Base {

	
	
	public void locatorsMechanism()
	
	{
	//locators
		
	WebElement showMessageButtonID=driver.findElement(By.id("button-one"));
	WebElement classNameclearFix=driver.findElement(By.className("clearfix"));
	WebElement getTotalButtonID=driver.findElement(By.id("button-two"));
	WebElement checkBoxlinkText=driver.findElement(By.linkText("Checkbox Demo"));
	WebElement checkBoxPartiallinkText=driver.findElement(By.partialLinkText("Checkbox"));
	WebElement nameElement=driver.findElement(By.name("viewport"));
	WebElement tagNameElement=driver.findElement(By.tagName("title"));
	
	//css selector
	WebElement tagandId =driver.findElement(By.cssSelector("button#button-one"));
	WebElement tagandClass =driver.findElement(By.cssSelector("section.clearfix"));
	WebElement tagandAttribute=driver.findElement(By.cssSelector("button[data-target='#collapsibleNavbar']"));
	
	//xpath
	WebElement xPath=driver.findElement(By.xpath("//button[@id='button-one']"));

	driver.navigate().to("https://www.amazon.com");//navigating to amzon
	// driver.navigate().back(); //back to qabible
    //driver.navigate().forward();//back to amazon*/
	
	//Element by ID 
	
	WebElement searchButtonID=driver.findElement(By.id("nav-search-submit-button"));
	WebElement locIconID=driver.findElement(By.id("nav-packard-glow-loc-icon"));
	WebElement helloSigninID=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	WebElement searchDropDownID=driver.findElement(By.id("searchDropdownDescription"));
	WebElement delivertoTextID=driver.findElement(By.id("glow-ingress-line1"));
	WebElement indiaTextID=driver.findElement(By.id("glow-ingress-line2"));

	//Element by class   
	 WebElement logoClass=driver.findElement(By.className("nav-logo-locale"));
	 WebElement helloSiginClass=driver.findElement(By.className("nav-line-1-container"));
	 WebElement backtotopClass=driver.findElement(By.className("navFooterBackToTopText"));
	 WebElement allClass=driver.findElement(By.className("hm-icon-label"));
	 WebElement containerDesktopClass=driver.findElement(By.className("icp-container-desktop"));
	 
	 //Element by tagname
	 WebElement allTextTagName=driver.findElement(By.tagName("span"));
	 WebElement todayDealTagName=driver.findElement(By.tagName("a"));
	 WebElement enTagName=driver.findElement(By.tagName("div"));
	  
		
	 //Element by linktext
	 WebElement careerslinkText=driver.findElement(By.linkText("Careers"));
	 WebElement bloglinkText=driver.findElement(By.linkText("Blog"));
	 WebElement aboutAmazonlinkText=driver.findElement(By.linkText("About Amazon"));
	 WebElement investorRelationlinkText=driver.findElement(By.linkText("Investor Relations"));
	 WebElement amazonDevicelinkText=driver.findElement(By.linkText("Amazon Devices"));
		
	//Element by patiallinktext
	 WebElement shopWithPartiallinkText=driver.findElement(By.partialLinkText("Shop with"));
	 WebElement amazonCurrencyPartiallinkText=driver.findElement(By.partialLinkText("Amazon Currency"));
	 WebElement shippingRatesPartiallinkText=driver.findElement(By.partialLinkText("Shipping Rates"));
	 WebElement amazonAndPartiallinkText=driver.findElement(By.partialLinkText("Amazon and"));
	 WebElement selfPublishPartiallinkText=driver.findElement(By.partialLinkText("Self-Publish"));

	//css_selector- TagandId
	 WebElement searchboxTagandId=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	 WebElement searchSubmitTagandId=driver.findElement(By.cssSelector("input#nav-search-submit-button"));
	 WebElement indiaTextTagandId=driver.findElement(By.cssSelector("span#glow-ingress-line2"));

	//css_selector- TagandClass 
	
	WebElement logoTagandClass =driver.findElement(By.cssSelector("span.nav-logo-locale"));
	WebElement helloSiginTagandClass =driver.findElement(By.cssSelector("div.nav-line-1-container"));
	WebElement backToTopFooterTagandClass =driver.findElement(By.cssSelector("span.navFooterBackToTopText"));

	//css_selector- TagandAttribute
	WebElement searchDropdownTagandAttribute=driver.findElement(By.cssSelector("select[title='Search in']"));
    WebElement searchAmazonTagandAttribute=driver.findElement(By.cssSelector("input[placeholder='Search Amazon']"));
    WebElement amazonLogoTagandAttribute=driver.findElement(By.cssSelector("a[aria-label='Amazon']"));

   //xpath
  	WebElement layouttoolbarXpath=driver.findElement(By.xpath("//div[@class='layoutToolbarPadding']"));
  	WebElement amazonLogoxPath=driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']")); //spacevarunath eduthu no issue why?
  	WebElement allMenubarxPath=driver.findElement(By.xpath("//a[@aria-label='Open Menu']")); 
	
  //Contains-Xpath
	WebElement logoContainsXpath=driver.findElement(By.xpath("//a[contains(@id,'nav-lo')]"));
	WebElement allcontainsXpath=driver.findElement(By.xpath("//span[contains(@class,'-icon-la')]"));
	WebElement layoutToolbarContainsXpath=driver.findElement(By.xpath("//div[contains(@class,'layoutToolb')]"));

	//starts-with Xpath
	WebElement logoStartswithXpath=driver.findElement(By.xpath("//a[starts-with(@id,'nav-lo')]"));
	WebElement allStartwithXpath=driver.findElement(By.xpath("//span[starts-with(@class,'hm-ic')]"));
	WebElement layoutToolbarStartwithXpath=driver.findElement(By.xpath("//div[starts-with(@class,'layoutToolb')]"));
    
	//Xpath with innertext -text() method function  
	WebElement aboutAmazonTextXpath=driver.findElement(By.xpath("//a[text()='About Amazon']"));
	WebElement amazonpaymentTextXpath=driver.findElement(By.xpath("//div[text()='Amazon Payment Products']"));
	WebElement headlineTextXpath=driver.findElement(By.xpath("//h2[text()='Have more fun with family']"));

	//Xpath with OR 
	
	WebElement amazonLogoOrXpath=driver.findElement(By.xpath("//a[@id='nav-logo-sprites' or @class='nav-logo-link nav-progressive-attribute']"));
	WebElement IndiaOrXpath=driver.findElement(By.xpath("//span[@id='glow-ingress-line2' or @class='nav-line-']"));
	WebElement OrXpath=driver.findElement(By.xpath("//input[@name='dropdown-selection-ubb' or @id='ubbShipTo']"));

	//Xpath with AND  
	 WebElement amazonLogoAndXpath=driver.findElement(By.xpath("//a[@id='nav-logo-sprites' and @aria-label='Amazon']"));
	 WebElement IndiaAndXpath=driver.findElement(By.xpath("//span[@class='nav-line-2 nav-progressive-content'and @id='glow-ingress-line2']"));
	 WebElement returnAndXpath=driver.findElement(By.xpath("//span[@class='nav-line-1' and text()='Returns']"));

	//axes Method
	//following
	 WebElement XpathFollowing1=driver.findElement(By.xpath("//div[@class='layoutToolbarPadding']//following::span[@id='nav-link-accountList-nav-line-1']")); 
	 WebElement XpathFollowing2=driver.findElement(By.xpath("//span[@id='glow-ingress-line2']//following::input[@id='unifiedLocation1ClickAddress']")); 
	 WebElement XpathFollowing3=driver.findElement(By.xpath("//span[@id='glow-ingress-line1']//following::input[@id='ubbShipTo']")); 
     
	 //preceding
	 WebElement XpathPreceding1=driver.findElement(By.xpath("//div[@class='layoutToolbarPadding']//preceding::div[@id='nav-global-location-toaster-script-container']")); 
	 WebElement XpathPreceding2=driver.findElement(By.xpath("//span[@id='glow-ingress-line2']//preceding::span[@id='glow-ingress-line1']")); 
	 WebElement XpathPreceding3=driver.findElement(By.xpath("//span[@class='hm-icon-label']//preceding::div[@id='nav-flyout-icp']")); 

	//parent
     WebElement XpathParentMethod1=driver.findElement(By.xpath("//div[@id='nav-cart-count-container']//parent::a")); 
     WebElement XpathParentMethod2=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']//parent::span[@id='nav-search-submit-text']")); 
     WebElement XpathParentMethod3=driver.findElement(By.xpath("//option[@value='search-alias=aps']//parent::select")); 

     //child
     WebElement XpathChild1=driver.findElement(By.xpath("//div[@class=\"nav-line-1-container\"]//child::span[@id='nav-link-accountList-nav-line-1']")); 
     WebElement XpathChild2=driver.findElement(By.xpath("//a[@id='nav-link-accountList']//child::span[@class='nav-line-2 ']")); 
     WebElement XpathChild3=driver.findElement(By.xpath("//div[@id='nav-tools']//child::a[@id='nav-cart'] ")); 

   //ancestor
     WebElement XpathAncestor1=driver.findElement(By.xpath("//span[@class='hm-icon-label'] //ancestor::div[@id='nav-main']")); //All
     WebElement XpathAncestor2=driver.findElement(By.xpath("//span[@id='glow-ingress-line2']//ancestor::a[@id='nav-global-location-popover-link']")); //india
     WebElement XpathAncestor3=driver.findElement(By.xpath("//span[@class=\"icp-nav-link-inner\"]//ancestor::div[@id='nav-tools']")); 

     
     //Descendant
     WebElement XpathDescendant1=driver.findElement(By.xpath("//span[@class=\"nav-line-2\"]//descendant::div[text()='EN']")); 
     WebElement XpathDescendant2=driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']//descendant::span[@id='glow-ingress-line2']")); 
     WebElement XpathDescendant3=driver.findElement(By.xpath("//div[@id='nav-main']//descendant::span[@class='hm-icon-label']")); 

   //following-sibling                                               
     WebElement Xpathfollowing_sibling1=driver.findElement(By.xpath("//div[@class='nav-line-1-container']//following-sibling::span[@class='nav-line-2 ']")); 
     WebElement Xpathfollowing_sibling2=driver.findElement(By.xpath("//span[@id='glow-ingress-line1']//following-sibling::span[@id='glow-ingress-line2']")); 
     WebElement Xpathfollowing_sibling3=driver.findElement(By.xpath("//div[@class='nav-search-facade']//following-sibling::select[@id='searchDropdownBox']")); 

     //preceding-sibling
     WebElement Xpathpreceding_sibling1=driver.findElement(By.xpath("//span[@class='nav-line-2 ']//preceding-sibling::div[@class='nav-line-1-container']")); 
     WebElement Xpathpreceding_sibling2=driver.findElement(By.xpath("//span[@id='glow-ingress-line2']//preceding-sibling::span[@id='glow-ingress-line1']")); 
     WebElement Xpathpreceding_sibling3=driver.findElement(By.xpath("//select[@id='searchDropdownBox']//preceding-sibling::div[@class='nav-search-facade']")); 

     
     
     
	}	
	
	public static void main(String[] args) {
		
		LocatorsMethod locators=new LocatorsMethod();
		locators.initializeBrowser();
		locators.locatorsMechanism();
		locators.driverQuit();
 
	}

}
