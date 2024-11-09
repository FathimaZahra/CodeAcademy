package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SetGoalPage;
import utilities.BrowserFactory;
import pages.LoginPage;

public class SetGoalPageTest {
    WebDriver driver;
    SetGoalPage setGoalpage;
    LoginPage loginPage;
    @BeforeTest
    public void beforeTest() {
        // Get the browser instance from BrowserFactory
        driver = BrowserFactory.getBrowser("chrome");

        // Initialize LoginPage with the driver instance
        setGoalpage = new SetGoalPage(driver);
        loginPage = new LoginPage(driver);

        // Open the target URL (replace with your login page URL)
        // Open the website's login page
        driver.get("https://www.codecademy.com");

        // Perform login before searching
        loginPage.login("zyosmiley99@gmail.com", "Zahra@magic1");
    }


    @Test
    public void setGoalOperation() {
        setGoalpage.setGoal();
    }

    @AfterTest
    public void afterTest() {
        BrowserFactory.closeBrowser();
    }
}
