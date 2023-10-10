package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPageWithHeader {

   @FindBy(xpath = "//*[@id='__nuxt']/div/div[2]/div[1]/div/div/div[1]/div[3]/form/div[1]/div/div/input")
    private WebElement loginEmail;

   @FindBy(xpath = "//*[@id='__nuxt']/div/div[2]/div[1]/div/div/div[1]/div[3]/form/div[2]/div/div/input")
    private WebElement loginPassword;

   @FindBy(xpath = "//*[@id='__nuxt']/div/div[2]/div[1]/div/div/div[1]/div[3]/form/div[3]/button/span")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id='__nuxt']/div/div[1]/div/div/div[3]/div[1]/div/div/div[1]/div/div[1]")
    private WebElement userAvatar;


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage checkIsChatIconDisplayed() {
        checkElementDisplayed(userAvatar);
        return this;
    }

    public LoginPage enterLoginEmail(String email) {
        enterTextIntoInput(loginEmail, email);
        return this;
    }

    public LoginPage enterLoginPassword(String password) {
        enterTextIntoInput(loginPassword, password);
        return this;
    }

    public LoginPage clickOnLoginButton() {
        clickOnElement(loginButton);
        return this;
    }


}
