package Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_FacebookUrlTest {
    public static void main(String[] args) {
        // Invoke Chrome Driver
        // Navigate to Facebook homepage URL: https://www.facebook.com/
        // Verify expected equals actual URL.
        // Verify expected contains Facebook Word.
        System.setProperty("webdriver.chrome.driver","Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String expectedUrl = "https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Url testi Passed");
        }else {
            System.out.println("Url testi Failed");
        }
        String actualTittle = driver.getTitle();
        if (actualTittle.contains("Facebook")){
            System.out.println("Tittle testi Passed");
        }else {
            System.out.println("Tittle testi Failed");
        }
        driver.quit();

    }
}
