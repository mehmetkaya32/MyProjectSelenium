package SeleniumTestAndQuizWebsite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWebPage {

    // 3 categories

    // variables

    // locators

    // methods

    // Testcases

    // Junit --> Test public void Testname() {}
    // JUNIT --> Assert.AssertEqual(expected, actual)
    // Expected --> computer gelen sonuc
    // Actual --> user dan gelen sonuc
    // compare

    WebDriver driver;

    @Test
    public void GetTitlePage() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://www.testandquiz.com/selenium/testing.html");

        driver.getTitle();

        Assert.assertEquals(driver.getTitle(), "Sample Test Page");

    }

    @Test
    public void GetAttributeValuefPage(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.testandquiz.com/selenium/testing.html");

        //Store variale ,
        WebElement inputBox = driver.findElement(By.name("firstName"));
        inputBox.sendKeys("Code Test");
        String result = inputBox.getAttribute("value");
        Assert.assertEquals(result,"Code Test");
        System.out.println(result);

    }
    @Test
    public void GetColorOfTestCase(){


    }

}
