package tests.day4;

// package Tests.day4_vyTrackTest;
// import com.github.javafaker.Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestLogin {

    public static void main(String[] args) {

        //This test is for user login test of vytrack application.
        //Tested with 3 different types of login.
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        BrowserUtils.wait(2);

        // Faker f = new Faker();
        List<String[]> credentials = new ArrayList<String[]>();

        /* for (int i = 0; i <4; i++) {
            credentials.add(new String[] {f.name().username(), f.internet().password()});
        }*/

        credentials.add(new String[] {"salesmanager146", "UserUser123"});
        credentials.add(new String[] {"salesmanager147", "UserUser123"});
        credentials.add(new String[] {"salesmanager148", "UserUser123"});

        credentials.add(new String[] {"storemanager81", "UserUser123"});
        credentials.add(new String[] {"storemanager82", "UserUser123"});
        credentials.add(new String[] {"storemanager246", "UserUser123"});

        credentials.add(new String[] {"user45", "UserUser123"});
        credentials.add(new String[] {"user46", "UserUser123"});
        credentials.add(new String[] {"user47", "UserUser123"});


        String res = "";

        for(String[] each : credentials){

            driver.findElement(By.name("_username")).sendKeys(each[0]);
            driver.findElement(By.name("_password")).sendKeys(each[1], Keys.ENTER);

            BrowserUtils.wait(4);
            String expected_result = "Dashboard";

            if(driver.getCurrentUrl().equalsIgnoreCase("https://qa2.vytrack.com/")){
                //To logout clicking on the little arrow from right corner
                driver.findElement(By.className("fa-caret-down")).click();

                String actual_result = driver.getTitle();
                res += "Username: "+each[0]+"\tPassword: "+each[1]+"\tResult: "+(expected_result.equals(actual_result)? "Pass\n" : "Fail\n");
                //To click logout option from dropDown button
                driver.findElement(By.xpath("//a[@href='/user/logout' and text()='Logout']")).click();

            } else {
                String actual_result = driver.getTitle();
                res += "Username: "+each[0]+"\tPassword: "+each[1]+"\tResult: "+(expected_result.equals(actual_result)? "Pass\n" : "Fail\n");
                driver.findElement(By.name("_username")).clear();
            }
            BrowserUtils.wait(4);
        }

        System.out.println(res);
        driver.close();



    }

}


/*
            //To logout clicking on the little arrow from right corner
            driver.findElement(By.className("fa-caret-down")).click();
            String expected_result = "Dashboard";
            String actual_result = driver.getTitle();
            res += "Username: "+each[0]+"\tPassword: "+each[1]+"\tResult: "+(expected_result.equals(actual_result)? "Pass\n" : "Fail\n");
            //To click logout option from dropDown button
            driver.findElement(By.xpath("//a[@href='/user/logout' and text()='Logout']")).click();
 */