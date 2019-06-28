package com.definiation;



import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTraiffOutline {
	
		static WebDriver driver;

		@Given("The user is on telecom page")
		public void the_user_is_on_telecom_page() {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\Sambath\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("http://demo.guru99.com/telecom/");
		}

		@Given("The user click add for traiff plans")
		public void the_user_click_add_for_traiff_plans() {
			driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		  
		}

		@When("The user is filling the details{string},{string},{string},{string},{string},{string},{string}")
		public void the_user_is_filling_the_details(String mthRent, String freeloc, String freeinter, String freeSMS, String locchar, String InterChar, String smschar) {
		  driver.findElement(By.id("rental1")).sendKeys(mthRent);
		  driver.findElement(By.id("local_minutes")).sendKeys(freeloc);
		  driver.findElement(By.id("inter_minutes")).sendKeys(freeinter);
		  driver.findElement(By.id("sms_pack")).sendKeys(freeSMS);
		  driver.findElement(By.id("minutes_charges")).sendKeys(locchar);
		  driver.findElement(By.id("inter_charges")).sendKeys(InterChar);
		  driver.findElement(By.id("sms_charges")).sendKeys(smschar);
		}
		@When("The user is filling")
		public void the_user_is_filling(DataTable dataTable) {
			  List<String> td = dataTable.asList(String.class);
			  
			
			  driver.findElement(By.id("rental1")).sendKeys(td.get(0));
			  driver.findElement(By.id("local_minutes")).sendKeys(td.get(1));
			  driver.findElement(By.id("inter_minutes")).sendKeys(td.get(2));
			  driver.findElement(By.id("sms_pack")).sendKeys(td.get(3));
			  driver.findElement(By.id("minutes_charges")).sendKeys(td.get(4));
			  driver.findElement(By.id("inter_charges")).sendKeys(td.get(5));
			  driver.findElement(By.id("sms_charges")).sendKeys(td.get(6));
		   
		}
		    
		


		

		@When("Click for Submit button")
		public void click_for_Submit_button() {
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
		}

		@Then("Display confirmation pages")
		public void display_confirmation_pages() {
			Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
		}

	}
	








