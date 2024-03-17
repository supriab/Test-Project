import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class Ac2 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");
        WebElement videoGames = driver.findElement(By.xpath("//a[@class=\"vl-flyout-nav__js-link\"]"));

      //  Thread.sleep(2000);


     //   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

       // WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(20000));
       // wait.until(ExpectedConditions.visibilityOf(videoGames));
        videoGames.click();


    }
}
