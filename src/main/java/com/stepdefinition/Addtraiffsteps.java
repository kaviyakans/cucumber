package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addtraiffsteps {
	static WebDriver driver;

	@Given("The user in the telcom page")
	public void the_user_in_the_telcom_page() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Sambath\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("The user click add traiff plans")
	public void the_user_click_add_traiff_plans() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	  
	}

	@When("The user is filling the details")
	public void the_user_is_filling_the_details() {
	  driver.findElement(By.id("rental1")).sendKeys("1000");
	  driver.findElement(By.id("local_minutes")).sendKeys("1000000");
	  driver.findElement(By.id("inter_minutes")).sendKeys("200000");
	  driver.findElement(By.id("sms_pack")).sendKeys("200000");
	  driver.findElement(By.id("minutes_charges")).sendKeys("400000");
	  driver.findElement(By.id("inter_charges")).sendKeys("700000");
	  driver.findElement(By.id("sms_charges")).sendKeys("80000");
	}
	

	@When("Click the Submit button")
	public void click_the_Submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@Then("Display confirmation page")
	public void display_confirmation_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}


}
