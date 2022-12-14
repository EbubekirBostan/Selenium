package Day2_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageWindowCommands {
    public static void main(String[] args) throws InterruptedException {
        // Go to the Amazon URL : https://www.amazon.com/
        // Print the position and size of the page.
        // Adjust the position and size of the page as desired.
        // Test that the page is in the position and size you want.
        // Close the page.
        System.setProperty("webdriver.chrome.driver","Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println("Browserimizin pozisyonu = " + driver.manage().window().getPosition());
        System.out.println("Browserimizin boyutu = " + driver.manage().window().getSize());

        // browserimizin pozisyonunu (19 ,07) olarak set ettik
        driver.manage().window().setPosition(new Point(190,70));

        // browserimizin boyutunu (300 ,500) olarak set ettik
        driver.manage().window().setSize(new Dimension(800,1000));
        //browserimizin boyut ve pozisyonunu doğruluyoruz
        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();
        System.out.println("height = " + height);
        System.out.println("width = " + width);
        System.out.println("Browserın boyutu test ediliyor");
        if (width==800 && height==788){
            System.out.println("Boyut testi PASSED");
        }else System.out.println("Boyut testi FAILED");

        // pozisyonu doğrulayalım
        int x= driver.manage().window().getPosition().getX();
        int y= driver.manage().window().getPosition().getY();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Browserın pozisyonu test ediliyor");
        if (x==190 && y==70){
            System.out.println("Pozisyon testi PASSED");
        }else System.out.println("Pozisyon testi FAILED");


        driver.close();






    }
}
