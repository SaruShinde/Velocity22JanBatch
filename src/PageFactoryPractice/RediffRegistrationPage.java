package PageFactoryPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RediffRegistrationPage {
	
	//declare
	
	@FindBy(xpath ="//a[text()='Create Account']") private WebElement Create_account;
	@FindBy(xpath ="//img[@title='Rediff.com']") private WebElement rediff_logo;
	@FindBy(name="namef64ad10b") private WebElement Fullname;
	@FindBy(name="loginf64ad10b") private WebElement reg_mailid;
	@FindBy(name="btnchkavailf64ad10b") private WebElement checkavailabilty;
	@FindBy(name="passwdf64ad10b") private WebElement password;
	@FindBy(name="confirm_passwdf64ad10b") private WebElement retrypassword;
	@FindBy(name="altemailf64ad10b") private WebElement alternatemail;
	@FindBy(name="chk_altemailf64ad10b") private WebElement checkboxformailid;
	@FindBy(id="mobno") private WebElement mobile_no;
	@FindBy(name="DOB_Dayf64ad10b") private WebElement birtday;
	@FindBy(name="DOB_Monthf64ad10b") private WebElement birthmonth;
	@FindBy(name="DOB_Yearf64ad10b") private WebElement birthyear;
	@FindBy(xpath ="//input[@value='m']") private WebElement gender_male;
	@FindBy(xpath ="//input[@value='f']") private WebElement gender_female;
	@FindBy(id="country") private WebElement country;
	@FindBy(name="cityf64ad10b") private WebElement city;
	@FindBy(id="Register") private WebElement createmyaccountbutton;
	
	//initialization
	
	public RediffRegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void clickcreateaccountlink() {
		Create_account.click();
	}
	
	public void verifyreg_pageLogo() {
		Assert.assertTrue(rediff_logo.isDisplayed(), "Logo is not displayed");
	}
	
	public void setRediffRegistrationPageFullName() {
		Fullname.sendKeys("Rushi");
	}
	
	public void setRediffRegistrationPageRegisterMailId() {
		reg_mailid.sendKeys("rushi987@rediffmail.com");
	}
	
	public void clickCheckAvailability() {
		Assert.assertTrue(checkavailabilty.isEnabled());
		checkavailabilty.click();
	}
	
	public void setRediffRegistrationPagePassword() {
		password.sendKeys("1234567");
	}
	
	public void setRediffRegistrationPageRetryPassword() {
		retrypassword.sendKeys("1234567");
	}
	
	public void setRediffRegistrationPageAlternateMailId() {
		alternatemail.sendKeys("shindesariak87@gmail.com");
	}
	
	public void setRediffRegistrationPageCheckboxAlternateMailId() {
		checkboxformailid.click();
	}
	
	public void setRediffRegistrationPageMobilno() {
		mobile_no.sendKeys("8411081013");
	}
	
	public void setRediffRegistrationPageBirthDay() {
		Assert.assertTrue(birtday.isDisplayed(),"birthday is not displayed");
		Select bday=new Select(birtday);
		bday.selectByVisibleText("22");
	}
	
	public void setRediffRegistrationPageBirthMonth() {
		Assert.assertTrue(birthmonth.isDisplayed(),"birthmonth is not displayed");
		Select bday=new Select(birthmonth);
		bday.selectByVisibleText("MAR");
	}
	
	public void setRediffRegistrationPageBirthYear() {
		Assert.assertTrue(birthyear.isDisplayed(),"birthyear is not displayed");
		Select bday=new Select(birthyear);
		bday.selectByVisibleText("1995");
	}
	
	public void setRediffRegistrationPagegender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}
	}
	
	public void setRediffRegistrationPageCountry() {
		Select countr=new Select(country);
		countr.deselectByVisibleText("India");	
	}
	
	public void setRediffRegistrationPageCity() {
		Select c=new Select(city);
		c.deselectByVisibleText("Solapur");	
	}
	
	public void clickRediffRegistrationPageClickMyAccount() {
		createmyaccountbutton.click();
	}
	
	
	

}
