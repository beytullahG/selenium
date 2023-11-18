package C01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04_ilkSeleniumTesti {
    /*
    . .Exercise2...
1-Driver oluşturalim
2-Java class'imiza chnomedriver.exet i tanitalim
3-Driver'in tum ekranı kaplamasini saglayalim
4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca
beklesini söyleyelim. Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
5-"https://www.otto.de” adresine gidelim
6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
7-Title ve url inin "0TT0” kelimesinin içerip icermedigini kontrol edelim
8-Ardindan "https://wisequarter.com/” adresine gidip
9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
10-Bir onceki web sayfamiza geri donelim
11-Sayfayı yenileyelim
12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
13- En son adim olarak butun sayfalarimizi kapatmis olalim
otto.deotto.de
OTTO - Mode, Möbel & Technik » Zum Online-Shop
OTTO Online-Shop » Über 4.000 Marken entdecken ✓ Aktuelle Trends ✓ Top Service »
Ratenkauf ✓ Altgeräte-Mitnahme ✓ Aufbauservice ✓ Jetzt shoppen!
     */
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

        //6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        driver.get("https://www.otto.de");
        driver.getCurrentUrl();
        driver.getTitle();





        //7-Title ve url inin "0TT0” kelimesinin içerip icermedigini kontrol edelim

        String ottoTitle=driver.getTitle();
        String ottolUrl =driver.getCurrentUrl();
        if ((ottoTitle.contains("OTTO"))&&(ottolUrl.contains("OTTO"))) {
            System.out.println("TITLE ve URL TEST PASSED");

        }System.out.println("TITLE ve URL TEST FAILED");

        //8-Ardindan "https://wisequarter.com/” adresine gidip
        System.out.println("------------------------------------------------------");
        driver.get("https://wisequarter.com/");


        //9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
        String wqTitle =driver.getTitle();
        boolean kelime=wqTitle.contains("Quarter");

        System.out.println(wqTitle);
        if (kelime){
            System.out.println("WİSE QUARTER TITLE TEST PASSED");
        }else {
            System.out.println("WİSE QUARTER TITLE TEST FAILED");
        }


        driver.quit();


    }
}
