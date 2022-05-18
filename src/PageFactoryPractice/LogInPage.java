package PageFactoryPractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogInPage{
	
	//declaration
	
	@FindBy(xpath ="//img[@class='fb_logo _8ilh img']") private WebElement login_fblogo;
	@FindBy(xpath ="//h2[text()='Facebook helps you connect and share with the people in your life.']") private WebElement login_tagline;
	@FindBy(xpath ="//input[@name='email']") private WebElement username;
	@FindBy(xpath ="//input[@name='pass']") private WebElement password;
	@FindBy(xpath ="//button[@name='login']") private WebElement loginbutton;
	@FindBy(xpath ="//a[text()='Forgotten password?']") private WebElement forgotpassword;
	@FindBy(xpath ="//a[@data-testid='open-registration-form-button']") private WebElement createnewaccount;
	@FindBys({@FindBy(xpath ="//div[@id='pageFooterChildren']/ul/li/a")}) private List<WebElement> footerlinks;
	 
	
	//initialization
	
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void verifyFbLoginPageLogo() {
		Assert.assertTrue(login_fblogo.isDisplayed(),"Facebook logo on login page is not displayed");
	}
	
	public void verifyFbLogintagLine() {
		Assert.assertTrue(login_tagline.isDisplayed(),"Facebook tagline on login page is not displayed");
	}
	
	public void setLogInPageUsername() {
		username.sendKeys("ABC");
	}
	
	public void setLogInPagePassword() {
		username.sendKeys("1234");
	}
	
	public void clickLogInPageCreateNewAcc() {
		Assert.assertTrue(createnewaccount.isDisplayed(),"create new account on login page is not displayed");
	}
	
	public void verifyLogInPageFooterLinkSize() {
		Assert.assertEquals(footerlinks.size(),30);
	}
	
	
	

}
