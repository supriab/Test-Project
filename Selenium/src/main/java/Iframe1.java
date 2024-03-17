import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Iframe1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().frame("presentation");

        WebElement signinText = driver.findElement(By.cssSelector("[jsname=\"a9kxte\"]"));

        String message = signinText.getText();

        System.out.println(message);


    }
}
