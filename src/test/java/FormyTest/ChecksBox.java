package FormyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChecksBox {
    // 3 category

    // variables
    public WebDriver driver;

    //locators

    // methods

    public void navigateToDesiredLink(String linkName) throws InterruptedException {

        List<WebElement> linksToNavigate = driver.findElements(By.cssSelector("body > div > div > li> a"));
        for (WebElement each: linksToNavigate) {
            if(each.getText().equalsIgnoreCase(linkName)){
                each.click();
                Thread.sleep(5000);
                break;
            }else {
                System.out.println("it did not find the link to click");
            }

        }

    }

    //  Inheritance
    public void VerifyCheckBoxTestNames() throws InterruptedException {
        List<WebElement>  checkboxes = driver.findElements(By.xpath("/html/body/div/div/div/div"));

        for(int i=0; i<checkboxes.size();i++){
            String result = checkboxes.get(i).getText();
            Thread.sleep(3000);
            System.out.println("Result " +" "+ (i+1) +" " + result);
        }
    }

}
