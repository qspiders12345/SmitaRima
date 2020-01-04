package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerificationinTestNG 
{
	@Test
	public void verify()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		String expected="madhurima";
		String actual=driver.getTitle();
		//Assert.assertEquals(actual, expected);
		//Assert.assertNotEquals(actual, expected);
		Assert.assertSame(actual, expected);
		Reporter.log("hello",true);
	}
	
	@Test
	public void z()
	{
		Reporter.log("z",true);
	}
}