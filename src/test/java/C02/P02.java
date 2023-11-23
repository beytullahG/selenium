package C02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
    public static void main(String[] args) throws InterruptedException {
        /*
                İşlemleri görmek için her işlem yazdırılır.
                Sayfaların handele değeri alınır
            1- www.google.com adresine gidilir
            2- yeni bir sekme açılarak www.wisequarter.com adresine gidilir
            3- ilk sekmeye geçilip, burada www.testotomasyonu.com adresine gidilir
            4- açılan pencere kapatılır.

        */

        System.setProperty("Webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1- www.google.com adresine gidilir
        driver.get("https://www.google.com");
        System.out.println("1. site Title = "+driver.getTitle());
        System.out.println("1. site Url = "+driver.getCurrentUrl());
        // sayfanın handle değeri
        String handle1= driver.getWindowHandle();
        System.out.println("1. site Handle = "+handle1);
        // 2- yeni bir sekme açılarak www.wisequarter.com adresine gidilir
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");
        System.out.println("2. site Title = "+driver.getTitle());
        System.out.println("2. site Url = "+driver.getCurrentUrl());
        // sayfanın handle değeri
        String handle2= driver.getWindowHandle();
        System.out.println("2. site Handle = "+handle2);
        // 3- ilk sekmeye geçilip, burada www.testotomasyonu.com adresine gidilir
        driver.switchTo().window(handle1);
        driver.get("https://www.testotomasyonu.com");
        System.out.println("1. sekme Title = "+driver.getTitle());
        System.out.println("1. sekme Url = "+driver.getCurrentUrl());
        // sayfanın handle değeri
        String handle3= driver.getWindowHandle();
        System.out.println("1. sekme Handle = "+handle3);
        // 4- açılan pencere kapatılır.
        Thread.sleep(1000);
        driver.quit();

    }
}
