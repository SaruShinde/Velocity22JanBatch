import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotation {
	
	@BeforeClass
	public void login() {
	System.out.println("login");	
	}
	
	@AfterClass
	public void logout() {
		System.out.println("logout");
	}
	
	@Test (priority=3)
	public void homepage() {
		System.out.println("homepage");
	}
	
	@Test (priority=1)
	public void notification() {
		System.out.println("notification");
	}
	
	@Test (priority=2)
	public void profilepic() {
		System.out.println("profilepic");
	}
	

}
