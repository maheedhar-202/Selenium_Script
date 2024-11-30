package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample_testng {
	@BeforeMethod
	public void Before_method() {
		System.out.println("Before Method");
	}
	@BeforeTest
	public void Befortest() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void Before_Class() {
		System.out.println("Before Class");
	}
	
	@Test
	public void s() {
		System.out.println("Test");
	}
	@AfterTest
	public void After_test() {
		System.out.println("After Test");
	}
	@AfterClass
	public void After_Class() {
		System.out.println("After Class");
	}
	@AfterMethod
	public void After_Method() {
		System.out.println("After Method");
		
	}

}
