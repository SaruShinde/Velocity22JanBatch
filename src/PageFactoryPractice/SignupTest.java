package PageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignupTest {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pravi\\Desktop\\Selenium\\ChromedriverVersion101\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.spotify.com/in-en/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	
	public void verifySpotifySignup() {
		SignupPage s=new SignupPage(driver);
		s.clickSpotifySignuplink();
		s.verifySignupPageLogin();
		s.setSignupPageEmailid();
		s.setSignupPageConfirmEmailid();
		s.setSignupPagePassword();
		s.setSignupPageProfileName();
		s.setSignupPageBirthYear();
		s.setSignupPageBirthMonth();
		s.setSignupPageBirthDay();
		s.setSignupPageGender();
		s.setSignupPageCheckbox();
		s.clickSignupPageSignupButton();
	}
	
	

}
