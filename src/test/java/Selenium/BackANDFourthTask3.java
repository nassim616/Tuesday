package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

public class BackANDFourthTask3 {

  //  C#3C#3:	Back	and	forth	navigation1-Open	a	chrome	browser2
    //  -Go	to:	https://google.com
    //  3-Click	to	Gmail	from	top	right.
    //  4-Verify	title	contains:Expected:	Gmail
    //  5-Go	back	to	Google	by	using	the	.back();
    //  6-Verify	title	contains:Expected:	Google
    //  7-Go back to Gmail	using the Forward	button
    //  8-Verify	title	contains:Expected:
    // 	G:	Back	and	forth	navigation1-Open	a	chrome	browser2-Go	to:	https://google.com3-Click	to	Gmail	from	top	right.4-Verify	title	contains:Expected:	Gmail5-Go	back	to	Google	by	using	the	.back();6-Verify	title	contains:Expected:	Google7-Go	back	to	Gmail	using	the	Forward	button8-Verify	title	contains:Expected:	G

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    driver.get("https://www.google.com");

    driver.findElement(By.linkText("Gmail")).click();

// verify title contains  : expected : Gmail
    String actualTitle = driver.getTitle();
    String expextedTitle = "Gmail";

    if (actualTitle.contains(expextedTitle)) {

        System.out.println("Gmail title verification PASSED ");

    }else {
        System.out.println(" Gmail title verification FAILD ");
    }
        driver.navigate().back();

        String actualTitleGoogle = "Google";
        String expextedTitleGoole = driver.getTitle();

        if(actualTitleGoogle.equals(actualTitleGoogle)){
            System.out.println("Google title verification PASSED");
        }else {
            System.out.println("Google title verification FAILED");
        }
        // 7-Go back    to  Gmail   using   the Forward button
        driver.navigate().forward();
        // 8-Verify title   contains:Expected:  Gmail
        String expectedTitle2 = "Gmail";
        String actualTitle2 = driver.getTitle();
        if(actualTitle2.contains(expectedTitle2)){
            System.out.println("Gmail forward title verification PASSED");
        }else {
            System.out.println("Gmail forward title verification FAILED");
        }
    }
}







