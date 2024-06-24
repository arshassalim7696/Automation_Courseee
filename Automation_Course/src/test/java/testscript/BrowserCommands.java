package testscript;

public class BrowserCommands extends Base{

	
		public void browserCommands()
		{
			String title=driver.getTitle();//to get title
			String url=driver.getCurrentUrl();
			String pageSource=driver.getPageSource();//hover pagesource while in debugto see everthing
			
		}
	
		public void navigationCommand()
		{
		driver.navigate().to("https://www.amazon.com");//navigate from google to amazon
		driver.navigate().back();//navigate from amazon to google
		driver.navigate().forward();//from google again back to amazon
	
		}
		public static void main(String[] args) {
			
			BrowserCommands browsercommands=new BrowserCommands();
			browsercommands.initializeBrowser();
			browsercommands.navigationCommand();
			browsercommands.browserCommands();
			browsercommands.driverQuit();
			
		}

		
	
	}

