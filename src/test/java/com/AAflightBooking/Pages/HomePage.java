package com.AAflightBooking.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.AAflightBooking.Utils.TestBase;

public class HomePage extends TestBase {
	WebDriver driver;
	LoginPage loginPage;

	public HomePage(WebDriver driver) {
		// PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Page Factory or OR
	@FindBy(how = How.ID, using = "log-in-button")
	WebElement LOGIN_ELEMENT;
	@FindBy(how = How.LINK_TEXT, using = "Log in")
	WebElement LOGIN2_ELEMENT;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Log")
	WebElement LOGIN3_ELEMENT;
	@FindBy(how = How.CSS, using = "#log-in-button")
	WebElement LOGIN4_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[@id='log-in-button']")
	WebElement LOGIN5_ELEMENT;
	By LOGIN_LOCATOR = By.cssSelector("a#log-in-button");

	@FindBy(how = How.XPATH, using = "//a[@class='aa-logo span4 span-phone9']")
	WebElement AALOGO_ELEMENT;

	// Example for css:
	// By.cssSelector("select[name='category']");
	// @FindBy(how = How.CSS, using = "input[name='categorydata']")
	// WebElement ADD_CATEGORY_INSERT_ELEMENT;
	// @FindBy(how = How.CSS, using ="input[name='submit'][value='Add category']" )
	// WebElement ADD_CATEGORY_BUTTON_ELEMENT;

	public String getPageTitle() {
		return driver.getTitle();
	}

	public boolean validateLogoImg() {
		boolean flag = AALOGO_ELEMENT.isDisplayed();
		return flag;
	}

	public LoginPage clickLoginButton() {
		LOGIN_ELEMENT.click();
		return new LoginPage(driver);
		// driver.findElement(LOGINNEW_ELEMENT).click();
	}

}
