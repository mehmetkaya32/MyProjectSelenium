package utils;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;



    //        1. Create a new class TitleVerification under utilities package and create a main method.
public class TitleVerification {

    //        2. Add this ArrayList declaration to the main method:
    public static void main(String[] args) {


        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

//        3. Open chrome browser
        WebDriver driver = BrowserFactory.getDriver("chrome");



//        4. Visit all the websites from step 3 and verify that they all have the same title.
//        driver.get(urls.get(0));
//        String title0 = driver.getTitle();
//
//        driver.get(urls.get(1));
//        String title1 = driver.getTitle();
//
//        driver.get(urls.get(2));
//        String title2 = driver.getTitle();
//
//        System.out.println(title0 + " = " +title1 + " = " + title2);

        for(int i=0; i<urls.size();i++) {

            driver.get(urls.get(i));

            System.out.println(i +" , " + driver.getTitle());

        }

//        5. Verify that all URLs of all pages start with http://practice.cybertekschool.com.
        //System.out.println( urls.get(0).contains("http://practice.cybertekschool.com"));
        //System.out.println( urls.get(1).contains("http://practice.cybertekschool.com"));
        //System.out.println( urls.get(2).contains("http://practice.cybertekschool.com"));

        for(int i=0; i<urls.size();i++) {

            System.out.println( urls.get(i).contains("http://practice.cybertekschool.com"));
        }


//        6. Close the browser at the end of the test.
        driver.close();

    }
}