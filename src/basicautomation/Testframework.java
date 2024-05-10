package basicautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testframework {

	public static void main(String[] args)
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://qa2.snapmint.com/admin/dashboard");
		 driver.findElement(By.name("admin_user[email]")).sendKeys("sonali.b@snapmint.com");
		 driver.findElement(By.name("admin_user[password]")).sendKeys("12345678");
		 driver.findElement(By.xpath("//*[@name='commit']")).click();
		 driver.get("https://qa2.snapmint.com/admin/test_frameworks/1273");
		 driver.findElement(By.xpath("//a[text()='Edit Test Framework']")).click();
		 driver.findElement(By.xpath("test_framework_mobile")).sendKeys("9167660022");
		 driver.manage().window().maximize();
//		 driver.findElement(By.xpath("//input[@name='commit']")).click();
		 
		 driver.findElement(By.name("commit")).click();

	}

}
