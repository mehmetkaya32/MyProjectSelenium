package tests.paractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserUtils;

public class HomeDepot {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://citiretailservices.citibankonline.com/RSnextgen/svc/launch/index.action?siteId=PLCN_HOMEDEPOT#signon");
        BrowserUtils.wait(2);
        driver.manage().window().maximize();

        WebElement giris1 = driver.findElement(By.id("user_id_2"));
        giris1.sendKeys("kaya.mehmet32@gmail.com");
        Thread.sleep(1000);

        WebElement giris2 = driver.findElement(By.id("password_3"));
        giris2.sendKeys("123456");
        Thread.sleep(1000);

        WebElement giris3 = driver.findElement((By.className("featured")));
        giris3.click();

        System.out.println(driver.getTitle());

    }
}
