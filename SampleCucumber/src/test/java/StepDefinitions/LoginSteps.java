//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginSteps {
//	WebDriver driver = null;
//@Given("browser is open")
//public void browser_is_open() {
//	String Location=System.getProperty("user.dir");
//	System.out.println("The path is "+Location);
//	System.setProperty("webdriver.chrome.driver",Location+"//src//test//resources//drivers//chromedriver1.exe");
//	driver=new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	driver.manage().window().maximize();
//}
//
//@And("user is in login page")
//public void user_is_in_login_page() throws InterruptedException {
//	driver.navigate().to("https://example.testproject.io/web/");
//	Thread.sleep(2000);
//}
//
//@When("^user enters (.*) and(.*)$")
//public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//	driver.findElement(By.id("name")).sendKeys(username);
//	Thread.sleep(2000);
//	driver.findElement(By.id("password")).sendKeys(password);
//	Thread.sleep(2000);
//
//  
//}
//@And("user clicks on login button")
//public void user_clicks_on_login() {
//	driver.findElement(By.id("login")).click();
//  
//}
//@Then("user is navigated to the homepage")
//public void user_is_navigated_to_the_homepage() {
//	driver.close();
//  
//}
//
//
//
//
//}
