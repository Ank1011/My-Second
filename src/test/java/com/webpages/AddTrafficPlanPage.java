package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTrafficPlanPage {
	
	WebDriver driver;
	
	public AddTrafficPlanPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void goToAddTrafficPlan() throws InterruptedException {
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@href='addtariffplans.php'])[1]")).isDisplayed();
        driver.findElement(By.xpath("(//a[@href='addtariffplans.php'])[1]")).click();
        
        String url="https://demo.guru99.com/telecom/index.html#google_vignette";
        
        String expurl= driver.getCurrentUrl();
        
        if(url.equalsIgnoreCase(expurl)) {
        	driver.navigate().refresh();
        	driver.findElement(By.xpath("(//a[@href='addtariffplans.php'])[1]")).isDisplayed();
	        driver.findElement(By.xpath("(//a[@href='addtariffplans.php'])[1]")).click();
        }
	}
	
	public void addTrafficPlanDetails() throws InterruptedException {
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("rental1")).sendKeys("3");
		driver.findElement(By.name("local_minutes")).sendKeys("180");
		driver.findElement(By.name("inter_minutes")).sendKeys("30");
		driver.findElement(By.name("sms_pack")).sendKeys("60");
		driver.findElement(By.name("minutes_charges")).sendKeys("1");
		driver.findElement(By.name("inter_charges")).sendKeys("10");
		driver.findElement(By.name("sms_charges")).sendKeys("1");
		driver.findElement(By.name("submit")).click();;
		
	}
	
	public void getCongratulation() {
		
		driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText();
	}
	
	public void goATPHome() {
		
		driver.findElement(By.className("button")).click();
		
	}

}
