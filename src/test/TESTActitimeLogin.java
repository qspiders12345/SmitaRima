package test;

import org.testng.annotations.Test;
import generics.BaseTest;
import pom.POMActitimeLoginPage;

public class TESTActitimeLogin extends BaseTest
{
	@Test
	public void login()
	{
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
	}
}