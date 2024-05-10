package basicautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class HandleMultipleDropdown {
    static WebDriver driver;  // declare a static variable

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.snapmint.com/admin/dashboard");
		 driver.findElement(By.name("admin_user[email]")).sendKeys("sonali.b@snapmint.com");
		 driver.findElement(By.name("admin_user[password]")).sendKeys("12345678");
		 driver.findElement(By.xpath("//*[@name='commit']")).click();
        
        driver.get("https://qa2.snapmint.com/admin/merchants");
        WebElement minTenureEle = driver.findElement(By.name("merchant[min_tenure]"));
        selectOptionFromDropDown(minTenureEle, "4");
    }

    public static void selectOptionFromDropDown(WebElement ele, String value) {
        Select drp = new Select(ele);  //  It is used to create a Select object, which is a class 
        List<WebElement> allOptions = drp.getOptions();// is used to retrieve all the available options within a dropdown element.
        for (WebElement option : allOptions) {
            if (option.getText().equals(value)) { // Changed "value" to variable value
                option.click();
                break;
            }
        }
    }
}

////WebElement merchantmin=	driver.findElement(By.id("merchant_min_tenure"));
////Select min=new Select(merchantmin);
////min.selectByVisibleText("3");

