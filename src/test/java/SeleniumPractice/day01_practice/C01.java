package SeleniumPractice.day01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {

        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");

        // ilk kutucuga 20 giriniz ve ikinci kutucuga 30 giriniz
        WebElement ilkVeIkinciKutu = driver.findElement(By.id("number1"));
        ilkVeIkinciKutu.sendKeys("20", Keys.TAB, Keys.TAB, "30");

        // calculate'e tıklayınız
        WebElement calculateButon = driver.findElement(By.id("calculate"));
        calculateButon.click();

        // sonucu yazdırınız
        WebElement sonuc = driver.findElement(By.id("answer"));
        System.out.println("Sonuç = " + sonuc.getText());

        // sayfayi kapatiniz
        driver.close();
    }
}