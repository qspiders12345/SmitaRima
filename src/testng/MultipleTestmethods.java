package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleTestmethods 
{
	@Test(priority=3,invocationCount=2)
	public void madhusmita()
	{
		Reporter.log("madhusmita",true);
	}
	
	@Test(priority=4,invocationCount=4)
	public void madhurima()
	{
		Reporter.log("madhurima",true);
	}
	
	@Test(invocationCount=5)
	public void sweta()
	{
		Reporter.log("sweta",true);
	}
}