package basicautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class completeloanplace
{
	static  String mobile ="8800114337";
	static  String email ="sonali.b@Snapmint.com";
	static  String name ="ss";
	static  String lastname ="SDSSF";
	static  String password ="12345678";
	static  String orderid ="test";
	static  String ordervalue ="13000";
	static  String merchant_id ="114";
	static  String store_id ="1";
	static  String PAN_number ="EGBPS3659I";
	static  String OTP ="1010";
	
	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		  WebDriver driver = new ChromeDriver();
		  
// To login in admin 
		     driver.get("https://qa2.snapmint.com/admin/dashboard");
			 driver.findElement(By.name("admin_user[email]")).sendKeys(email);
			 driver.findElement(By.name("admin_user[password]")).sendKeys(password);
			 driver.findElement(By.xpath("//*[@name='commit']")).click();
			 
// To check user is new or old from admin user			 
			 driver.get("https://qa2.snapmint.com/admin/users");
			 driver.manage().window().maximize();
			 driver.findElement(By.id("q_mobile")).sendKeys(mobile );
		WebElement mobileNumberInput = driver.findElement(By.id("q_mobile"));
		           mobileNumberInput.sendKeys(mobile);  
		           mobileNumberInput.sendKeys(Keys.ENTER);
		           
// To create the user from the merchant demo frontend
		     driver.get("https://snapmint:ciHns$%40NKSa@qa2.snapmint.com/merchant-demo");      
             driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		     clearAndSendKeys(driver, "mobile", mobile );
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
		 String CurrentpageURL = driver.getCurrentUrl();
		 
		 
// for create test framework and  add user in testframework from backend
		    driver.get("https://qa2.snapmint.com/admin/test_frameworks");
		    driver.findElement(By.xpath("//a[text()='New Test Framework']")).click();
		    driver.findElement(By.id("test_framework_user_name")).sendKeys("usertest");
		    driver.findElement(By.id("test_framework_mobile")).sendKeys(mobile );
		 WebElement textField = driver.findElement(By.id("test_framework_rules"));
			        textField.clear();
			        textField.sendKeys("{:kyc=>\"ask\", :is_enach_required=>0, :nla=>1, :nla_message_code=>6}");
		    driver.findElement(By.xpath("//input[@value='Create Test framework']")).click();
		
//for skip the perfious screen from  backend
		    driver.get("https://qa2.snapmint.com/admin/users");
			driver.manage().window().maximize();
			driver.findElement(By.id("q_mobile")).sendKeys(mobile );
		 WebElement mobileNumberInput1 = driver.findElement(By.id("q_mobile"));
		            mobileNumberInput1.sendKeys(mobile );
		            mobileNumberInput1.sendKeys(Keys.ENTER);
		    driver.findElement(By.xpath("//a[@class='resource_id_link']")).click();   
			driver.findElement(By.xpath("//a[contains(text(),'Boost Eligible Now')]")).click();
	     WebElement boostlimitInput =driver.findElement(By.xpath("//input[@id='remark']"));	
			        boostlimitInput.sendKeys("20000");
			        boostlimitInput.submit();
			driver.findElement(By.xpath("//a[normalize-space()='Change Approved Limit']")).click();
		 WebElement approvedlimitInput = driver.findElement(By.xpath("//form[@id='boost_limit_form']//input[@id='remark']"));
					approvedlimitInput.sendKeys("20000");
					approvedlimitInput.submit();
					
//For comeing back to frontend page
			driver.get(CurrentpageURL);	
		
//For manual digilocker KYC from backend
		 WebElement digilocker =driver.findElement(By.xpath("//button[@class='bg-primary text-darkGreen  snap-primary-button text-xl mt-6 w-full']"));   
			        digilocker.click();	
		 WebElement digilockername = driver.findElement(By.xpath("(//*[@type='text'])[1]"));  
		            digilockername.sendKeys("name");
		 WebElement digilockeraddress = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		            digilockeraddress.sendKeys("Mumbai");
		 WebElement digilockernumber = driver.findElement(By.xpath("(//*[@type='text'])[3]"));
		            digilockernumber.sendKeys("2109");
		 WebElement digilockerDOB = driver.findElement(By.xpath("//input[@name='dob']"));
	                digilockerDOB.sendKeys("01-05-1999");
		 WebElement merchantmin=	driver.findElement(By.name("status"));
		 
//create class for select the success drop-down 	
		 
	     Select status=new Select(merchantmin);
	     status.selectByVisibleText("success");
	        driver.findElement(By.id("submit_btn")).click();
	        FluentWait<WebDriver> wait = new FluentWait<>(driver)
			         .withTimeout(Duration.ofSeconds(30))
			         .pollingEvery(Duration.ofSeconds(1));
	   WebElement add=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add']")));
	              add.click();
			driver.findElement(By.xpath("//span[@class='hv-close-button'] ")).click();
			
			
//Construct the file path to from the desktop			
		String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
		String filePath = desktopPath + File.separator + "C:\\image\\Capture";
		Robot rb= new Robot();
		rb.delay(2000);
//put path to file in clipboard		
		StringSelection ss=new StringSelection("C:\\image\\Capture");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
//ctrl+v
		rb.keyPress(KeyEvent.VK_CONTROL); 
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
//Enter		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		   driver.findElement(By.id("alternateNumber")).sendKeys("9876545678");
	   	   driver.findElement(By.xpath("//button[@class='bg-primary text-darkGreen  snap-primary-button mt-[16px] text-xl py-6 w-full']")).click();
		  
		 
		   
//for payment with UPI id 	
	   	 driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
		   driver.findElement(By.id("upiId")).sendKeys("7777777777@paytm");
		    WebElement button1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Pay ₹')]")));
         button1.click();
         ((Robot) button1).delay(2000);
	}
         
