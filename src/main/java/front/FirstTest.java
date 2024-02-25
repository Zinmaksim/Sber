package front;

import core.BaseSeleniumTest;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Set;

public class FirstTest extends BaseSeleniumTest {

   // @Test
  // public void testSearchGoogle() {
  //     // WebDriver driver = new ChromeDriver(); // так когда driver скачивается каждый раз
  //     driver.get("https://google.com");

  //     WebElement searchBox = driver.findElement(By.name("q"));
  //     WebElement button = driver.findElement(By.xpath("//a[span[@class=\"gb_Dd\"]]"));

  //     //searchBox.sendKeys("ChromeDriver");
  //     //searchBox.submit(); // это значит нажали Enter
  //     //driver.quit();
  //     //driver.switchTo().alert().getText();
  //     //driver.manage().window().maximize();
  //     //driver.navigate().to("https://google.com"); //  аналог driver.get("https://google.com");, только не ждет окончания загрузки
  //     //Set<String> windows = driver.getWindowHandles();
  //     //((JavascriptExecutor) driver).executeScript("window.open()"); // открываем с помощью javascript кода новую вкладку.

  //     JavascriptExecutor executor = (JavascriptExecutor) driver;
  //     // executor.executeScript("arguments[0].click()", button);
  //     // ((JavascriptExecutor) driver).executeScript("window.open()"); // открываем с помощью javascript кода новую вкладку.
  //     // ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
  //     // driver.switchTo().window(tabs.get(1));
  //     // driver.get("https://ya.ru");
  //     String text = "123456";
  //     executor.executeScript("arguments[0].value = '" + text + "'", searchBox);
  //     searchBox.submit();

  //     Toolkit toolkit = Toolkit.getDefaultToolkit();
  //     Clipboard clipboard = toolkit.getSystemClipboard();
  //     StringSelection stringSelection = new StringSelection(text);
  //     clipboard.setContents(stringSelection, null);
  //     //elementName.sendKeys(Keys.CONTROL, "v");

  //     //// можно сделать клик, вписать текст
  //     //ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
  //     //driver.switchTo().window(tabs.get(1)); // открываем рядом новую вкладку. Ничего что там была изначально всего одна вкладка с --индексом
////ystem.out.println(driver.getPageSource()); // вывести весь html - код


  //     Actions builder = new Actions(driver);
  //     //builder.moveToElement(searchBox).doubleClick().build().perform();


  //     // System.out.println(button.getText());
  //     // String text = button.getText();
  //     //.setContens(str, null);
  //     //searchBox.sendKeys(Keys.CONTROL, "v");
  // }
}
