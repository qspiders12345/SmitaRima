package generics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
	
	@BeforeClass
	public void open()
	{
		Reporter.log("browser is opening",true);
	}
	
	@AfterClass
	public void close()
	{
		Reporter.log("browser is closed",true);
	}	
}