//           WebElement button11 = driver.findElement(By.cssSelector("div.container-class > button"));
//           WebElement button2 = driver.findElement(By.cssSelector(".bg-primary.text-darkGreen.snap-primary-button"));
//           JavascriptExecutor executor = (JavascriptExecutor) driver;
//           executor.executeScript("arguments[0].click();", button2);
		   
//For payment net banking
//		   driver.findElement(By.xpath("//p[normalize-space()='Net Banking']")).click();
//		   driver.findElement (By.xpath("//div[@class='item-center w-[38px] h-[38px] bg-[#fff] border-[#70C1CC] border-2 rounded-[4px]']")).click();		   
//		   WebElement button3 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Pay ₹')]")));
//		   button3.click();
//		   ((Robot) button3).delay(2000);
////For payment with Debit card	
//	   	try {
//	   	    // Wait for the button to be clickable
//	   	    WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'p-[16px] bg-[#ffffff] rounded-[6px] relative top-[40%] max-w-[343px] mx-auto')])[1]")));
//	 
//	   	 WebElement yesButton = popup.findElement(By.xpath("//button[contains(text(),'Yes')]"));
//         yesButton.click();
//         
//         // Add your further actions after clicking the "Yes" button
//     } catch (Exception e) {
//         e.printStackTrace();
//     }

          
//	 driver.findElement(By.xpath("//*[@class='bg-primary text-darkGreen  snap-primary-button w-[100%] px-[0px]']")).click();      
//	 driver.findElement(By.xpath("//div[@class ='flex relative gap-[12px] items-center w-full h-[48px] cursor-pointer text-[#657173] bg-[#F7F7F7]  border-[#DEDEDE] border-y-[0.3px] font-robotoBold']")).click();
//           
//         driver.findElement(By.id("cardNumber")).sendKeys("5123456789012346");
//         driver.findElement(By.id("cardName")).sendKeys("Snapmint");
//         driver.findElement(By.id("validity")).sendKeys("02/29");
//         driver.findElement(By.id("cvv")).sendKeys("123");
//      WebElement button5 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Pay ₹')]")));
//                 button5.click();
//                 ((Robot) button5).delay(2000);
//        driver.findElement(By.xpath("//span[normalize-space()='Successful']")).click();
//         
//	}		
	
                   private static void clearAndSendKeys(WebDriver driver, String name, String value)
            	    {
            	        WebElement textField = driver.findElement(By.name(name));
            	        textField.clear();
            	        textField.sendKeys(value);
            	    }
			        
	

}
