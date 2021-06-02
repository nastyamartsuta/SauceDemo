package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginPageFactory extends BasePage {
    @FindBy(id = "user-name")
    WebElement userInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "login-button")
    WebElement loginButton;
    @FindBy(css = "[data-test=error]")
    WebElement errorText;

    public LoginPageFactory(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.saucedemo.com/");
        PageFactory.initElements(driver, this);
    }

    public void login(String user, String pass) {

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
        userInput.sendKeys(user);
        passwordInput.sendKeys(pass);
        loginButton.click();
    }

    public boolean isErrorDisplayed() {
        boolean isDisplayed;
        try {
            driver.manage().timeouts().implicitlyWait(0, SECONDS);
            isDisplayed = errorText.isDisplayed();
        } catch (NoSuchElementException exception) {
            isDisplayed = false;
        }
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        return isDisplayed;
    }

    public String getError() {
       return errorText.getText();
    }
}
