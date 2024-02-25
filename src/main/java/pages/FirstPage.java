package pages;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage extends BaseSeleniumPage {

    @FindBy(xpath = "//input[@placeholder=\"Найти...\"]")
    private WebElement search;

    @FindBy(xpath = "//button[@aria-label=\"Искать\"]")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@data-chg-product-name]//span[contains(text(), \"Купить\")]")
    private WebElement buy;

    @FindBy(xpath = "//*[@href=\"/cart\"]")
    private WebElement cart;

    public FirstPage() {
        driver.get("https://www.chitai-gorod.ru/");
        // отвечает за инициализацию всех элементов
        PageFactory.initElements(driver, this);
    }



    public FirstPage addABookToTheCart(){
        //driver.switchTo().alert().dismiss();
        search.click();
        search.sendKeys("Убить пересмешника");
        searchButton.submit();
buy.click();
cart.click();





// возращаем текущую страницу
        return this;
    }




}
