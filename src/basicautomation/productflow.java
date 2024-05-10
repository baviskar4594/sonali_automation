package basicautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;


public class productflow
{
	

    public static void main(String[] args) throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.snapmint.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//button[normalize-space()='Sign-up']")).click();
           driver.findElement(By.name("mobile")).sendKeys("9850425686");
        driver.findElement(By.xpath("//button[normalize-space()='Get OTP']")).click();
        driver.findElement(By.name("otp")).sendKeys("1010");
        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();    	      
        WebElement button = driver.findElement(By.cssSelector("button.whitespace-nowrap.text-snapmint_gray"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        button.click();
        Robot robot = new Robot();

        // Press F11 key
        robot.keyPress(KeyEvent.VK_F11);

        // Release F11 key
        robot.keyRelease(KeyEvent.VK_F11);
    
        driver.findElement(By.xpath("(//img[@class='absolute top-2 right-3 w-[18px] h-[18px] cursor-pointer'])[1]")).click();

     driver.findElement(By.xpath("//p[normalize-space()='Pay']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Wallet']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Freecharge PayLater | UPI | Wallet']")).click();
        driver.findElement(By.xpath("//li[@class='open']//button[@type='button'][normalize-space()='PROCEED']")).click();
        driver.findElement(By.id("OTP")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='submit']")).click();
        driver.findElement(By.xpath("//input[@name='authenticate']")).click();
        driver.findElement(By.xpath("//a[@class='absolute top-3 right-5 ']")).click();
        robot.keyPress(KeyEvent.VK_F11);
        robot.keyRelease(KeyEvent.VK_F11);
        driver.findElement(By.xpath("//a[normalize-space()='x']")).click();
      
    }
}


    	
