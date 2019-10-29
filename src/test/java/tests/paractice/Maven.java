package tests.paractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserUtils;

public class Maven {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();

        WebElement input = driver.findElement(By.id("prependedInput"));
        System.out.println(input.getAttribute("required"));
        input.sendKeys("storemanager220");
        BrowserUtils.wait(1);

        WebElement input2 = driver.findElement(By.id("prependedInput2"));
        System.out.println(input2.getAttribute("required"));
        input2.sendKeys("UserUser123");
        Thread.sleep(2000);

        WebElement input3 = driver.findElement((By.id("_submit")));
        input3.click();




        System.out.println(driver.getTitle());











    }
}
