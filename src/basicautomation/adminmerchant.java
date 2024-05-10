package basicautomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adminmerchant 
{
	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	
		
		 driver.get("https://qa2.snapmint.com/admin/dashboard");
		 driver.findElement(By.name("admin_user[email]")).sendKeys("sonali.b@snapmint.com");
		 System.out.println("enter the email id");
		 
		 driver.findElement(By.name("admin_user[password]")).sendKeys("12345678");
		 System.out.println("enter the password");
		 
		 driver.findElement(By.xpath("//*[@name='commit']")).click();
		 System.out.println("Click on login button");
		  
		 driver.findElement(By.id("master_data")).click();
		 Thread.sleep(2000);
		 System.out.println("Click on master data");
		 
		 driver.findElement(By.id("merchants")).click();
		 Thread.sleep(2000);
		 System.out.println("Click on merchants");
		 
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='New Merchant']")).click();
		System.out.println("Click on new merchant");
		 Thread.sleep(2000);
	 
		driver.findElement(By.id("merchant_name")).sendKeys("automation123 merchant");
		System.out.println("Click on merchant name");
		 Thread.sleep(2000);
		
		driver.findElement(By.id("merchant_internal_merchant_name")).sendKeys("automation test merchant");
		System.out.println("Click on new merchan internal namet");
		 Thread.sleep(2000);
		
		driver.findElement(By.id("merchant_email")).sendKeys("testhdferfsnapminttest@gmail.com");
		System.out.println("Click on new merchant email");
		 Thread.sleep(2000);
		
		driver.findElement(By.id("merchant_url")).sendKeys("https//qa.snapmint.com");
		System.out.println("Click on merchant URL");
		 Thread.sleep(2000);
	
		
		driver.findElement(By.id("merchant_min_processing_fees")).sendKeys("0.0");
		System.out.println("enter the min processing fees");
		 Thread.sleep(2000);

		 WebElement minTenureEle = driver.findElement(By.name("merchant[min_tenure]"));
	     selectOptionFromDropDown(minTenureEle, "1");
	     System.out.println("click on min tenure");
	     Thread.sleep(2000);
	       
	     
	     WebElement maxTenureEle = driver.findElement(By.name("merchant[max_tenure]"));
	     selectOptionFromDropDown(maxTenureEle, "9");
	     System.out.println("click on max tenure");
	     Thread.sleep(1000);
	     
	  driver.findElement(By.id("merchant_merchant_account_number")).sendKeys("8859101100091");
		System.out.println("enter the merchant account number");
		 Thread.sleep(1000);
		
		driver.findElement(By.id("merchant_confirm_merchant_account_number")).sendKeys("8859101100091");
		System.out.println(" confirm the merchant account number");
		 Thread.sleep(1000);
		
	
		driver.findElement(By.id("merchant_merchant_billing_name")).sendKeys("SIMPLIFY CREDIT ADVISORY PRIVATE LIMITED ");
		System.out.println("enter the merchant billing name");
		 Thread.sleep(1000);
		
	
		driver.findElement(By.id("merchant_ifsc_code")).sendKeys("HDFC000162");
		System.out.println("enter the merchant ifsc code");
		 Thread.sleep(1000);
		
		driver.findElement(By.id("merchant_abbreviation")).sendKeys("Snapmint");
		System.out.println("enter the abbreviation");
		
		driver.findElement(By.id("merchant_invoicing_email")).sendKeys("snapmint@gmail.com");
		System.out.println("enter the invoicing email");
		
		driver.findElement(By.id("merchant_max_order_value")).sendKeys("10000");
		System.out.println("enter the merchant max order values");
		
		driver.findElement(By.id("merchant_gst_number")).sendKeys("23SAERTYGFTR56T");
		System.out.println("enter the gst number");
		
		
		  WebElement merchantchanneleEle = driver.findElement(By.name("merchant[channel]"));
		     selectOptionFromDropDown(merchantchanneleEle, "online_apparel");
		
	
		driver.findElement(By.id("merchant_address")).sendKeys("Ramnagr 425001");
		System.out.println("enter the merchant address");
		
		
		driver.findElement(By.id("merchant_city")).sendKeys("bangalore");
		System.out.println("enter the merchant city");
		
		
		driver.findElement(By.id("merchant_state")).sendKeys("Karnataka");
		System.out.println("enter the merchant state");
		
		driver.findElement(By.id("merchant_zip")).sendKeys("560068");
		System.out.println("enter the merchant zip");
		
		 WebElement textField = driver.findElement(By.id("merchant_p_and_s_charges"));

		 textField.clear();
		textField.sendKeys("0.16");
		System.out.println("enter the p ans s charge");
		
		driver.findElement(By.id("merchant_shopify_shop_url")).sendKeys("checout-store-2.myshopify.com");
		System.out.println("enter the merchant shopify shop url");
		
		driver.findElement(By.id("merchant_shopify_store_key")).sendKeys("5e865380764e46a4a736833ba4fea6cf");
		System.out.println("enter the merchant shopify store key");
		
		driver.findElement(By.name("commit")).click();
		System.out.println("click on create merchant");
		
	
	     WebElement merchanttypeEle = driver.findElement(By.name("merchant[merchant_type]"));
	     selectOptionFromDropDown(merchanttypeEle, "goods");
	     System.out.println("click on merchant type and select goods from drop-down");
	     
	     WebElement merchantlenderEle = driver.findElement(By.name("merchant[lender_id]"));
	     selectOptionFromDropDown(merchantlenderEle, "Snapmint");
	     System.out.println("click on merchant lender and select   Snapmint from drop-down");
	     
	     WebElement merchantaccounttypeEle = driver.findElement(By.name("merchant[account_type]"));
	     selectOptionFromDropDown(merchantaccounttypeEle, "CA");
	     System.out.println("click on merchant account type  and select CA from drop-down");
	     
    
	     
	}
	
	
	public static void selectOptionFromDropDown(WebElement ele, String value) {
        Select drp = new Select(ele);  //  It is used to create a Select object, which is a class 
        List<WebElement> allOptions = drp.getOptions();// is used to retrieve all the available options within a dropdown element.
        for (WebElement option : allOptions) {
            if (option.getText().equals(value)) { 
                option.click();
                break;
            }
        }
    }
}


