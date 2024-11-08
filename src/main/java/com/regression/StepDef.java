package com.regression;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.util.Highlighter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	SeleniumPageFactory pf;
	WebDriver driver;
	SoftAssert sa;
	
	@Given("Open the browser")
	public void open_the_browser() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("Go to the application URL")
	public void go_to_the_application_URL() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Put the valid user")
	public void put_the_valid_user() throws Exception {
		
		 pf = new SeleniumPageFactory(driver);
		 Highlighter.getColor(driver, pf.getUser(), "black");
		pf.getUser().sendKeys("Admin");
		 
	}

	@When("Put the valid password")
	public void put_the_valid_password() {
		 pf = new SeleniumPageFactory(driver);
		 Highlighter.getColor(driver, pf.getPassword(), "red");

		pf.getPassword().sendKeys("admin123");
	}

	@When("Click login button")
	public void click_login_button() throws Exception {
		 pf = new SeleniumPageFactory(driver);
		 Highlighter.getColor(driver, pf.getLoginBtn(), "blue");
		 Thread.sleep(Duration.ofSeconds(10));
		pf.getLoginBtn().click();
	}

	@Then("Check the login function should pass and logout button should visible")
	public void check_the_login_function_should_pass() {
	  // driver.findElement(By.xpath("//*[text()='Logout']")).click();
		 pf = new SeleniumPageFactory(driver);
		 //pf.getLogout().isDisplayed()
		  sa = new SoftAssert();
		 sa.assertTrue(pf.getLogout().isDisplayed());
		 sa.assertAll();
	}

	@When("Put the invalid user")
	public void put_the_invalid_user() {
		 pf = new SeleniumPageFactory(driver);
		 com.util.Highlighter.getColor(driver, pf.getUser());		 

		pf.getUser().sendKeys("murad");
	}

	@When("Put the invalid password")
	public void put_the_invalid_password() {
		 pf = new SeleniumPageFactory(driver);

		pf.getPassword().sendKeys("murad123");
	}

	@Then("Check the login function should fail")
	public void check_the_login_function_should_fail() {
		pf = new SeleniumPageFactory(driver);
		//pf.getErrormsgwithinvalidcredential().isDisplayed()
		 sa= new SoftAssert();
		sa.assertTrue(pf.getErrormsgwithinvalidcredential().isDisplayed());
		sa.assertAll();

		
		
	}	
}
