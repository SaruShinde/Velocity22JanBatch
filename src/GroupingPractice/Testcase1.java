package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	@BeforeTest(alwaysRun=true)
	public void openDB() {
		System.out.println("Database is open");
	}
	@AfterTest(alwaysRun=true)
	public void closeDB() {
		System.out.println("Database is close");
	}
	@BeforeClass(alwaysRun=true)
	public void LaunchBrowser() {
		System.out.println("Browser is launch");
	}
	@AfterClass(alwaysRun=true)
	public void CloseBrowser() {
		System.out.println("Browser is close");
	}
	@Test(groups="smoke")
	public void test1() {
		System.out.println("test1");
	}
	@Test(groups="functional")
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups={"functional","regression"})
	public void test3() {
		System.out.println("test3");
	}

}
