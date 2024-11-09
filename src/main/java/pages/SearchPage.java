package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class SearchPage {
    public WebDriver driver;
    WebDriverWait wait;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    By searchBtn = By.cssSelector("#__next > div > header > div.gamut-p0t16r-Box.ed6ugps0 > nav > ul > li.gamut-1xanxbz-Box.e1de70210 > div > div > button");
    By searchInputLoc = By.id("header-search-bar");

    public void search(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchInputLoc)).sendKeys(name);
        try {
            Thread.sleep(2000); // Pause for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
