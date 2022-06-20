package com.AAflightBooking.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
	WebDriver driver;
	ReservationFlightSearchPage flightSearchPage;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='loginId']")
	WebElement AAdvantage_USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='lastName']")
	WebElement AAdvantage_LASTNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement AAdvantage_PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//section[@class='section']//descendant::div[9]//child::label//span[@class='control']")
	WebElement REMEMBER_ME_CHECHBOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='_button_login']")
	WebElement LOGIN_BUTTON_ELEMENT;

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void enterUserName(String aadvantageUsername) {
		AAdvantage_USERNAME_ELEMENT.sendKeys(aadvantageUsername);
	}

	public void enterLastName(String lastName) {
		AAdvantage_LASTNAME_ELEMENT.sendKeys(lastName);
	}

	public void enterPassword(String password) {
		AAdvantage_PASSWORD_ELEMENT.sendKeys(password);
	}

	public void clickRememberMebutton() {
		REMEMBER_ME_CHECHBOX_ELEMENT.click();
	}

	public ReservationFlightSearchPage clickLoginButton() {
		explicitWaitForElement(driver, 10, LOGIN_BUTTON_ELEMENT);
		LOGIN_BUTTON_ELEMENT.click();
		return new ReservationFlightSearchPage(driver);
	}

}
