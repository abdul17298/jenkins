package org.Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	static  WebDriver driver;
	@Given("user is on insta page")
	public void user_is_on_insta_page() throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(9000);
		
	}

	@When("user should enter username and password")
	public void user_should_enter_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("md._.abdul");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("17298abdullah");
		Thread.sleep(9000);
		
	}

	@Then("user should click login")
	public void user_should_click_login() {
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		
		
	}

	@Then("user is on main page")
	public void user_is_on_main_page() {
		
		System.out.println("Enter sucessfully");
		
	}
}
