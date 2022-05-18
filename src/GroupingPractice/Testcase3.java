package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase3 {
	@BeforeClass(alwaysRun=true)
	public void LaunchBrowser() {
		System.out.println("Browser is launch");
	}
	@AfterClass(alwaysRun=true)
	public void CloseBrowser() {
		System.out.println("Browser is close");
	}
	@Test(groups="smoke")
	public void test7() {
		System.out.println("test7");
	}
	@Test(groups="functional")
	public void test8() {
		System.out.println("test8");
	}
	@Test(groups={"functional","regression"})
	public void test9() {
		System.out.println("test9");
	}


}
