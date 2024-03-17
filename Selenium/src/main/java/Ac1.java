import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");

        WebElement electronics = driver.findElement(By.xpath("//a[@_sp=\"p4375194.m1380.l3250\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(electronics).perform();
        electronics.click();

        Thread.sleep(2000);






    }
}
