package com.AAflightBooking.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public static long implicitWait = 20;

	public void switchToWindowHandle(WebDriver driver) {
		driver.switchTo().window(driver.getWindowHandle());
	}
	public void explicitWaitForElement(WebDriver driver,int timeInSec, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,timeInSec);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
