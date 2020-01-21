package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroHeaderVerification {
    public static void main(String[] args) {

        //Open Chrome browser

        //Go to http://zero.webappsecurity.com/login.html

        // 3.Get attribute value of href from the “forgot your password” link
        // 4.Verify attribute value contains

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

       String actualLink = driver.findElement(By.partialLinkText("forgot")).getAttribute("href");
       String expextedInLink = "/forget password.html";
       if(actualLink.equals(expextedInLink)){

               System.out.println("Link verification PASSED!");
           }else{
               System.out.println("Link verification FAILED!");
           }
       }



    }

