import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com");
        WebElement category = driver.findElement(By.xpath("//select[@id=\"gh-cat\"]"));

        Select select = new Select(category);

        select.selectByIndex(7);

        select.selectByValue("15032");
        select.selectByVisibleText("Baby");



    }
}
