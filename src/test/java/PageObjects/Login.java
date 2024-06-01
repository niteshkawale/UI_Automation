package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver= driver;
		
	}

	By register = By.xpath("//a[@class='btn btn-black navbar-btn']");
	
	public void clickRegister() {
		driver.findElement(register).click();
	}
}
