package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginPage {
    public WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    By loginBtnTop = By.cssSelector(".e116l7sm0.gamut-1gqgapu-ResetElementAnchor-createButtonComponent.e1bhhzie0");
    By emailLoc = By.id("user_login");
    By passwordLoc = By.id("login__user_password");
    By loginBtnBottom = By.cssSelector(".e116l7sm0.gamut-tdzm4x-ResetElement-createButtonComponent.e1bhhzie1");

    public void login(String email, String password) {
        driver.findElement(loginBtnTop).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailLoc)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLoc)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginBtnBottom)).click();
    }
}
