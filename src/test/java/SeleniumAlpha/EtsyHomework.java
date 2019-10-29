package SeleniumAlpha;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class EtsyHomework {

    public static void main(String[] args) {

        // 1. Openbrowser
        WebDriver driver = BrowserFactory.getDriver("chrome");

//        2. Go to website https://google.com
        driver.get("https://google.com");

//        3. Save the title in a string variable
        String googleTitle = driver.getTitle();

//        4. Go to https://etsy.com
        driver.navigate().to("https://etsy.com");

//        5. Save the title in a string variable
        String etsyTitle = driver.getTitle();

//        6. Navigate back to previous page
        driver.navigate().back();

//        7. Verify that title is same is in step3
        if (googleTitle.equals(driver.getTitle())){
            System.out.println("The both titles are same "+googleTitle+ " = "+driver.getTitle());

        } else {
            System.out.println("They are different");
        }

//        8. Navigate forward to previous page
        driver.navigate().forward();

//        9. Verify that title is same is in step5
        if (etsyTitle.equals(driver.getTitle())){
            System.out.println("The both titles are same "+etsyTitle+ " = "+driver.getTitle());

        } else {
            System.out.println("They are different");
        }
        driver.quit();

    }
}
