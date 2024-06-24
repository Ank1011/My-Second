package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.util.BaseClass;




public class IndexPage {
	
	WebDriver driver = BaseClass.driver;
	
	public void verifyPage() {
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Guru99 Telecom");
		
	}
	
	public void verifyLink() {
		
		driver.findElement(By.linkText("Add Customer")).isDisplayed();
		
		System.out.println("verify link is visible on the page");
		
		driver.findElement(By.linkText("Add Tariff Plan to Customer")).isDisplayed();
		
		System.out.println("Add Tariff Plan to Customer is visible on the page");

		
	    driver.findElement(By.linkText("Add Tariff Plan")).isDisplayed();
	    
		System.out.println("Add Tariff Plan is visible on the page");

	    driver.findElement(By.linkText("Pay Billing")).isDisplayed();
	    
	    System.out.println("Pay Billing page is visible on the Page");		
	}
     
	public void verifyImageLogo() {
    	 
    	 driver.findElement(By.xpath("//div[contains(@class,'flex-item')]/img")).isDisplayed();
    	 driver.findElement(By.xpath("//a[text()='Guru99 telecom']")).isDisplayed();
    	 
    	 
     }
}
