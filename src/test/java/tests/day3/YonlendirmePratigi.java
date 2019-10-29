package tests.day3;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class YonlendirmePratigi {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        String title = driver.getTitle();
        System.out.println(title);

        driver.navigate().to("http://tr.beinsports.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.getTitle();
        BrowserUtils.wait(3000);
        driver.quit();









    }
}
