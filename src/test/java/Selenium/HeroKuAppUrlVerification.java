package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeroKuAppUrlVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(" https://the-internet.herokuapp.com/forgot_password ");

    driver.findElement(By.id(" email ")).sendKeys(" nassim.socio.com ");

    driver.findElement(By.id("form_submit")).click();

    String actualUrl = driver.getCurrentUrl();

    String expectedInUrl = " your email has been sent ";

        if (actualUrl.contains(expectedInUrl)){
            System.out.println(" URL verification passed! ");
        }else{
            System.out.println(" URL verification failed! ");
        }
        //6.Verify that text box displayed has the text as expected
        //Expected: "Your e-mail's been sent!"
        String actualTextBoxValue = driver.findElement(By.id(" content ")).getText();

        String expectedTextBoxValue = " Your e-mail's been sent! ";

        if(actualTextBoxValue.equals(expectedTextBoxValue)){

            System.out.println(" Text box value verification PASSED! ");

        }else{

            System.out.println(" Text box value verification FAILED! ");
        }

    }
}
