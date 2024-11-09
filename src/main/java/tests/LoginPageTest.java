package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.BrowserFactory;

public class LoginPageTest {
    WebDriver driver;
    LoginPage page;

    @BeforeTest
    public void beforeTest() {
        // Get the browser instance from BrowserFactory
        driver = BrowserFactory.getBrowser("chrome");

        // Initialize LoginPage with the driver instance
        page = new LoginPage(driver);

        // Open the target URL (replace with your login page URL)
        driver.get("https://www.codecademy.com");
    }

    @Test
    public void loginOperation() {
        page.login("zyosmiley99@gmail.com", "Zahra@magic1");
    }

    @AfterTest
    public void afterTest() {
        BrowserFactory.closeBrowser();
    }
}
