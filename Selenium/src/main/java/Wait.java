import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Wait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");
        WebElement motors = driver.findElement(By.xpath("[clasas=\"vl-flyout-nav__expander\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(motors).build().perform();

        Thread.sleep(20000);

        motors.click();




    }

}
