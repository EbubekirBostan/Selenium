package Day1_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Deneme {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://hepsiburada.com");
        driver.navigate().to("https://cimri.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
       // Thread.sleep(2000);
        driver.quit();

    }
}
