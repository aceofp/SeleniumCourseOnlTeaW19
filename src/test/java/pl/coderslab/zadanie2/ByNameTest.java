package pl.coderslab.zadanie2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByNameTest {

    @Test

    public void shouldSearchHotelLocation() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement webElement = driver.findElement(By.name("hotel_location"));
        webElement.clear();
        webElement.sendKeys("Warsaw");
        //driver.quit();
    }

    @Test
    public void shouldSearchSearchNow() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement webElement = driver.findElement(By.name("search_room_submit"));
        //driver.quit();
    }

    @Test
    public void shouldSearchEmail() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement webElement = driver.findElement(By.name("email"));
        webElement.clear();
        webElement.sendKeys("aceofp@gmail.com");
        //driver.quit();
    }

    @Test
    public void shouldSearchSubmitButton() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement webElement = driver.findElement(By.name("submitNewsletter"));
        driver.findElement(By.name("submitNewsletter")).submit();
        //driver.quit();
    }
}
