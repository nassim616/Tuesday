package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrders {

    public static void main(String[] args) throws InterruptedException {

       // TC#:	Basic	login	authentication1-Open	a	chrome	browser2
        // -Go	to:	http://secure.smartbearsoftware.
    // com/samples/testcomplete12/WebOrders/login.aspx
        // 3-Verify	title	equals:Expected:	Web	Orders	Login
        // 4-Enter username:	Tester
        // 	5-Enter	password:	test
        // 	6-Click	“Sign	In”	button
        // 	7-Verify	titleequals:Expected:	Web	Orders

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

       // driver.manage().window().maximize();

        driver.get ("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

     String actualTitle = driver.getTitle();

     String expextedTitle = " Web Orders Login ";

     if(actualTitle.equals(expextedTitle)){

         System.out.println (" Web Orders Login title verification PASSED ");

     }else {
     }
         System.out.println (" Web Orders Login title verification FAILD ");

         driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

         Thread.sleep(3000);

         driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

             Thread.sleep(3000);

        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String actualTitleGoogle = driver.getTitle();

        String expextedTitleGoogle = "Web Orders";

        if(actualTitle.equals(expextedTitle)){

            System.out.println(" Web orders title verification PASSED");
        }else{
            System.out.println(" Web Order title verification PASSED ");
        }
    }
}
