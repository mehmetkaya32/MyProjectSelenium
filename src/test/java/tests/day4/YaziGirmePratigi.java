package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class YaziGirmePratigi {

    public static void main(String[] args) throws InterruptedException {

    WebDriver driver = BrowserFactory.getDriver("chrome");

    driver.get("https://www.sprint.com/");

        WebElement input1 = driver.findElement(By.cssSelector("div:nth-child(1) > a > p"));
        input1.click();
        Thread.sleep(3000);

        WebElement input2 = driver.findElement(By.id("loginHeaderUsername"));
        input2.sendKeys("32mehmetkaya");
        Thread.sleep(2000);

        WebElement input3 = driver.findElement(By.id("loginHeaderPassword"));
        input3.sendKeys("Ygokdere32!");

        WebElement input4 = driver.findElement((By.cssSelector(" #nav-login > div > div:nth-child(3) > div > div:nth-child(2)")));
        input4.click();

        String actualUrl = driver.getCurrentUrl();

        String expectedUrl = "https://mysprint.sprint.com/entrycheck/login.fcc";

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }














    }
}
