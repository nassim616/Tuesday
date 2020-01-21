package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {
    public static void main(String[] args) {





       // Etsy Title Verification1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // Go to https://www.etsy.com

        driver.get("https://www.etsy.com");

        // 3.Search for “wooden spoon”
driver.findElement(By.id("global-enhancements-search-query")).sendKeys(" Wood Spoon " + Keys.ENTER);

        //4.Verify title:
       String actualTitle = driver.getTitle();
       String expextedTitle = " Wood Spoon ";
       if(actualTitle.equals(expextedTitle)){
           System.out.println("Wood Spoon title verification PASSED");
       }else{
           System.out.println("Wood Spoon title verification FAILD");
       }
    }
}
