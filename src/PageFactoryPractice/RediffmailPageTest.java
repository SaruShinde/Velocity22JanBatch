package PageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RediffmailPageTest {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pravi\\Desktop\\Selenium\\ChromedriverVersion101\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.rediff.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void verifyRediffmailPage() {
		RediffRegistrationPage r=new RediffRegistrationPage(driver);
		r.clickcreateaccountlink();
		r.verifyreg_pageLogo();
		r.setRediffRegistrationPageFullName();
		r.setRediffRegistrationPageRegisterMailId();
		r.setRediffRegistrationPagePassword();
		r.setRediffRegistrationPageRetryPassword();
		r.setRediffRegistrationPageAlternateMailId();
		r.setRediffRegistrationPageMobilno();
		r.setRediffRegistrationPageBirthDay();
		r.setRediffRegistrationPageBirthMonth();
		r.setRediffRegistrationPageBirthYear();
		r.setRediffRegistrationPagegender("female");
		r.setRediffRegistrationPageCity();
		r.clickRediffRegistrationPageClickMyAccount();
		
	}

}
