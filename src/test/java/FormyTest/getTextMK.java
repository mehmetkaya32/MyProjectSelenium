package FormyTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserUtils;

public class getTextMK {

    WebDriver driver;

    public void textGet() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/");

        WebElement switchWindowElement = driver.findElement(By.xpath("/html/body/div/div/li[13]/a"));

        switchWindowElement.click();
        BrowserUtils.wait(2);

        WebElement sWindowGetText = driver.findElement(By.cssSelector("body > div > h1"));

        String printText = sWindowGetText.getText();

        System.out.println(printText);

    }
}
