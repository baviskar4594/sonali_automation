package basicautomation;

import java.awt.Robot;
import java.time.Duration;
import java.util.NoSuchElementException;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MerchantDemo {

	public static void main(String[] args) throws InterruptedException
	{
		 
	
		 WebDriver driver = new ChromeDriver();

		 driver.get("https://snapmint:ciHns$%40NKSa@qa2.snapmint.com/merchant-demo");
		 driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.findElement(By.name("mobile")).sendKeys("9850425686");
		
	        clearAndSendKeys(driver, "merchant_id", "114");
	        clearAndSendKeys(driver, "store_id", "1");
	        clearAndSendKeys(driver, "order_id", "ssdj");
	        clearAndSendKeys(driver, "order_value", "5000");
	        clearAndSendKeys(driver, "full_name", "");
	        clearAndSendKeys(driver, "email", "");
	        driver.findElement(By.id("checksum_btn")).click();
	        driver.findElement(By.id("submit_btn")).click();
	        driver.navigate().refresh();
	        driver.findElement(By.name("otp")).sendKeys("1010");
	        FluentWait<WebDriver> wait = new FluentWait<>(driver)
	        	    .withTimeout(Duration.ofSeconds(10))  // Set the timeout duration
	        	    .pollingEvery(Duration.ofMillis(500)) // Polling interval
	        	   .ignoring(NoSuchElementException.class); // Ignore the exception if the element is not found
	        
	        	// Wait for the button to be clickable
//	        	WebElement selectPlanButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Pay in 3 Months EMIs']")));
//	          selectPlanButton.click();
//              driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
	        driver.findElement(By.xpath("//button[@class='bg-primary text-darkGreen  snap-primary-button w-[100%] px-[0px]']")).click();
//	  	  System.out.println("select T&C");
	  	  Thread.sleep(1000);
              driver.findElement(By.id("upiId")).sendKeys("7777777777@paytm");
              driver.findElement(By.xpath("//button[contains()='Pay']")).click(); 
              WebElement button1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Pay ₹')]")));
            button1.click();
            ((Robot) button1).delay(2000);

              // Find the downpayment button
//              WebElement downpaymentButton = driver.findElement(By.xpath("// button[@class='bg-primary text-darkGreen  snap-primary-button py-[16px] h-[40PX] w-[164px] mx-auto text-[12px] mt-[12px]'])"));

              // Click the downpayment button
//              downpaymentButton.click();
              
//              WebElement element = driver.findElement(By.xpath("//img[@src='https://staticgw1.paytm.in/native/bank/SBI.png']"));
//              
//              element.click();
//              System.out.println("click on sbi");
//              WebElement element1 = driver.findElement(By.xpath("//button[@class='bg-primary text-darkGreen  snap-primary-button py-[16px] h-[40PX] w-[164px] mx-auto text-[12px] mt-[12px]']"));
//              element1.click();
//             
	     
	   
		        
	}
		
private static void clearAndSendKeys(WebDriver driver, String name, String value) 
{
    WebElement textField = driver.findElement(By.name(name));
    textField.clear();
    textField.sendKeys(value);
}
}
	 

	
