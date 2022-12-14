package Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme {
    public static void main(String[] args) {
        /*
        hepsiburada ve trendyol sayfalarına git tittlelerının eşitliğini kontrol et
         */
        System.setProperty("webdriver.chrome.driver","Dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://trendyol.com");
        String pagetitle= driver.getTitle();
        System.out.println("pagetittle = " + pagetitle);
        driver.navigate().to("https://hepsiburada.com");
        String pagetitle1= driver.getTitle();
        System.out.println("pagetitlle1 = " + pagetitle1);
        System.out.println(" test yapılıyor ");
        if (pagetitle.contains(pagetitle1)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAIllED");
        }






    }
}
