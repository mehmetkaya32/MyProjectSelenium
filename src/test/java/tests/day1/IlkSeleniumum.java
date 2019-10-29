package tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkSeleniumum {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://cnn.com");

        String actualResult = driver.getTitle();

        String expectedResult = "CNN - Breaking News, Latest News and Videos";

        if (actualResult.equals(expectedResult)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        Thread.sleep(4000);
        driver.close();
    }
}