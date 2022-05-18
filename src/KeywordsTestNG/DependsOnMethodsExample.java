package KeywordsTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsOnMethodsExample {
//	@Test(priority=1)
//	public void openurl() {
//		System.out.println("url is open ");
//		Reporter.log("url is open");
//		Assert.fail();
//	}
//	@Test(priority=2,dependsOnMethods="openurl")
//	public void login() {
//		System.out.println("login successful");
//		Reporter.log("Login successful");
//	}
//	@Test(priority=3,dependsOnMethods={"openurl","login"})
//	public void logout() {
//		System.out.println("logout successful");
//		Reporter.log("logout successful");
//	}
	@BeforeClass
	public void openurl() {
		System.out.println("url is open");
		Assert.assertTrue(true);
	}
	@Test(priority=1)
	public void Test1() {
		System.out.println("Test1 successful");
		Assert.fail();
	}
	@Test(priority=2,dependsOnMethods="Test1")
	public void Test2() {
		System.out.println("Test2 successful");
	}
	@Test(priority=3,dependsOnMethods={"Test1","Test2"})
	public void Test3() {
		System.out.println("Test3 successful");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout successful");
	}


}
