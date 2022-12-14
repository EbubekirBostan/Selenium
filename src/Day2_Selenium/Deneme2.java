package Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String verilenUrl="https://www.facebook.com/";
        String pageUrl = driver.getCurrentUrl();
        System.out.println("pageUrl = " + pageUrl);
        if (pageUrl.equals(verilenUrl)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        driver.get("https://facebook.com");
        verilenUrl="https://facebook.com";
        if (pageUrl.equals(verilenUrl)){
            System.out.println("Passed");
        } else System.out.println("Failed");

        driver.close();





    }
}
