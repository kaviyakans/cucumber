package com.stepdefinition;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Addcustomersteps {
	static WebDriver driver;
	
	
	@Given("The user is in telecom page")
	public void the_user_is_in_telecom_page() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Sambath\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("The user click to add on customer")
	public void the_user_click_to_add_on_customer() {
	   driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();;
	}

	@When("The user is filling all the details")
	public void the_user_is_filling_all_the_details() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("kaviya");
		driver.findElement(By.id("lname")).sendKeys("sampath");
		driver.findElement(By.id("email")).sendKeys("kaviyakans@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("green Tech");
		driver.findElement(By.id("telephoneno")).sendKeys("123456789");
		
		
		
	   
	}

	@When("The user click on submit button")
	public void the_user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("the user should display customer id")
	public void the_user_should_display_customer_id() {
	Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	   
	}



}
