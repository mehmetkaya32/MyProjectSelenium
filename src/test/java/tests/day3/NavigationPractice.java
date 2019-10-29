package tests.day3;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class NavigationPractice {
    public static void main(String[] args) {
        // creat a webdriver object to work with a browser
        WebDriver driver = BrowserFactory.getDriver("chrome");
        // to maximize browser window
        driver.manage().window().maximize();//to maximize browser window
        driver.get("http://google.com");

        // wait foe 3 seconds
        // this is out custom method
        // since method is static, we use class name to call the method
        // as a parameter, we provide number of seconds (time in seconds)
        BrowserUtils.wait(3);

        // HOW TO PRINT TITLE
        System.out.println(driver.getTitle());
        driver.navigate().to("http://amazon.com");

        //navigate back to google (previous URL)
        driver.navigate().back();

        //move forward to the amazon again
        driver.navigate().forward();

        //to refresh/reload a webpage/website
        driver.navigate().refresh();
        driver.getTitle(); // <title>Google</title>

        // if tab only one, close() will shutdown browser and we cannot use driver anymore
        // so we have to recreate an object of webdrive
        // shutdown browser
        driver.quit();

        // driver.get("http://google.com");

    }
}