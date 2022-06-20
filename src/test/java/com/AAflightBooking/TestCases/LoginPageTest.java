package com.AAflightBooking.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.AAflightBooking.Pages.ReservationFlightSearchPage;
import com.AAflightBooking.Pages.HomePage;
import com.AAflightBooking.Pages.LoginPage;
import com.AAflightBooking.Utils.TestBase;


public class LoginPageTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	ReservationFlightSearchPage flightSearchPage;

	@BeforeMethod
	public void setUp() {
		init();
		driver.get(rc.getUrl());
		homePage = PageFactory.initElements(driver, HomePage.class);
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Test
	@Parameters({ "username", "lastname", "password" })
	public void validUserShouldLoginUsingValidCredentialsTest(String username, String lastname, String password) {
		homePage.clickLoginButton();
		Assert.assertEquals(loginPage.getPageTitle(),
				"Log in – AAdvantage account login and password – American Airlines", "The Login Page did not match");
		loginPage.enterUserName(username);
		loginPage.enterLastName(lastname);
		loginPage.enterPassword(password);
		loginPage.clickRememberMebutton();
		flightSearchPage = loginPage.clickLoginButton();
		

	}

}
