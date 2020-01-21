import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTask {
    public static void main(String[] args) {

//        1:	Google	Title	Verification1.Open	Chrome	browser.
//           2:-     Go	to	https://www.google.com.
//           3:-Verify	title:	Expected:	Google

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        String expextedTitle = "google";

        String actualTitle = driver .getTitle();

        if (actualTitle.equals(expextedTitle)) {

            System.out.println("google title verification PASSED ");

        }else{

            System.out.println("google title verification FAILD");
        }

    }
}
