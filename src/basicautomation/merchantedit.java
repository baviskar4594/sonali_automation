package basicautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class merchantedit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.snapmint.com/admin/dashboard");

        // Login
        driver.findElement(By.name("admin_user[email]")).sendKeys("sonali.b@snapmint.com");
        driver.findElement(By.name("admin_user[password]")).sendKeys("12345678");
        driver.findElement(By.name("commit")).click();

        // Navigate to Merchants section
        driver.findElement(By.id("master_data")).click();
        Thread.sleep(2000); // Avoid using Thread.sleep() in actual tests, use WebDriverWait instead
        driver.findElement(By.id("merchants")).click();
        Thread.sleep(2000);

        // Maximize the window
        driver.manage().window().maximize();

        // Create a new merchant
        driver.findElement(By.xpath("//a[normalize-space()='New Merchant']")).click();
        Thread.sleep(2000);

        // Fill merchant details
        fillMerchantDetails(driver);

        // Click on create merchant
        driver.findElement(By.name("commit")).click();

        // Set dropdown values
        selectOptionFromDropDown(driver.findElement(By.name("merchant[min_tenure]")), "1");
        selectOptionFromDropDown(driver.findElement(By.name("merchant[max_tenure]")), "9");
        selectOptionFromDropDown(driver.findElement(By.name("merchant[merchant_type]")), "goods");
        selectOptionFromDropDown(driver.findElement(By.name("merchant[lender_id]")), "Snapmint");
        selectOptionFromDropDown(driver.findElement(By.name("merchant[account_type]")), "CA");
        selectOptionFromDropDown(driver.findElement(By.name("merchant[channel]")), "online_apparel");

        // Close the browser
        driver.quit();
    }

    public static void fillMerchantDetails(WebDriver driver) {
        driver.findElement(By.id("merchant_name")).sendKeys("automation merchant");
        driver.findElement(By.id("merchant_internal_merchant_name")).sendKeys("automation test merchant");
        driver.findElement(By.id("merchant_email")).sendKeys("automationfdfdf@gmail.com");
        driver.findElement(By.id("merchant_url")).sendKeys("https://qa.snapmint.com");
        driver.findElement(By.id("merchant_min_processing_fees")).sendKeys("0.0");
        driver.findElement(By.id("merchant_merchant_account_number")).sendKeys("8859101100091");
        driver.findElement(By.id("merchant_confirm_merchant_account_number")).sendKeys("8859101100091");
        driver.findElement(By.id("merchant_merchant_billing_name")).sendKeys("SIMPLIFY CREDIT ADVISORY PRIVATE LIMITED");
        driver.findElement(By.id("merchant_ifsc_code")).sendKeys("HDFC000162");
        driver.findElement(By.id("merchant_abbreviation")).sendKeys("Snapmint");
        driver.findElement(By.id("merchant_invoicing_email")).sendKeys("snapmint@gmail.com");
        driver.findElement(By.id("merchant_max_order_value")).sendKeys("10000");
        driver.findElement(By.id("merchant_gst_number")).sendKeys("23SAERTYGFTR56T");
        driver.findElement(By.id("merchant_address")).sendKeys("Ramnagr 425001");
        driver.findElement(By.id("merchant_city")).sendKeys("bangalore");
        driver.findElement(By.id("merchant_state")).sendKeys("Karnataka");
        driver.findElement(By.id("merchant_zip")).sendKeys("560068");
        WebElement textField = driver.findElement(By.id("merchant_p_and_s_charges"));
        textField.clear();
        textField.sendKeys("0.16");
        driver.findElement(By.id("merchant_shopify_shop_url")).sendKeys("checout-store-2.myshopify.com");
        driver.findElement(By.id("merchant_shopify_store_key")).sendKeys("5e865380764e46a4a736833ba4fea6cf");
    }

    public static void selectOptionFromDropDown(WebElement ele, String value) {
        Select drp = new Select(ele);
        List<WebElement> allOptions = drp.getOptions();
        for (WebElement option : allOptions) {
            if (option.getText().equals(value)) {
                option.click();
                break;
            }
        }
    }


	}


