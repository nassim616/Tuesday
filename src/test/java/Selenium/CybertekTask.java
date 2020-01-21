package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.StringTokenizer;

public class CybertekTask {

  //  TC	#2:	Cybertek	verifications1.Open	Chrome	browser2
    //  .Go	to	https://www.cybertekschool
    // com3.Verify	URL	containsExpected:	cybertekschool4.Verify	title:	Expected:	Cybe

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.cybertekschool.com");
        String expectedTitle = "cybertek";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("google title verification PASSED");

        }else {
            System.out.println("google title verification FAILD");
            String expetctedUrl = "cybertekSchool";
            String actualUrl = driver.getCurrentUrl();
            if (actualTitle.contains(expectedTitle)) {
                System.out.println("cybertek Url verifecation PASSED");
            } else {
                System.out.println("cybertek Url verifecation FAILD");
            }
        }
    }

    }


