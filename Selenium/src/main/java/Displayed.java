import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");
        WebElement collectibles = driver.findElement(By.xpath("//a[@_sp=\"p4375194.m1381.l3250\"]"));

        System.out.println(collectibles.isDisplayed());
        System.out.println(collectibles.isSelected());
        System.out.println(collectibles.isEnabled());
    }


}
