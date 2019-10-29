package tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BrowserUtils;

public class TemelYonlendirme {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.herkul.org/");
        driver.navigate().to("http://www.google.org/");
        driver.navigate().back();

        String url = driver.getCurrentUrl();
        System.out.println(url);
        BrowserUtils.wait(3);

        driver.close();

    }
}
