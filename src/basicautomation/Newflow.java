package basicautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newflow {

	public static void main(String[] args) throws InterruptedException 
	{
	
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://snapmint:ciHns$%40NKSa@qa2.snapmint.com/merchant-demo");
	        
	        driver.manage().window().maximize();
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        clearAndSendKeys(driver, "mobile", "9733389899");
	        System.out.println("enter the mobile number");
	        
	        clearAndSendKeys(driver, "merchant_id", "114");
	        System.out.println("enter the merchant id ");
	        
	        clearAndSendKeys(driver, "store_id", "1");
	        System.out.println("enter the store id ");
	        
	        clearAndSendKeys(driver, "order_id", "ssona");
	        System.out.println("enter order id");
	        
	        clearAndSendKeys(driver, "order_value", "9000");
	        System.out.println("enter the order value");
	        
	        clearAndSendKeys(driver, "full_name", "Kashish");
	        System.out.println("enter the full name");
	        
	        clearAndSendKeys(driver, "email", "kashish@gmail.com");
	        System.out.println("enter the gmail id ");
	        
	        driver.findElement(By.id("checksum_btn")).click();
	        driver.findElement(By.id("submit_btn")).click();
	        driver.findElement(By.name("otp")).sendKeys("1010");
	        System.out.println("enter the otp");
	        
//	        clearAndSendKeys(driver, "firstName", "Sristis");
//	        clearAndSendKeys(driver, "lastName", "Verma");
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
	        
	        WebElement year = driver.findElement(By.xpath("//div[contains(text(),'Year')]"));
	        year.click();
	        WebElement yearElement1 = driver.findElement(By.xpath("//div[normalize-space()='1999']"));
	        yearElement1.click();
	        System.out.println("select year");
	       
	        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
	        
	        
	        Thread.sleep(3000);


	}

	private static void clearAndSendKeys(WebDriver driver, String string, String string2) {
		// TODO Auto-generated method stub
		
	}

}
