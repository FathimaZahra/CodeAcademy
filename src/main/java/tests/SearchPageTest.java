package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SearchPage;
import utilities.BrowserFactory;

public class SearchPageTest {
    WebDriver driver;
    SearchPage page;
    @BeforeTest
    public void beforeTest() {
        // Get the browser instance from BrowserFactory
        driver = BrowserFactory.getBrowser("chrome");

        // Initialize LoginPage with the driver instance
        page = new SearchPage(driver);

        // Open the target URL (replace with your login page URL)
        driver.get("https://www.codecademy.com/business");
    }


    @Test
    public void searchOperation() {
        page.search("AI");
    }

    @AfterTest
    public void afterTest() {
        BrowserFactory.closeBrowser();
    }
}
