package qaclickacademy;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void test1()
	{
		System.out.println("First Selenium test");
	}
	
	@Test(groups = {"smoke"})
	public void test2()
	{
		System.out.println("Second Selenium test");
	}

}
