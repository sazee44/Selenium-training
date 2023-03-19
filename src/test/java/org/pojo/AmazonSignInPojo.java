package org.pojo;

import org.bassclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignInPojo extends BaseClass {

	public AmazonSignInPojo() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//span[text()='Hello, sign in']")
	private WebElement signin;

	@FindBy(xpath = "//a[@class='a-button-text']")
	private WebElement createYourAcc;

	@FindBy(id = "ap_customer_name")
	private WebElement namebox;

	@FindBy(id = "ap_phone_number")
	private WebElement mobileno;
	
	@FindBy(xpath = "//input[@class='a-input-text a-span12 auth-require-email-validaton']")
	private WebElement email;
	
	
	@FindBy(xpath = "//input[@class='a-input-text a-span12 auth-required-field auth-require-fields-match auth-require-password-validation']")
	private WebElement pass;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getCreateYourAcc() {
		return createYourAcc;
	}

	public WebElement getNamebox() {
		return namebox;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getEmail() {
		return email;
	}
	
	
}
