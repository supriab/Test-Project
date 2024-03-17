import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows\n");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        WebElement openTab = driver.findElement(By.id("tabButton"));
        openTab.click();

    //    System.out.println(driver.getTitle());
    }
}
