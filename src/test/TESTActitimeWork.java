package test;

import org.testng.annotations.Test;
import generics.BaseTest;
import pom.POMActitimeLoginPage;
import pom.POMActitimeWorkPage;

public class TESTActitimeWork extends BaseTest
{
	@Test
	public void work() throws InterruptedException
	{
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
		
		POMActitimeWorkPage work=new POMActitimeWorkPage(driver);
		work.workMethod();
	}
}