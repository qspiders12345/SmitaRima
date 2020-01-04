package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	@Test
	public void a()
	{
		Reporter.log("a",true);
	}
	
	@Test
	public void b()
	{
		Reporter.log("b",true);
	}
	
	@BeforeSuite
	public void c()
	{
		Reporter.log("c",true);
	}
	
	@BeforeMethod
	public void d()
	{
		Reporter.log("d",true);
	}
	
	@BeforeClass
	public void e()
	{
		Reporter.log("e",true);
	}
	
	@BeforeTest
	public void f()
	{
		Reporter.log("f",true);
	}
	
	@AfterSuite
	public void g()
	{
		Reporter.log("g",true);
	}
	
	@AfterClass
	public void h()
	{
		Reporter.log("h",true);
	}
	
	@AfterMethod
	public void i()
	{
		Reporter.log("i",true);
	}
	
	@AfterTest
	public void j()
	{
		Reporter.log("j",true);
	}
}