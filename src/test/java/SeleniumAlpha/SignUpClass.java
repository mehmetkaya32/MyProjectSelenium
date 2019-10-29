package SeleniumAlpha;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class SignUpClass {

    @Test
    public void verifyTextForSignUpPage() {


        WebDriver driver = BrowserFactory.getDriver("chrome");

        // navigate to website Selenium Alpha sign-up page
        driver.get("http://selenium-blog.herokuapp.com/signup");

        WebElement pageTitle = driver.findElement(By.cssSelector("h1[align='center']"));


        WebElement userNameTitle = driver.findElement(By.cssSelector("label[for='user_username']"));


        WebElement emailTitle = driver.findElement(By.cssSelector("label[for='user_email']"));


        WebElement passwordTitle = driver.findElement(By.cssSelector("label[for='user_password']"));


        WebElement signUpTitle = driver.findElement(By.cssSelector("submit"));



        // verify page title
        System.out.println(pageTitle.getText());

        // verify username text
        System.out.println(userNameTitle.getText());

        // verify email text
        System.out.println(emailTitle.getText());

        // verify password text
        System.out.println(passwordTitle.getText());

        // verify sign-up button text
        System.out.println(signUpTitle.getText());

        // get.text()


        driver.quit();



    // variable


    //method


    //locators

        // Signup for Alpha Blog


    }

}
