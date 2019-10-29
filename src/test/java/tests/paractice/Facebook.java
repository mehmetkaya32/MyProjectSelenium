package tests.paractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();

            driver.get("https://www.facebook.com/");
            // driver.manage().window().maximize();

            WebElement giris = driver.findElement(By.name("email"));
            giris.sendKeys("8138104140");
            // BrowserUtils.wait(2);

            WebElement giris1 = driver.findElement(By.name("pass"));
            giris1.sendKeys("ygokdere32");
            // Thread.sleep(2000);

            WebElement giris2 = driver.findElement(By.id("u_0_2"));
            giris2.click();

            driver.close();

            System.out.println(driver.getTitle());

        }
    }

