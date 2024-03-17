import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement searchbox =driver.findElement(By.xpath("//input[@type=\"text\"]"));
        searchbox.sendKeys("Smatrphone");
        WebElement searchbutton = driver.findElement(By.xpath("//input[@value=\"Search\"]"));
        searchbutton.click();


        driver.findElement(By.xpath("//span[@role=\"heading\"]")).click();

    }
}
