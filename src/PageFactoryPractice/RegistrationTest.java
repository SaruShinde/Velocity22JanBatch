package PageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {
	
	//All test cases---verifications
	//browser launch--url---set up browser configuration---@BerforeClass
	//within single test verify all verification methods all tested then use---@Test
	//close the browser---@AfterClass
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pravi\\Desktop\\Selenium\\ChromedriverVersion101\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	
	public void FacebookRegistrationPageTest() {
		RegistrationPage r=new RegistrationPage(driver);
		r.clickFbSignupLink();
		r.verifyRegistrationPageFbLogo();
		r.verifyRegistrationPageAlreadyAccount();
		r.setRegistrationPageFirstName();
		r.setRegistrationPageLastName();
		r.setRegistrationPageMobNumber();
		r.setRegistrationPagePassword();
		r.setRegistrationPageBirthDay();
		r.setRegistrationPageBirthMonth();
		r.setRegistrationPageBirthYear();
		r.setRegistrationPageGender("Female");
		r.clickRegistrationPageSignupButton();
	}
	
	@AfterClass
	public void teardown() {
//		driver.quit();
	}
	

}
