package youtubeMukesh;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts {
	 
	
	@Test
	public void test1()
	{
		System.out.println("Testcase 1 started");
		Assert.assertEquals(12, 14);
		System.out.println("Testcase 1 complited");
	}
	@Test
	public void test2()
	{
		System.out.println("Testcase 2 started");
		Assert.assertEquals(12, 12, "Dropdown count doesn't match, please check with developer");
		System.out.println("Testcase 2 complited");
	}

	@Test
	public void test3()
	{
		System.out.println("Testcase 3 started");
		Assert.assertEquals("Hello", "Hello Boss", "Words doesn't match please raise a bug");
		System.out.println("Testcase 3 complited");
		
	}
	
	@Test 
	public void test4()
	{
		String strName = "Netravati";
		Assert.assertTrue(strName.contains("Netravati"), "Names are matching");
	}
	
	@Test 
	public void test5()
	{
		Assert.assertTrue(false);
		
	}
	
}
