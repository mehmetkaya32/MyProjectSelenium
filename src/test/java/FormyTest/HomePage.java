package FormyTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {


    // variables -- global

    String googleURL = "https://www.google.com";

    // locator  data type webElement

    // methods -- dynamic

    public void GetResultOfAnyProductFromGoogle(String product) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        // object create
        WebDriver driver = new ChromeDriver();

        //go to google page
        driver.get(googleURL);

        //locate search box
        WebElement searchBoxLocator = driver.findElement(By.name("q"));
        searchBoxLocator.sendKeys(product);

        // send the keyword to the google search box
        searchBoxLocator.submit();

        // verify result
        /// store result then get text , then compare.
        WebElement resultLocator = driver.findElement(By.id("resultStats"));
        String result = resultLocator.getText();

        System.out.println(result);
        Assert.assertTrue(result.contains("results"));

        // ne yaptigini gormek beklemek icin
        Thread.sleep(2000);
        driver.quit();

    }


    // verify result

    @Test
    public void GoogleSearchIphone() throws InterruptedException {

        GetResultOfAnyProductFromGoogle("Ozan Tufan");

    }


    @Test
    public void GoogleSearchMouse() throws InterruptedException {

        GetResultOfAnyProductFromGoogle("Tolga Cigerci");

    }


    @Test
    public void GoogleSearchComputer() throws InterruptedException {

        GetResultOfAnyProductFromGoogle("Emre Belezoglu");

    }

    @Test
    public void GoogleSearchToyota() throws InterruptedException {

        GetResultOfAnyProductFromGoogle("Vedat Muriqi");

    }



}