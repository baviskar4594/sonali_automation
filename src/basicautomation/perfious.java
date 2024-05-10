package basicautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

public class perfious{

    static String mobile = "9885654007";
    static String email = "SONA@Snapmint.com";
    static String name = "SONA";
    static String lastname = "savkare";
    static String password = "12345678";
    static String orderid = "8976";
    static String ordervalue = "9000";
    static String merchant_id = "1";
    static String store_id = "1";
    static String PAN_number = "EGBPS1446W";
    static String OTP = "1010";

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   
    	driver.get("https://snapmint:ciHns$%40NKSa@qa2.snapmint.com/merchant-demo");      
        driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
    		
        driver.findElement(By.name("mobile")).sendKeys(mobile);
        driver.findElement(By.name("email")).sendKeys(email);
       
		clearAndSendKeys(driver, "merchant_id", merchant_id);
	     clearAndSendKeys(driver, "store_id", store_id);
	     clearAndSendKeys(driver, "order_id", orderid);
	     clearAndSendKeys(driver, "order_value", ordervalue);
	     clearAndSendKeys(driver, "full_name", "");
	     clearAndSendKeys(driver, "email", email);
	     driver.findElement(By.id("checksum_btn")).click();
	     driver.findElement(By.id("submit_btn")).click();
	     driver.findElement(By.name("otp")).sendKeys(OTP);
	     driver.findElement(By.id("firstName")).sendKeys(name);
	     driver.findElement(By.id("lastName")).sendKeys(lastname);
	     driver.findElement(By.name("panNumber")).sendKeys(PAN_number);
    WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@name='gender' and @value='f']"));
	            femaleRadioButton.click();	
	 WebElement day = driver.findElement(By.xpath("//div[@class='w-[100%] h-[48px] border-[1px] rounded-[4px] text-center border-[#DEE4E5] flex items-center']"));
		        day.click();
    WebElement dayElement1 = driver.findElement(By.xpath("//div[@class='even:bg-[#F4F7FF] odd:bg-white pl-4']"));
		        dayElement1.click();
    WebElement month = driver.findElement(By.xpath("//div[contains(text(),'Month')]"));
		        month.click();
    WebElement monthElement1 = driver.findElement(By.xpath("//div[normalize-space()='May']"));
		        monthElement1.click();
    WebElement year = driver.findElement(By.xpath("//div[contains(text(),'Year')]"));
		        year.click();
	 WebElement yearElement1 = driver.findElement(By.xpath("//div[normalize-space()='1999']"));
		        yearElement1.click();
		 driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
		 Thread.sleep(3000);
		 
	
		WebElement SalariedRadioButton = driver.findElement(By.xpath("//input[@name='profession' and @value='salaried']"));
        SalariedRadioButton.click();
		
	           driver.findElement(By.id("companyName")).sendKeys("snapmint");
	           driver.findElement(By.id("monthlyIncome")).sendKeys("50000");
	           
	      	 WebElement salary=driver.findElement(By.xpath("(//select)[1]"));
	       
			Select status=new Select(salary);
	  	     status.selectByVisibleText("UNION BANK OF INDIA");
	  	        driver.findElement(By.xpath("//button[normalize-space()='Verify income by OTP on SETU (OneMoney) portal']")).click();
	  	      
              driver.findElement(By.xpath("//a[normalize-space()='Success']")).click();
              driver.findElement(By.xpath("//button[normalize-space()='Pay in 3 Months EMIs']")).click();
		        	    
             
              for (int i = 1; i <= 3; i++) {
                  WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Add'])[" + i + "]")));
                  addButton.click();
                  WebElement closeButton = driver.findElement(By.xpath("//span[@class='hv-close-button']"));
                  closeButton.click();

                  
                  String filePath = "C:\\image\\Capture" + i ;
                  uploadImage("C:\\image\\Capture");
              }       
              

    }
    public static void uploadImage(String filePath) throws Exception {
        String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
        String fullPath = desktopPath + File.separator + "C:\\image\\Capture";

        Robot rb = new Robot();
        rb.delay(2000);

        // Put the path to file in clipboard
        StringSelection ss = new StringSelection("C:\\image\\Capture");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        // Ctrl+V to paste the file path
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // Press Enter to confirm
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }



private static void clearAndSendKeys(WebDriver driver, String name, String value)
{
    WebElement textField = driver.findElement(By.name(name));
    textField.clear();
    textField.sendKeys(value);
}

	    }


