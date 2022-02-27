package pl.coderslab;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QwantOnetSearchTest {
    @Test

    public void shouldSearchQwant() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qwant.com");
        WebElement searchInputBox = driver.findElement(By.name("q"));
        searchInputBox.clear();
        searchInputBox.sendKeys("w pustyni i w puszczy");
        searchInputBox.submit();
//        driver.quit();
    }

    @Test
    public void shouldSearchOnet() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://onet.pl");
        WebElement searchInputBox = driver.findElement(By.name("qt"));
        searchInputBox.clear();
        searchInputBox.sendKeys("w pustyni i w puszczy");
        searchInputBox.submit();
        driver.quit();
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("beforeEach");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("afterEach");
    }
}

