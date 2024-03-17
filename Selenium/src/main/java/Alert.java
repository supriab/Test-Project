import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
        alertButton.click();
        driver.switchTo().alert().accept();
    }
}
