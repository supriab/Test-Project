import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ebay {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");
        List<WebElement> links = driver.findElements(By.xpath("//a[@class=\"thrd\"]"));

        for (WebElement a : links) {
            System.out.println(a.getText());
        }



    }
}