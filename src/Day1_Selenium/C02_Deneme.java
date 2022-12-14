package Day1_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Deneme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://trendyol.com");

        String pageTitle= driver.getTitle();
        String currentUrl=driver.getCurrentUrl();

        System.out.println("pageTitle = " + pageTitle);
        System.out.println("currentUrl = " + currentUrl);

        driver.quit();

    }
}
