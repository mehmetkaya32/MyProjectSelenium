package tests.paractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserUtils;

public class SalesForce {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();

        WebElement input = driver.findElement(By.name("username"));
        input.sendKeys("kaya.mehmet32@gmail.com");
        BrowserUtils.wait(2);

        WebElement input2 = driver.findElement(By.id("password"));
        input2.sendKeys("12345");
        Thread.sleep(2000);

        WebElement input3 = driver.findElement(By.id("Login"));
        input3.click();

        System.out.println(driver.getTitle());







    }

    }

