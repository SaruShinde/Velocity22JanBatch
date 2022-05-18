package KeywordsTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabled {
	@BeforeClass
	public void OpenBrowser() {
    System.out.println("Browser open");
	}
	
	@AfterClass
	public void CloseBrowser() {
    System.out.println("Browser close");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login successful");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout successful");
	}
	@Test(priority=1)
	public void Homepage() {
		System.out.println("HomePage is open");
	}
	@Test(priority=2,invocationCount=4,enabled=false)
	public void Profilepic() {
		System.out.println("Profilepic is open");
	}

}
