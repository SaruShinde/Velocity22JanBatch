import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodAnnotation {
	
	//login==>homepage==>logout
	//login==>notification==>logout
	//login==>profilepic==>logout
	
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	
	@Test
	public void homepage() {
		System.out.println("homepage");
	}
	
	@Test
	public void notification() {
		System.out.println("notification");
	}
	
	
	@Test
	public void profilepic() {
		System.out.println("profilepic");
	}

}
