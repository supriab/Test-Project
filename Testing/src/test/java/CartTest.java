import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends Base{

    CartPage cartPage;

    @BeforeMethod
    void starting(){
        openBrowser("https://cart.ebay.com/");
        cartPage = PageFactory.initElements(driver,CartPage.class);
    }

    @Test
    void testText(){
        String expected = "You don't have any items in your cart.";
        String actual = cartPage.text();
        Assert.assertEquals(actual,expected);
    }
}
