package PageFactoryPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class RegistrationPage {
	
	
	//xpath and verification method
	//1.declaration
	//2.Initialization
	//3.usage
	
	//1.Declaration
	
	@FindBy(xpath="//a[text()='Sign Up']") private WebElement SignupLink;
	@FindBy(xpath="//img[@class='fb_logo _registrationPage__fbLogo img']") private WebElement reg_fblogo;
	@FindBy(xpath="//a[text()='Already have an account?']") private WebElement  already_acc;
	@FindBy(name="firstname") private WebElement  firstname;
	@FindBy(name="lastname") private WebElement surname;
	@FindBy(name="reg_email__") private WebElement mob_no;
	@FindBy(name="reg_passwd__") private WebElement  password;
	@FindBy(name="birthday_day") private WebElement birthday;
	@FindBy(name="birthday_month") private WebElement birthmonth;
	@FindBy(name="birthday_year") private WebElement birthyear;
	@FindBy(xpath="//input[@value='2']") private WebElement gender_male;
	@FindBy(xpath="//input[@value='1']") private WebElement gender_female;
	@FindBy(name="websubmit") private WebElement SignupButton;
	
	//2.initialization----declare constructor with public access
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//3.usage
	
	public void clickFbSignupLink() {
		SignupLink.click();
		Reporter.log("clickFbSignupLink",true);
	}
	
	public void verifyRegistrationPageFbLogo() {
		Assert.assertTrue(reg_fblogo.isDisplayed(),"The logo on registration page is not displayed");
		Reporter.log("verifyRegistrationPageFbLogo",true);
	}
	
	public void verifyRegistrationPageAlreadyAccount() {
		Assert.assertTrue(already_acc.isDisplayed(),"Already have an account option is not displayed");
		Assert.assertEquals(already_acc.getText(),"Already have an account?");
		Reporter.log("verifyRegistrationPageAlreadyAccount",true);
	}
	
	public void setRegistrationPageFirstName() {
		firstname.sendKeys("Sarika");
		Reporter.log("setRegistrationPageFirstName",true);
	}
	
	public void setRegistrationPageLastName() {
		surname.sendKeys("Shinde");
		Reporter.log("setRegistrationPageLastName",true);
	}
	
	public void setRegistrationPageMobNumber() {
		mob_no.sendKeys("8411081013");
		Reporter.log("setRegistrationPageMobNumber",true);
	}
	
	public void setRegistrationPagePassword() {
		password.sendKeys("8411081013");
		Reporter.log("setRegistrationPagePassword",true);
	}
	
	public void setRegistrationPageBirthDay() {
		Assert.assertTrue(birthday.isDisplayed(),"The birthday is not displayed");
		Assert.assertFalse(birthday.isSelected());
		Select bday=new Select(birthday);
		bday.selectByVisibleText("8");
		Reporter.log("setRegistrationPageBirthDay",true);
	}
	
	public void setRegistrationPageBirthMonth() {
		Assert.assertTrue(birthmonth.isDisplayed(),"birthmonth is not displayed");
		Assert.assertFalse(birthmonth.isSelected());
		Select bmonth=new Select(birthmonth);
		bmonth.selectByVisibleText("Dec");
		Reporter.log("setRegistrationPageBirthMonth",true);
	}
	
	public void setRegistrationPageBirthYear() {
		Assert.assertTrue(birthyear.isDisplayed(),"birthyear is not displayed");
		Assert.assertFalse(birthyear.isSelected());
		Select byear=new Select(birthyear);
		byear.selectByVisibleText("1996");
		Reporter.log("setRegistrationPageBirthYear",true);
	}
	
	public void setRegistrationPageGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
			Reporter.log("setRegistrationPageGender",true);
		}
	}
	
	public void clickRegistrationPageSignupButton() {
		Assert.assertTrue(SignupButton.isEnabled(),"sign up button is not enabled");
		SignupButton.click();
		Reporter.log("clickRegistrationPageSignupButton",true);
	}
	
	
	
	

}
