package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase2 {
	@BeforeClass(alwaysRun=true)
	public void LaunchBrowser() {
		System.out.println("Browser is launch");
	}
	@AfterClass(alwaysRun=true)
	public void CloseBrowser() {
		System.out.println("Browser is close");
	}
	@Test(groups="smoke")
	public void test4() {
		System.out.println("test4");
	}
	@Test(groups="functional")
	public void test5() {
		System.out.println("test5");
	}
	@Test(groups={"functional","regression"})
	public void test6() {
		System.out.println("test6");
	}


}
