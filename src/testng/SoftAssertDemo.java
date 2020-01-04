package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo 
{
	@Test
	public void verify()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		String expected="madhurima";
		String actual=driver.getTitle();
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(actual, expected);
		
		Reporter.log("hello",true);
		s.assertAll();
		Reporter.log("how r u",true);
	}
	
	@Test
	public void z()
	{
		Reporter.log("z",true);
	}
}