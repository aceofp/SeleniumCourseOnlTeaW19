package pl.coderslab.zadanie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByIdTest {

    @Test

    public void shouldSearchHotel() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement webElement = driver.findElement(By.id("hotel_location"));
        webElement.clear();
        webElement.sendKeys("Warsaw");
        webElement.submit();
        driver.quit();
    }

    @Test

    public void shouldSearchSearchNow() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement searchInputBox = driver.findElement(By.id("search_room_submit"));

    }

    @Test

    public void shouldSearchEmail() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement searchInputBox = driver.findElement(By.id("newsletter-input"));
        searchInputBox.clear();
        searchInputBox.sendKeys("aceofp@gmail.com");
        searchInputBox.submit();
        driver.quit();
    }
}

