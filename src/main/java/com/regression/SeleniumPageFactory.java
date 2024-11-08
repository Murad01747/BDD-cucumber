package com.regression;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SeleniumPageFactory {
	
	SeleniumPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	
@FindBy(xpath="//*[@name='username']")
	private WebElement user;
@FindBy(xpath="//*[@name='password']")
	private WebElement password;
@FindBy(xpath="//*[@type='submit']")
	private WebElement loginBtn;
	@FindBy(xpath = "//*[text()='Logout']")
	 private WebElement Logout;
	@FindBy(xpath = "//*[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]")
	 private WebElement Errormsgwithinvalidcredential;
	
	public WebElement getErrormsgwithinvalidcredential() {
		return Errormsgwithinvalidcredential;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getLogout() {
		return Logout;
	}
	
	
	
	
	
}
