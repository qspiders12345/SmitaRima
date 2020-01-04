package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DepOnMthds 
{
	public WebDriver driver;
	
	@Test
	public void openBrowser()
	{
		driver=new FirefoxDriver();
	}
	
	@Test(dependsOnMethods="openBrowser")
	public void enterURL()
	{
		driver.get("https://www.google.com");
	}
}