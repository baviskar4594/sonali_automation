package basicautomation;

 import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class admin {

	 
		public static void main(String[] args) {
			// System.out.println("hi");
			 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell Latitude\\Desktop\\drivers\\chrome\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 
			 driver.get("https://qa2.snapmint.com/admin/dashboard");
			 driver.findElement(By.name("admin_user[email]")).sendKeys("sonali.b@snapmint.com");
			 driver.findElement(By.name("admin_user[password]")).sendKeys("12345678");
			 driver.findElement(By.xpath("//*[@name='commit']")).click();
			 //driver.findElement(By.xpath("//a[normalize-space()='Master Data']")).click();
//			 driver.findElement(By.xpath("//a[text()='Master Data']")).click();
			 
			 driver.get("https://qa2.snapmint.com/admin/users");
			  driver.manage().window().maximize();
			  driver.findElement(By.id("q_mobile")).sendKeys("8692891765");
			  WebElement mobileNumberInput = driver.findElement(By.id("q_mobile"));
		        mobileNumberInput.sendKeys("9167041736");

		 
		        mobileNumberInput.sendKeys(Keys.ENTER);
		        driver.findElement(By.xpath("//a[@class='resource_id_link']")).click();
		        
			 driver.findElement(By.xpath("//a[contains(text(),'Boost Eligible Now')]")).click();
			
			 FluentWait<WebDriver> wait = new FluentWait<>(driver)
			         .withTimeout(Duration.ofSeconds(30))
			         .pollingEvery(Duration.ofSeconds(1));

			 WebElement boostlimitInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='remark']")));

			
			 boostlimitInput.sendKeys("20000");
			 boostlimitInput.submit();
			 
			 
			 driver.findElement(By.xpath("//a[normalize-space()='Change Approved Limit']")).click();
			 
			 WebElement approvedlimitInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='boost_limit_form']//input[@id='remark']")));

			
			 approvedlimitInput.sendKeys("20000");
			 approvedlimitInput.submit();
			 
			 
			 

		}

	
	}


