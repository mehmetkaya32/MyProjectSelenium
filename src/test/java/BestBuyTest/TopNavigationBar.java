package BestBuyTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;



//Regression
public class TopNavigationBar {


    //Junit library
    // -> @Test : for test case run --> Same page, multiple case creations.
    // --> Assert.AssertTrue()    ---> Verify, compare
    // actual: senin yaptin testing sonucu ,
    // expected result : computer gelen sonuc

    // Bir class ta uc tane category
//    1- Variable
//    2 - Methods
//    3 - locators

    // Global variables
    WebDriver driver;
    //3 - locators


    //Methods

    public void NavigateToBestBuyWebsite() {
        // Chrome setup
        WebDriverManager.chromedriver().setup();

        // object create --> Webdriver class
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.bestbuy.com/");

    }

    public void CloseBestBuyWebsite() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }

    public void EachNavigationGetText() {

        List<WebElement> allTopNavigationTabs = driver.findElements(By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[1]/ul/li/button"));
        for (WebElement item : allTopNavigationTabs) {
            System.out.println(item.getText());
            System.out.println("-------------");
        }

    }


    public void EachNavigationClick() throws InterruptedException {
        List<WebElement> allTopNavigationTabs = driver.findElements(By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[1]/ul/li/button"));
        for (WebElement eachlink : allTopNavigationTabs) {
            Thread.sleep(2000);
            eachlink.click();
        }
    }


    public void SpecificNavigationTabClick(String TabName) throws InterruptedException {
        List<WebElement> allTopNavigationTabs = driver.findElements(By.xpath("//*[@id=\"header-block\"]/div[2]/div[2]/div/nav[1]/ul/li/button"));
        for (WebElement eachlink : allTopNavigationTabs) {
            Thread.sleep(2000);
            if (eachlink.getText().equalsIgnoreCase(TabName)) {
                eachlink.click();
                System.out.println("It click the specific tab which is  --> " + eachlink.getText());
                break;
            }

        }
    }




    @Test
    public void NavigationBarTabsGetText() throws InterruptedException {

        NavigateToBestBuyWebsite();
        EachNavigationGetText();
        CloseBestBuyWebsite();

    }


    @Test
    public void NavigationBarTabsClickEach() throws InterruptedException {

        NavigateToBestBuyWebsite();
        EachNavigationClick();
        CloseBestBuyWebsite();
    }


    @Test
    public void NavigationBarTabsClickBrands(String brands) throws InterruptedException {

        NavigateToBestBuyWebsite();
        SpecificNavigationTabClick("Brands");
        CloseBestBuyWebsite();
    }

    //Smoke Test case
    @Test
    public void NavigationBarTabsClickServices() throws InterruptedException {

        NavigateToBestBuyWebsite();
        SpecificNavigationTabClick("Services");
        CloseBestBuyWebsite();
    }
//Command option L --> format your code.

}
