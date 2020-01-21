package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppleTask {
    public static void main(String[] args) throws InterruptedException {

      //1-Open	a	chrome	browser
       //2-Go	to:	https://google.com
    // 3-Write	“apple”	in	search	box
    // 4-Click	google	search	button
    // 5-Verify	title:Expected:	Title	should	start	with	“apple"

  // open a chrome  browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // go to 	https://google.com
        driver.get("https://google.com");

       // Write "apple" in search box
        driver.findElement(By.name("q"));

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("apple");

        Thread.sleep(3000);

       //click googke search buttom
        element.submit();
       // Verify title : expected title should start with "apple"
        String actualTitle = driver.getTitle();
        String expexedTitle = "aplle";
        if (actualTitle.startsWith(expexedTitle)){
            System.out.println("aplle title verification PASSED ");

        }else {
            System.out.println("apple title verification FAILD");
        }
    }
}
