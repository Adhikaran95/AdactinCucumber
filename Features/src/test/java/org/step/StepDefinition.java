package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	PomClass q = new PomClass();

	@Given("Launching the URL")
	public void launching_the_url() {

		url("https://adactinhotelapp.com/");

	}

	@When("Entering the username")
	public void entering_the_username() {

		WebElement ele = driver.findElement(q.userName);

		SendKeys(ele, "AdhiKaran95");

	}

	@When("Entering the password")
	public void entering_the_password() {

		WebElement ele = driver.findElement(q.Password);

		SendKeys(ele, "Nithya@7299");
	}

	@When("Clicking the login button")
	public void clicking_the_login_button() {
		
		WebElement logIn = driver.findElement(q.Login);
		
		Click(logIn);

	}
	
	@When("User select the location")
	public void user_select_the_location() {
		
	WebElement Location=driver.findElement(q.Location);
	Click(Location);
	}
	
	@When("select the location as london")
	public void select_the_location_as_london() {
		WebElement london=driver.findElement(q.London);
		Click(london);
		
	}
	@When("select the Hotel")
	public void select_the_hotel() {
	    
	    WebElement Hotel=driver.findElement(q.Hotel);
	    Click(Hotel);
	}

	@When("select the Hotel as Hotel Hervey")
	public void select_the_hotel_as_hotel_hervey() {
	    
	WebElement HotelHervey=driver.findElement(q.HotelHervey);
	Click(HotelHervey);
	
			
	}
}