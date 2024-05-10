package basicautomation;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Product {

	public static void main(String[] args) 
	{

  	  
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.snapmint.com/p/coolerss-a-ram-3-gb-storage-64-gb-mobiles-on-emi?productInventoryId=3113");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//button[normalize-space()='Sign-up']")).click();
        

      
       driver.findElement(By.name("mobile")).sendKeys("9883971367");
        driver.findElement(By.xpath("//button[normalize-space()='Get OTP']")).click();
        driver.findElement(By.name("otp")).sendKeys("1010");
        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
        driver.findElement(By.id("//button[normalize-space()='Buy on 3 months EMI']")).click();
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

//        driver.findElement(By.xpath("")).click();
         try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      


        FluentWait<WebDriver> wait = new FluentWait<>(driver)
        	    .withTimeout(Duration.ofSeconds(10))  // Set the timeout duration
        	    .pollingEvery(Duration.ofMillis(500)) // Polling interval
        	    .ignoring(NoSuchElementException.class);
		FluentWait<WebDriver> wait1 = wait;


    
    }


	}


