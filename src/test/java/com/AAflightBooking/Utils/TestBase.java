package com.AAflightBooking.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import com.AAflightBooking.Pages.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public ReadConfig rc = new ReadConfig();
	public WebDriver driver;// If you want to keep webdriver default(not public) then 1) keep the testbase
							// class inside
							// testpage package.since default is package protected.Or 2) make init method as
							// return type with driver and initialise init method in testpages. Or 3) we can
							// get driver by using super()
							// through the inherited class to instantiate the testbase constructor(init() as
							// constructor).

	public void init() {
		if (rc.getBrowser().equalsIgnoreCase("chrome")) {
			driver = WebDriverManager.chromedriver().create(); // create() will give webdriver instance.This will
																// initialize your binaries(system.setprop) as well
																// initialize your driver.
//  		WebDriverManager.chromedriver().setup();This will takecare of the binary versions of your system and compatible with your current browser version
//			System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
//			driver = new ChromeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(BasePage.implicitWait, TimeUnit.SECONDS);
	}
	

}
