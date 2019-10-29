package utils;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerication3 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");


        List<String> urls = Arrays.asList("https://amazon.com",
                "https://wayfair.com/",
                "https://walmart.com"
                , "https://westelm.com/");

        //            3. Visit all websites one by one.


        driver.get(urls.get(0));
        System.out.println(driver.getTitle().contains("Shopping"));
        driver.close();

       driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(1));
        System.out.println(driver.getTitle().contains("Wayfair.com"));
        driver.close();

        driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(2));
        System.out.println(driver.getTitle().contains("Walmart.com"));
        driver.close();

        driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(3));
        System.out.println(driver.getTitle().contains("Modern Furniture"));
        driver.close();

    }
}
