package tests.paractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        // WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        // WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        // WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        // WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input"));

        searchBox.sendKeys("computer");

        searchBox.submit();
        WebElement cart = driver.findElement(By.cssSelector("#nav-cart > span.nav-line-2"));
        System.out.println(cart.getText());
        driver.close();






    }
}
