package com.webpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddCustomerPage {
	
	WebDriver driver;
	public static String cus_num;
	public AddCustomerPage(WebDriver driver){
		
		this.driver = driver;
		
		
	}
	
	public void gotoAddCustomerpage() {
		
		driver.findElement(By.linkText("Add Customer")).isDisplayed();
        driver.findElement(By.linkText("Add Customer")).click();
		String url ="https://demo.guru99.com/telecom/index.html#google_vignette";
		
		String expurl = driver.getCurrentUrl();
		
		if(url.equalsIgnoreCase(expurl)) {
			driver.navigate().refresh();
			driver.findElement(By.linkText("Add Customer")).isDisplayed();
	        driver.findElement(By.linkText("Add Customer")).click();
		}
		
		
		
		
	}
	
	public void addCustomerDetails() throws InterruptedException {
		
	   Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//label[@for='done']")).click();
		System.out.println("1");
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Ankit");
		System.out.println("2");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Gupta");
		System.out.println("3");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ankit@gmail.com");
		System.out.println("4");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Gurgaon");
		System.out.println("5");
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("1234567890");
		System.out.println("6");
		driver.findElement(By.name("submit")).click();
		System.out.println("7");
		
		
	}
	
	public void accessdetails() throws Exception {
		
		Thread.sleep(2000);
		String cus_id = driver.findElement(By.xpath("//b[text()='Customer ID']")).getText();
		System.out.print(cus_id);
		cus_num = driver.findElement(By.xpath("//td[@align='center'][2]/h3")).getText();
		System.out.println(" " +cus_num);
		Thread.sleep(2000);
		
	}
	
	public static String getcus_id() {
		System.out.println(cus_num);
		return cus_num;
		
		
		
	}
	
	public void redirectHome() {
		
		driver.findElement(By.xpath("(//a[@href='index.html'])[2]")).click();
	}
	
	
}
