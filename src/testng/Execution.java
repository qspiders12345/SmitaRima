package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Execution 
{
	@Test
	public void a()
	{
		Reporter.log("a",true);
		Assert.fail();
		Reporter.log("hello");
	}
	
	@Test
	public void b()
	{
		Reporter.log("b",true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("c",true);
	}
}