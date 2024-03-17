import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

public class Alert2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement alert = driver.findElement(By.xpath("//input[@value=\"Alert\"]"));
        alert.click();
        driver.switchTo().alert().accept();
    }
}
