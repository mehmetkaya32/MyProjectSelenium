package utils;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

//1. Create a new class TitleVerification2 under utilities package and create a main method.
public class TitleVerification2 {
    //2. Add this ArrayList declaration to the main method:
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");


        List<String> urls = Arrays.asList("https://amazon.com",
                "https://wayfair.com/",
                "https://walmart.com"
                , "https://westelm.com/");

        //            3. Visit all websites one by one.

        //            4. Verify that URL of the website contains the title of the website. Ignore spaces and case
//    in comparison. For example, title of in the first website title is Lulu and Giorgia and the
//    URL is https://lulugandgeorgia.com. So, this test case must pass.


        driver.get(urls.get(0));
        System.out.println(driver.getTitle().contains("Shopping"));

        driver.get(urls.get(1));
        System.out.println(driver.getTitle().contains("Wayfair.com"));

        driver.get(urls.get(2));
        System.out.println(driver.getTitle().contains("Walmart.com"));

        driver.get(urls.get(3));
        System.out.println(driver.getTitle().contains("Modern Furniture"));







//            5. Close the browser at the end of the test.



        driver.quit();
}
}