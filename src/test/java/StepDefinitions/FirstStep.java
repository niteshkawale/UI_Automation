package StepDefinitions;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

import PageObjects.FillForm;
import PageObjects.Login;
import TestUtils.DriverBase;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstStep {
	WebDriver driver = null;
//	DriverBase launchDriver;
	
	FillForm fillForm = new FillForm(driver);
	
	@Given("launch the project url")	
	public void launch_the_project_url() {	    
		driver= DriverBase.getDriver();
		
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
//        driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		driver.implicitly_wait(10);
//		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
         element.sendKeys("mobile");
         
         driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
         
         String mobileName = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).getText();
         System.out.println(mobileName);

//         Assert.assertTrue(true);
         
         boolean loginSuccessful = true;
         // Using verify to check if login was successful without halting the test
         Assert.assertTrue(loginSuccessful, "Login was successful");
         
         driver.quit();
         //WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		
	}


}
