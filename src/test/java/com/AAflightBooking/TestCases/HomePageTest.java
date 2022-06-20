package com.AAflightBooking.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AAflightBooking.Pages.HomePage;
import com.AAflightBooking.Pages.LoginPage;
import com.AAflightBooking.Utils.TestBase;

public class HomePageTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;

	@BeforeMethod
	public void setUp() {
		init();
		driver.get(rc.getUrl());
		homePage = PageFactory.initElements(driver, HomePage.class);
	}

	// Each testcase should be independent, No dependency of testcases.
	// Actual Expected
	@Test
	public void validUserShouldAbleToEnterLoginPageTest() {
		Assert.assertEquals(homePage.getPageTitle(),
				"Book flights - Book round trip, one way, multi city - American Airlines",
				"The expected page does not matched");
		Assert.assertTrue(homePage.validateLogoImg(), "The Logo is not displayed");
		loginPage = homePage.clickLoginButton();
	}

	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
