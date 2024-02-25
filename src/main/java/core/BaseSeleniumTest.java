package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

// делаем класс абстрактным, чтобы не могли создавать экземпляры, потому что  мф будем только наследоваться
abstract public class BaseSeleniumTest {
    protected WebDriver driver;


    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
         WebDriver driver = new ChromeDriver(options);
        //WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        BaseSeleniumPage.setDriver(driver);
    }

  // @After
  // public void tearDown() {
  //     // закрываем Хром драйвер (обязательно)
  //     driver.close();
  //     // закрываем браузер
  //     driver.quit();
  // }


}
