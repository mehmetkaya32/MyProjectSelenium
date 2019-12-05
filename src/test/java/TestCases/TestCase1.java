package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;
import utils.BrowserUtils;

import java.util.List;

public class TestCase1 {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = BrowserFactory.getDriver("chrome");

        BrowserUtils.wait(2);
        driver.get("https://qa1.vytrack.com/");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("storemanager85");

        driver.findElement((By.xpath("//input[@type='password']"))).sendKeys("UserUser123", Keys.ENTER);


    }

    @Test
    public void test2() {

        Actions a = new Actions(driver);

        BrowserUtils.wait(2);
        //locating the Activites link
        WebElement move = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/a/span"));

        //Moving out object on Activities link.
        a.moveToElement(move).build().perform();
        BrowserUtils.wait(2);

        //Clicking the activities link
        driver.findElement(By.xpath("//span[contains(text(),'Calendar Events')]")).click();
        BrowserUtils.wait(2);

        //clicking the Grid Setting
        driver.findElement(By.xpath("//i[@class='fa-cog hide-text']")).click();
        BrowserUtils.wait(2);

        List<WebElement> row = driver.findElements(By.xpath("//div[@class='toolbar']//tr//td[1]"));
        for(int i=0;i<row.size();i++){
            BrowserUtils.wait(2);
            if(!row.get(i).getText().equalsIgnoreCase("Title")){
                row.get(i).click();

            }
        }








    }










    @AfterMethod
    public void quit() {

        BrowserUtils.wait(8);
        driver.quit();
    }
}