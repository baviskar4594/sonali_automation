package basicautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refund {

	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://qa2.snapmint.com/admin/dashboard");
		 driver.findElement(By.name("admin_user[email]")).sendKeys("sonali.b@snapmint.com");
		 driver.findElement(By.name("admin_user[password]")).sendKeys("12345678");
		 driver.findElement(By.xpath("//*[@name='commit']")).click();
		  driver.manage().window().maximize();
		 driver.findElement(By.partialLinkText("Refunds")).click();
		 driver.findElement(By.id("post_auth_refunds")).click();
		 

	}

}
