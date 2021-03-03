package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	protected WebDriver driver;
	protected By txt_username=By.id("name");
	protected By txt_password=By.id("password");
	protected By Button_Login=By.id("login");
	protected By btn_logout=By.id("logout");
	public loginPage(WebDriver driver) {
		this.driver=driver;
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException(" This is not Login page. The Current page is "+driver.getCurrentUrl());
		}
	}
	
	public void enter_username(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enter_password(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void Click_loginbutton() {
		driver.findElement(Button_Login).click();
	}
	
	public void Check_logoutisdisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}
	
	
	public void Loginvaliduser(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(Button_Login).click();


	}
	
}
