package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class AddWorkspacePage {
    public WebDriver driver;
    WebDriverWait wait;

    public AddWorkspacePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    By workspacesBtn = By.cssSelector("#__next > div > div.gamut-otnx7u-AppWrapper.e123k1yw0 > div.gamut-3a1jmv-Box-ContentContainer.e1dgn4f70 > div.gamut-1bmtt1w-FlexBox.e1tc6bzh0 > div.gamut-1efsrtw-Box.ebnwbv90 > div > nav > ul > div:nth-child(5) > li > button > div");
    By addWorkspaceBtn = By.cssSelector(".e116l7sm0.gamut-1i70joj-ResetElementAnchor-createButtonComponent.e1bhhzie0");
    By htmlCSSBtn = By.cssSelector("#__next > div > div > div > main > div.gamut-1iet9p7-Box.ebnwbv90 > div > ul:nth-child(1) > li:nth-child(1) > button > div");
    By htmlPage = By.cssSelector("#__next > div > div > div > main > div.gamut-1x0pegb-FlexBox.e1tc6bzh0 > div > div > div > div.Pane.vertical.Pane1.styles_pane__imNQw > section > div > div.gamut-bc6cpj-FlexBox.ep6f9cl2 > div > div.gamut-1ta9j9y-Box.etskkz71 > div:nth-child(1) > div");

    public void addWorkspace() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(workspacesBtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addWorkspaceBtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(htmlCSSBtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(htmlPage)).click();


        try {
            Thread.sleep(2000); // Pause for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
