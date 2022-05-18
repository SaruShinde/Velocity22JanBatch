package AssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	
	//assert==use to verify scenarios
	//static method==hard assert
	
	String s1="Sarika";
	String s2="Saru";
	
	//1.AssertEquals
    @Test
	public void Test1() {
	Assert.assertEquals(s1, s2);
	}
    
    //2.AssertnotEquals
    @Test
    public void Test2() {
    	Assert.assertNotEquals(s1,s2);
    }
    
    //3.AssertNull
    //testcase will pass if provided data is null
    
    //4.AssertNotNull
    @Test
    public void Test3() {
    	Assert.assertNotNull(s2);
    }
    
    
    
}
