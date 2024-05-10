package basicautomation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flow 
{
	
	static  String mobile ="9085654506";
	static  String email ="aashish@Snapmint.com";
	static  String name ="Aashish";
	static  String lastname ="savkare";
	static  String password ="12345678";
	static  String orderid ="mi";
	static  String ordervalue ="9000";
	static  String merchant_id ="1";
	static  String store_id ="1";
	static  String PAN_number ="EGBPS3446Z";
	static  String OTP ="1010";
	
	
	
	static class ImageUpload
	
	
	{
		
		    public static void main(String[] args) throws Exception {
		        WebDriver driver = new ChromeDriver();
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        try {
		            // Replace "your_url" with the actual URL
		            driver.get("your_url");

		            for (int i = 1; i <= 3; i++) {
		                WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Add'])[" + i + "]")));
		                addButton.click();

		                WebElement closeButton = driver.findElement(By.xpath("//span[@class='hv-close-button']"));
		                closeButton.click();

		                // Modify the file path for each iteration
		                String filePath = "C:\\image\\Capture\\image" + i + ".jpg";
		                uploadImage(filePath);
		            }
		
	
//	public static void main(String[] args) throws Exception
	{
		
//		 public static void uploadImage(String filePath) throws Exception {
		        String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
		        String filePath;
				String fullPath = desktopPath + File.separator + filePath;

		        Robot rb = new Robot();
		        rb.delay(2000);

		        // Put the path to file in clipboard
		        StringSelection ss = new StringSelection(fullPath);
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
		 WebDriver driver1 = new ChromeDriver();
		driver1.get("https://snapmint:ciHns$%40NKSa@qa2.snapmint.com/merchant-demo");      
         driver1.manage().window().maximize();
	     driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	     clearAndSendKeys(driver1, "mobile", mobile );
	     clearAndSendKeys(driver1, "merchant_id", merchant_id);
	     clearAndSendKeys(driver1, "store_id", store_id);
	     clearAndSendKeys(driver1, "order_id", orderid);
	     clearAndSendKeys(driver1, "order_value", ordervalue);
	     clearAndSendKeys(driver1, "full_name", "");
	     clearAndSendKeys(driver1, "email", email);
	     driver1.findElement(By.id("checksum_btn")).click();
	     driver1.findElement(By.id("submit_btn")).click();
	     driver1.findElement(By.name("otp")).sendKeys(OTP);
	     driver1.findElement(By.id("firstName")).sendKeys(name);
	     driver1.findElement(By.id("lastName")).sendKeys(lastname);
	     driver1.findElement(By.name("panNumber")).sendKeys(PAN_number);
     WebElement femaleRadioButton = driver1.findElement(By.xpath("//input[@name='gender' and @value='f']"));
	            femaleRadioButton.click();	
	 WebElement day = driver1.findElement(By.xpath("//div[@class='w-[100%] h-[48px] border-[1px] rounded-[4px] text-center border-[#DEE4E5] flex items-center']"));
		        day.click();
     WebElement dayElement1 = driver1.findElement(By.xpath("//div[@class='even:bg-[#F4F7FF] odd:bg-white pl-4']"));
		        dayElement1.click();
     WebElement month = driver1.findElement(By.xpath("//div[contains(text(),'Month')]"));
		        month.click();
     WebElement monthElement1 = driver1.findElement(By.xpath("//div[normalize-space()='May']"));
		        monthElement1.click();
     WebElement year = driver1.findElement(By.xpath("//div[contains(text(),'Year')]"));
		        year.click();
	 WebElement yearElement1 = driver1.findElement(By.xpath("//div[normalize-space()='1999']"));
		        yearElement1.click();
		 driver1.findElement(By.xpath("//button[normalize-space()='Next']")).click();
		 Thread.sleep(3000);
		 
	
		WebElement SalariedRadioButton = driver1.findElement(By.xpath("//input[@name='profession' and @value='salaried']"));
         SalariedRadioButton.click();
		
	           driver1.findElement(By.id("companyName")).sendKeys("snapmint");
	           driver1.findElement(By.id("monthlyIncome")).sendKeys("50000");
	           
	      	 WebElement salary=driver1.findElement(By.xpath("(//select)[1]"));
	       
			Select status=new Select(salary);
	  	     status.selectByVisibleText("UNION BANK OF INDIA");
	  	        driver1.findElement(By.xpath("//button[normalize-space()='Verify income by OTP on SETU (OneMoney) portal']")).click();
	  	      
               driver1.findElement(By.xpath("//a[normalize-space()='Success']")).click();
               driver1.findElement(By.xpath("//button[normalize-space()='Pay in 3 Months EMIs']")).click();
		        
		        	    
              
              
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
//  	   WebElement add=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add'][1]")));
//  	              add.click();
//  			driver.findElement(By.xpath("//span[@class='hv-close-button'] ")).click();
  			     
                 
//  			String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
//  			String filePath = desktopPath + File.separator + "C:\\image\\Capture";
//  			Robot rb= new Robot();
//  			rb.delay(2000);
//  	//put path to file in clipboard		
//  			StringSelection ss=new StringSelection("C:\\image\\Capture");
//  			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//  			
//  	//ctrl+v
//  			rb.keyPress(KeyEvent.VK_CONTROL); 
//  			rb.keyPress(KeyEvent.VK_V);
//  			
//  			rb.keyRelease(KeyEvent.VK_CONTROL);
//  			rb.keyRelease(KeyEvent.VK_V);
//  	//Enter		
//  			rb.keyPress(KeyEvent.VK_ENTER);
//  			rb.keyRelease(KeyEvent.VK_ENTER);
//  			
//  			
//  			WebElement add1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add'][2]")));
//              add1.click();
//		driver.findElement(By.xpath("//span[@class='hv-close-button'] ")).click();
//		     
//           
//		String desktopPath1 = System.getProperty("user.home") + File.separator + "Desktop";
//		String filePath1 = desktopPath1 + File.separator + "C:\\image\\image (13)";
//		Robot rb1= new Robot();
//		rb1.delay(2000);
//put path to file in clipboard		
//		StringSelection ss1=new StringSelection("C:\\image\\image (13)");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
//		
////ctrl+v
//		rb1.keyPress(KeyEvent.VK_CONTROL); 
//		rb1.keyPress(KeyEvent.VK_V);
//		
//		rb1.keyRelease(KeyEvent.VK_CONTROL);
//		rb1.keyRelease(KeyEvent.VK_V);
////Enter		
//		rb1.keyPress(KeyEvent.VK_ENTER);
//		rb1.keyRelease(KeyEvent.VK_ENTER);		
//          
//		
//		
//		WebElement add11=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add'][3]")));
//        add11.click();
//	driver.findElement(By.xpath("//span[@class='hv-close-button'] ")).click();
//	     
     
//	String desktopPath11 = System.getProperty("user.home") + File.separator + "Desktop";
//	String filePath11 = desktopPath11 + File.separator + "C:\\image\\image (15)";
//	Robot rb11= new Robot();
//	rb11.delay(2000);
////put path to file in clipboard		
//	StringSelection ss11=new StringSelection("C:\\image\\image (15)");
//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss11, null);
//	
////ctrl+v
//	rb11.keyPress(KeyEvent.VK_CONTROL); 
//	rb11.keyPress(KeyEvent.VK_V);
//	
//	rb11.keyRelease(KeyEvent.VK_CONTROL);
//	rb11.keyRelease(KeyEvent.VK_V);
////Enter		
//	rb11.keyPress(KeyEvent.VK_ENTER);
//	rb11.keyRelease(KeyEvent.VK_ENTER);		
           
    }
                    
               
              
                    
               
               
               
               
               
               
               
             private static void uploadImage(String filePath) {
		// TODO Auto-generated method stub
		
	}











			//button[@class=' bg-secondaryText snap-primary-button mt-[16px] text-xl py-6 w-full']
               
              
	
    private static void clearAndSendKeys(WebDriver driver, String name, String value)
    {
        WebElement textField = driver.findElement(By.name(name));
        textField.clear();
        textField.sendKeys(value);
    }

		    }
	}
