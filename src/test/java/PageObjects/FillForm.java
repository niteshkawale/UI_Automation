package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FillForm {
	WebDriver driver;
	
	
	public FillForm(WebDriver driver) {
		this.driver = driver;		
	}
	
	By selector_name = By.xpath("input-username");
	
	public void enterName() {
		driver.findElement(selector_name).sendKeys("Nitesh");
	}
}
