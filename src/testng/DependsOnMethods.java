package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
	@Test(dependsOnMethods= {"madhurima","a"})
	public void madhusmita()
	{
		Reporter.log("madhusmita",true);
	}
	
	@Test
	public void madhurima()
	{		
		Reporter.log("madhurima",true);
	}
	
	@Test
	public void a()
	{
		Reporter.log("a",true);
		Assert.fail();
	}
	
	@Test
	public void sweta()
	{
		Reporter.log("sweta",true);
	}
}