package youtubeMukesh;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftHardAssert {
	
	@Test(priority=0)
	public void softAssert(){
		
	    SoftAssert assertion = new SoftAssert();
	    System.out.println("Test 1 started");
	    assertion.assertEquals(12, 13);
	    System.out.println("Test 1 complited");
	    assertion.assertAll();
	}
	
	@Test(priority=1)
	public void hardAssert(){
		System.out.println("Test 2 started");
		Assert.assertEquals(12, 13);
		 System.out.println("Test 2 complited");
	}

}
