package com.rc.cucumber.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GoogleStepDefinitions {
	
	public WebDriver driver;
	public GoogleStepDefinitions() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandan N\\Documents\\Chandan Backup\\From Desktop\\eclipse-workspace\\SampleCucumeberProject\\src\\test\\java\\com\\rc\\cucumber\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	
	
	@Given("^User will launch chrome browser and launch google portal$")
	public void user_will_launch_chrome_browser_and_launch_google_portal() throws Throwable {

	driver.navigate().to("https://www.google.com");
	}

	@Then("^User will Enter number (\\d+)$")
	public void user_will_Enter_number(int number) throws Throwable {
	 driver.findElement(By.name("q")).sendKeys(number+"");
	 Thread.sleep(6000);
	}

	@Then("^User will Clear search text field$")
	public void user_will_Clear_search_text_field() throws Throwable {
driver.findElement(By.name("q")).clear();
Thread.sleep(6000);

	}

	@Then("^Usewr will enter \"([^\"]*)\" in Search Text field$")
	public void usewr_will_enter_in_Search_Text_field(String valueString) throws Throwable {
		 driver.findElement(By.name("q")).sendKeys(valueString);
	}

}
