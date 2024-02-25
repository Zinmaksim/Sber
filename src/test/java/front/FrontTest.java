package front;

import core.BaseSeleniumTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.FirstPage;

public class FrontTest extends BaseSeleniumTest {
    //public static WebDriver driver;

    @Test
    public void authorization(){
        FirstPage firstPage = new FirstPage();
        firstPage.addABookToTheCart();
    }




}









