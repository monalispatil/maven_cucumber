package StepDefination1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	public static WebDriver driv;
	@Given("User is on Flipkart login page")
	public void user_is_on_flipkart_login_page()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Flipkart_cucumber\\src\\main\\resources\\Driver_Path\\chromedriver.exe");
		   driv = new ChromeDriver();
		   driv.get("https://www.flipkart.com");
		   driv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driv.manage().window().maximize();
	}
	@When("user enters Email\\/Mobile Number")
	public void user_enters_email_mobile_number()
	{
		driv.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9860007305");
	}
	@When("user enters password")
	public void user_enters_password()
	{
		driv.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Anushka@22");
	}
	@When("user clicks on Login then")
	public void user_clicks_on_login_then()
	{
		driv.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	}
	@Then("User navigates to flipkart home page")
	public void user_navigates_to_flipkart_home_page()
	{
		System.out.println("User is on Flipkart home page");
	}


}
