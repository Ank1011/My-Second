package com.webpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtrafficpalantocustomerPage {
	
	WebDriver driver;
	public AddtrafficpalantocustomerPage(WebDriver driver){
		
		this.driver = driver;
		
		
		
	}
	
	public void goTOAddtrafficpalantocustomerPage() {
		
		driver.findElement(By.linkText("Add Tariff Plan to Customer")).isDisplayed();
        driver.findElement(By.linkText("Add Tariff Plan to Customer")).click();
	}
	
	public void enteredCustomerID() {
		
		String cus_id = AddCustomerPage.getcus_id();
		WebElement customer_id = driver.findElement(By.id("customer_id"));
		customer_id.sendKeys(cus_id);
		driver.findElement(By.name("submit")).click();
		
	
	}
	
	public void addPlanToCustomer() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Add Tariff Plan to Customer']")).isDisplayed();
		driver.findElement(By.xpath("//input[@value='Add Tariff Plan to Customer']")).click();
	}
	
	public void Successmsg() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Congratulation Tariff Plan assigned']")).isDisplayed();
	}
	
public void redirectHome() {
		
		driver.findElement(By.xpath("(//a[@href='index.html'])[2]")).click();
	}
	
}
