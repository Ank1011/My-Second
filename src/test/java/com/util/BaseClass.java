package com.util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webpages.AddCustomerPage;
import com.webpages.AddTrafficPlanPage;
import com.webpages.AddtrafficpalantocustomerPage;
import com.webpages.IndexPage;

public class BaseClass {
	
   public static WebDriver driver;
	
	
  // AddTrafficPlanPage atp = new AddTrafficPlanPage(driver);
   
   
	
	@BeforeTest
	public void startSession() {
		
		
		
		   
		
		
		 System.setProperty("webdriver.chrome.driver",
		  "E://Testingtools//Tools//chromedriver.exe");
		  
		
		 
		 	
			/*
			 * WebDriverManager.chromedriver().setup(); ChromeOptions option = new
			 * ChromeOptions(); option.addArguments("--remote-allow-origins=*");
			 */
		
		 driver = new ChromeDriver();
		 //driver.manage().window().maximize();
		 
		 
		 
		
		}
	
	
	
	
	@Test(priority = 1)
	public void launchApp() {
		driver.get("https://demo.guru99.com/telecom/index.html");
		//System.out.println("Tittle Name" +driver.getTitle());
		
		
	}
	
		@AfterTest
	public void endSession() {
		//driver.close();
	}
		@Test(priority = 2)
		public void verifypageIndex() {
	
			IndexPage ip = new IndexPage(); 
			ip.verifyPage();
	
		}
		@Test(priority = 3)
		
		public void verifyLink() {
			IndexPage ip = new IndexPage(); 
			ip.verifyLink();

		}
		@Test(priority = 4)
		public void verifyImagelogoOnPage() {
			IndexPage ip = new IndexPage(); 
			ip.verifyImageLogo();
			


		}
		@Test(priority = 5)
		public void verifyAddCustomerPage() {
			
			AddCustomerPage acp = new AddCustomerPage(driver);
			acp.gotoAddCustomerpage();
			
		}
		
		@Test(priority = 6)
		
		public void verifyaddcustomerDetails() {
			
			
			AddCustomerPage acp = new AddCustomerPage(driver);
			try {
				acp.addCustomerDetails();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		@Test(priority = 7)
		
		public void verifyaccessdetails() throws Exception {
			AddCustomerPage acp = new AddCustomerPage(driver);
            acp.accessdetails();
			
		}
		
		@Test(priority =8)
		public void verifyredirectHome() {
			
			AddCustomerPage acp = new AddCustomerPage(driver);
			acp.redirectHome();
		}
		
		@Test(priority = 9)
		public void verifygoToAddTrafficPlan() throws InterruptedException {
			AddTrafficPlanPage atp = new AddTrafficPlanPage(driver);
			atp.goToAddTrafficPlan();
		}
		
		@Test(priority = 10)
		public void verifyaddTrafficPlanDetails() throws InterruptedException {
			AddTrafficPlanPage atp = new AddTrafficPlanPage(driver);
			atp.addTrafficPlanDetails();
			

			
		}
		
		@Test(priority = 11)
		
		public void verifgoATPHome() {
			AddTrafficPlanPage atp = new AddTrafficPlanPage(driver);
			
			atp.goATPHome();

			
		}
		
		@Test(priority = 12)
		public void verifyAddtrafficpalantocustomerPage() {
			
			AddtrafficpalantocustomerPage atp = new AddtrafficpalantocustomerPage(driver);
			
			atp.goTOAddtrafficpalantocustomerPage();
		}
		@Test(priority = 13)
		public void verifyenteredCustomerID() {
			
			AddtrafficpalantocustomerPage atp = new AddtrafficpalantocustomerPage(driver);
			
			atp.enteredCustomerID();
			
		}
		
		@Test(priority = 14)
		public void verifyClickonAddplanCustomer() throws InterruptedException {
			
			AddtrafficpalantocustomerPage atpc = new AddtrafficpalantocustomerPage(driver);
			atpc.addPlanToCustomer();
			
			
			
		}
		
		@Test(priority = 15)
		public void verifysuccesssmsg() throws InterruptedException {
			
			AddtrafficpalantocustomerPage atpc = new AddtrafficpalantocustomerPage(driver);
			atpc.Successmsg();
			
			
			
		}
		
		@Test(priority = 16)
		public void verifyHomePage() {
			
			
			AddtrafficpalantocustomerPage atpc = new AddtrafficpalantocustomerPage(driver);
			atpc.redirectHome();
			
			
			
		}
		
		
		
}
