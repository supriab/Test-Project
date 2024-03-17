import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class NewTab2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows\n");
        System.out.println(driver.getTitle());

        WebElement openTab = driver.findElement(By.id("tabButton"));

        openTab.click();

        System.out.println("Before forLoop");
        System.out.println(driver.getCurrentUrl());

        //current tab

        String currentTab = driver.getWindowHandle();

        //all tabs/windows
        Set<String> allTabs = driver.getWindowHandles();

        for (String a: allTabs) {
            if (a!= currentTab){
                driver.switchTo().window(a);
            }

        }
        System.out.println("after forLoop");

        System.out.println(driver.getCurrentUrl());

        driver.quit();





    }
}
