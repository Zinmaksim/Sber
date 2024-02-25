package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage {
    protected WebDriver driver;
   // public BasePage(WebDriver driver){
    //    this.driver=driver;
    //}

    public void open(String url){
        driver.get(url);
    }
    //public WebElement waitElementVisible(WebElement element){
    //    new WebDriver(driver, 4).until(ExpectedConditions.visibilityOf(element));
   //     return element;
    //}


}
