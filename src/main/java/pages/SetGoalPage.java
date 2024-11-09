package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class SetGoalPage {
    public WebDriver driver;
    WebDriverWait wait;

    public SetGoalPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    By myHomeBtn = By.cssSelector("#__next > div > header > div.gamut-p0t16r-Box.ed6ugps0 > nav > ul > li:nth-child(2) > a");
    By edit = By.cssSelector("#__next > div > div.gamut-otnx7u-AppWrapper.e123k1yw0 > div.gamut-3a1jmv-Box-ContentContainer.e1dgn4f70 > div.gamut-1bmtt1w-FlexBox.e1tc6bzh0 > div.gamut-1j9x5ty-Box.ebnwbv90 > div > div > div:nth-child(2) > div.gamut-1qbb9ow-LayoutGrid.e10xj1580 > div:nth-child(2) > div > div.gamut-117xs8u-FlexBox.e1tc6bzh0 > a");
    By buildAProjectLoc = By.cssSelector("body > div.react-root > div > div > div.gamut-otnx7u-AppWrapper.e123k1yw0 > div > div > div > main > div.gamut-1nmpk0i-StyledRadioGroup.e5gd1h0 > div:nth-child(3) > label");
    By fiveStar = By.cssSelector("#weeklyTargetLabel-5 > svg > path");
    By saveGoal = By.cssSelector(".e116l7sm0.gamut-tdzm4x-ResetElement-createButtonComponent.e1bhhzie1");
    public void setGoal() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(myHomeBtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(edit)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(buildAProjectLoc)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(fiveStar)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveGoal)).click();
        try {
            Thread.sleep(2000); // Pause for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
