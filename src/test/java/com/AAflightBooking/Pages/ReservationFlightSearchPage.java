package com.AAflightBooking.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.AAflightBooking.Utils.TestBase;

public class ReservationFlightSearchPage extends TestBase {
	WebDriver driver;
	
	public ReservationFlightSearchPage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.XPATH,using = "//div[@id='aa-booking-module']//descendant::div[12]//a//span[1]")WebElement SEARCH_ORIGIN_AIRPORT_CODE_ELEMENT;
	@FindBy(how=How.XPATH,using = "//h2[contains(text(),'Airport lookup')]")WebElement ALERT_POPUP_ELEMENT;	
	@FindBy(how=How.XPATH,using = "//select[@id='countryCode']")WebElement AIRPORT_LOOKUP_FOR_COUNTRY_ELEMENT;
	@FindBy(how=How.XPATH,using = "//select[@id='stateCode']")WebElement AIRPORT_LOOKUP_FOR_STATE_ELEMENT;
	@FindBy(how=How.XPATH,using = "//button[@id='airportLookupDialogButton0']")WebElement CLOSE_WINDOW_POPUP_BUTTON_ELEMENT;
	@FindBy(how=How.XPATH,using = "//div[@id='aa-booking-module']//descendant::div[14]//child::a//span[1]")WebElement SEARCH_DESTINATION_AIRPORT_CODE_ELEMENT;
	@FindBy(how=How.XPATH,using = "//select[@name='adultOrSeniorPassengerCount']")WebElement NUMBER_OF_PASSENGER_ELEMENT;
	@FindBy(how=How.XPATH,using = "//form[@name='reservationFlightSearchForm']//following-sibling::div[4]//descendant::button[1]")WebElement LEAVINGON_DATEPICKER_ELEMENT;
	@FindBy(how=How.XPATH,using = "//div[@class='ui-datepicker-group ui-datepicker-group-first']//descendant::span[@class='ui-datepicker-month']")WebElement MONTHNAME_IN_DATEPICKER_ELEMENT;
	@FindBy(how=How.XPATH,using = "//div[@class='ui-datepicker-group ui-datepicker-group-first']//descendant::span[@class='ui-datepicker-year']")WebElement YEARNAME_IN_DATEPICKER_ELEMENT;
	@FindBy(how=How.XPATH,using = "//a[@class='ui-datepicker-next ui-corner-all']")WebElement NEXTMONTH_BUTTON_IN_DATEPICKER_ELEMENT;
	@FindBy(how=How.XPATH,using = "//tbody//tr[1]//td[5]//span")WebElement SELECT_DATE_IN_DATEPICKER_ELEMENT;
	@FindBy(how=How.XPATH,using = "//button[@id='flightSearchForm.button.vacationSubmit']")WebElement SEARCH_FLIGHT_BUTTON_ELEMENT;
	
	public void clickLensDepartureAirportCode() {
		SEARCH_ORIGIN_AIRPORT_CODE_ELEMENT.click();
	}
	public void selectAirportCountrycode() {
		driver.switchTo().alert();
		
	}
}
