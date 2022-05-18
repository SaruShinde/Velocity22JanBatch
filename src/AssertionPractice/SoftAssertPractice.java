package AssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {
	
//	@Test
//	public void Test1() {
//		String s1="Hello";
//		System.out.println(s1);
//		Assert.assertEquals(s1,"Hi");
//		
//		String s2="Hi";
//		System.out.println(s2);
//		Assert.assertEquals(s2, "Hi");
//	}
//	
//	@Test
//	public void Test() {
//		System.out.println("TestNG");
//	}
	
	
	SoftAssert soft=new SoftAssert();
	@Test
	public void Test1() {
		String s1="Hello";
		System.out.println(s1);
		soft.assertEquals(s1, "Hi");
//		Assert.assertEquals(s1,"Hi");
		
		String s2="Hi";
		System.out.println(s2);
	    soft.assertEquals(s2, "Hi");
	}
	
	@Test
	public void Test() {
		System.out.println("TestNG");
	}

}
