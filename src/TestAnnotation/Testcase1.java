package TestAnnotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	
	@BeforeTest
	public void openDB() {
		System.out.println("Database is open before starting of testcase1");
	}
	
	@AfterTest
	public void closeDB() {
		System.out.println("Database is close after closing of testcase2");
	}
	
	@Test
	public void m1() {
		System.out.println("This is method m1 from testcase1");
	}
	
	@Test
	public void m2() {
		System.out.println("This is method m2 from testcase1");
	}
	
	@Test
	public void m3() {
		System.out.println("This is method m3 from testcase1");
	}

}
