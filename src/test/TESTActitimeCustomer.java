package test;

import org.testng.annotations.Test;
import generics.BaseTest;
import pom.POMActitimeCustomerPage;
import pom.POMActitimeLoginPage;

public class TESTActitimeCustomer extends BaseTest
{
	@Test
	public void customer() throws InterruptedException
	{
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
		
		POMActitimeCustomerPage customer=new POMActitimeCustomerPage(driver);
		customer.customerMethod();
	}
}