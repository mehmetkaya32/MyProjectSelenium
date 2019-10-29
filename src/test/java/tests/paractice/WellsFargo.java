package tests.paractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WellsFargo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.wellsfargo.com/");
        driver.manage().window().maximize();

        WebElement entrance = driver.findElement(By.name("j_username"));
        entrance.sendKeys("kayamehmet");
        Thread.sleep(1000);

        WebElement entrance1 = driver.findElement(By.id("password"));
        entrance1.sendKeys("32ygokdere");
        Thread.sleep(1000);

        WebElement entrance2 = driver.findElement(By.name("btnSignon"));
        entrance2.click();


        System.out.println(driver.getTitle());

    }
}
