package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		String Location=System.getProperty("user.dir");
		System.out.println("The path is "+Location);
		
		System.setProperty("webdriver.chrome.driver",Location+"//src//test//resources//drivers//chromedriver1.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		driver.navigate().to("https://www.google.com");
		
	}

	@When("user enter a text in google search box")
	public void user_enter_a_text_in_google_search_box() {
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}
	

@Then("user is navigated to the search re sult page")
public void user_is_navigated_to_the_search_re_sult_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(" closing the browser");
	driver.close();
}



}
