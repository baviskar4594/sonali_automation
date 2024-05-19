package basicautomation;


import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewUser {


	public static void main(String[] args) throws InterruptedException 
	{
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://snapmint:ciHns$%40NKSa@qa2.snapmint.com/merchant-demo");
		        
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		        clearAndSendKeys(driver, "mobile", "6633389899");
		        System.out.println("enter the mobile number");
		        
		        clearAndSendKeys(driver, "merchant_id", "1");
		        System.out.println("enter the merchant id ");
		        
		        clearAndSendKeys(driver, "store_id", "4");
		        System.out.println("enter the store id ");
		        
		        clearAndSendKeys(driver, "order_id", "hhjsPr");
		        System.out.println("enter order id");
		        
		        clearAndSendKeys(driver, "order_value", "11000");
		        System.out.println("enter the order value");
		        
		        clearAndSendKeys(driver, "full_name", "Kashish");
		        System.out.println("enter the full name");
		        
		        clearAndSendKeys(driver, "email", "kashish@gmail.com");
		        System.out.println("enter the gmail id ");
		        
		        driver.findElement(By.id("checksum_btn")).click();
		        driver.findElement(By.id("submit_btn")).click();
		        driver.findElement(By.name("otp")).sendKeys("1010");
		        System.out.println("enter the otp");
		        
//		        clearAndSendKeys(driver, "firstName", "Sristis");
//		        clearAndSendKeys(driver, "lastName", "Verma");
		        driver.findElement(By.name("panNumber")).sendKeys("AEGPH4565P");
		        System.out.println("enter the pan number");
		        
		        WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@name='gender' and @value='f']"));
	
		        femaleRadioButton.click();
		        System.out.println("select gender");
		        driver.findElement(By.xpath("//div[text()='Day']")).click();
		        Thread.sleep(2000);
		        System.out.println("User click on Day tab");

		        driver.findElement(By.xpath("(//*[@class='even:bg-[#F4F7FF] odd:bg-white pl-4'])[2]")).click();
		        Thread.sleep(2000);
		        System.out.println("User Select Day from Dropdown");

		        driver.findElement(By.xpath("(//*[@class='w-[100%] h-[48px] border-[1px] rounded-[4px] text-center border-[#DEE4E5] flex items-center'])[2]")).click();
		        Thread.sleep(2000);

		        // Selecting the month of June
		        driver.findElement(By.xpath("//*[text()='June']")).click();
		        Thread.sleep(2000);
		        System.out.println("User Select Month from Dropdown");

	
//		        WebElement yearElement = driver.findElement(By.xpath("//div[contains(@class, 'w-[100%]') and contains(@class, 'h-[48px]') and contains(@class, 'border-[1px]') and contains(@class, 'rounded-[4px]') and contains(@class, 'text-center') and contains(@class, 'border-[#DEE4E5]') and contains(@class, 'flex') and contains(@class, 'items-center') and not(contains(@class, 'pl-4'))]"));
//		        yearElement.click();
//
//
//
//		        WebElement yearElement1 = driver.findElement(By.xpath("(//div[contains(@class,'even:bg-[#F4F7FF]') and contains(@class,'odd:bg-white') and contains(@class,'pl-4')])[2]"));
//		        yearElement1.click();
//		        System.out.println("select year");

		       

		        driver.findElement(By.xpath("//button[@class='bg-secondaryText snap-primary-button w-full flex-1 text-xl py-8'] ")).click();
		        
		        driver.findElement(By.name("email")).sendKeys("snapmint@gmail.com");
		        driver.findElement(By.xpath("//button[contains(@class, 'bg-secondaryText') and contains(@class, 'snap-primary-button') and contains(text(), 'Next')]")).click();

		        		
//					Thread.sleep(60000);	
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		        FluentWait<WebDriver> wait = new FluentWait<>(driver)
//		        	    .withTimeout(Duration.ofSeconds(10))  // Set the timeout duration
//		        	    .pollingEvery(Duration.ofMillis(500)) // Polling interval
//		        	    .ignoring(NoSuchElementException.class);
//				FluentWait<WebDriver> wait1 = wait;
//				//		       
//		        WebElement addButton = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/div/button")));
//		        addButton.click();
//
//	      
//        	 driver.findElement(By.cssSelector("button.snap-primary-button")).click();

//		        	
//		        
//		        driver.findElement(By.xpath("//button[text()='Add']")).click();
		System.out.println("jncjvfv");
//	
	}
		    private static void clearAndSendKeys(WebDriver driver, String name, String value) 
		    {
		        WebElement textField = driver.findElement(By.name(name));
		        textField.clear();
		        textField.sendKeys(value);
		    }
		}
