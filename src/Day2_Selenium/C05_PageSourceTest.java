package Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_PageSourceTest {
    public static void main(String[] args) {
        // Go to the Amazon URL: https://www.amazon.com/
        // Verify that it writes "Performance Metrics" and "MEOW" from the Source code.
        System.setProperty("webdriver.chrome.driver","Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        // page source kaynağı aldık
        String pageSource = driver.getPageSource();
        System.out.println("Page source testi yapılıyor...");
        if (pageSource.contains("Performance Metrics") && pageSource.contains("MEOW")){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");
        driver.quit();


    }
}
