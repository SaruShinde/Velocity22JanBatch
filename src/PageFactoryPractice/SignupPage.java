package PageFactoryPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignupPage {
	
	//1.declaration
	
	@FindBy(xpath="//a[text()='Sign up']") private WebElement SignUpLink;
	@FindBy(xpath="//a[text()='Log in']") private WebElement LoginLink;
	@FindBy(name="email") private WebElement Emailid;
	@FindBy(name="confirm") private WebElement ConfirmEmailid;
	@FindBy(name="password") private WebElement password;
	@FindBy(name="displayname") private WebElement profilename;
	@FindBy(name="year") private WebElement Birthyear;
	@FindBy(name="month") private WebElement Birthmonth;
	@FindBy(name="day") private WebElement Birthday;
	@FindBy(xpath="//input[@id='gender_option_female']") private WebElement gender_female;
	@FindBy(xpath="//input[@id='gender_option_male']") private WebElement gender_male;
	@FindBy(name="marketing") private WebElement checkbox;
	@FindBy(xpath="//button[@class='Button-qlcn5g-0 iuyipX']") private WebElement SignupButton;
	
	//initialization---declare constructor with public accesss
	
	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//usage
	public void clickSpotifySignuplink() {
		SignUpLink.click();
	}
	
	public void verifySignupPageLogin() {
		Assert.assertTrue(LoginLink.isDisplayed(),"Log in option is not displayed");
		Assert.assertEquals(LoginLink.getText(),"Log in");
	}
	
	public void setSignupPageEmailid() {
		Emailid.sendKeys("shindesarika237@gmail.com");
	}
	
	public void setSignupPageConfirmEmailid() {
		ConfirmEmailid.sendKeys("shindesarika237@gmail.com");
	}
	
	public void setSignupPagePassword() {
		password.sendKeys("Sarika8411");
	}
	
	public void setSignupPageProfileName() {
		profilename.sendKeys("Sarika");
	}
	
	public void setSignupPageBirthYear() {
		Birthyear.sendKeys("1996");
	}
	
	public void setSignupPageBirthMonth() {
		Assert.assertTrue(Birthmonth.isDisplayed(),"birthmonth is not displayed");
		Assert.assertFalse(Birthmonth.isSelected());
		Select bmonth=new Select(Birthmonth);
		bmonth.selectByVisibleText("May");
	}
	
	public void setSignupPageBirthDay() {
		Birthday.sendKeys("8");
	}
	
	public void setSignupPageGender() {
//		if(gender.equalsIgnoreCase("female")) {
//			gender_female.click();
//		}else if(gender.equalsIgnoreCase("male")) {
//			gender_male.click();
//		}
		gender_male.click();
		
		
}
	
	public void setSignupPageCheckbox() {
		checkbox.click();
	}
	
	public void clickSignupPageSignupButton() {
		Assert.assertTrue(SignupButton.isEnabled(),"sign up button is not displayed");
		SignupButton.click();
	}

}
