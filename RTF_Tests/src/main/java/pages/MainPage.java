package pages;

import org.openqa.selenium.WebDriver;

import static data.TestData.LOGIN_DEFAULT;
import static data.TestData.PASSWORD_DEFAULT;

public class MainPage extends ParentPageWithHeader {

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openMainPage() {
    openPage(BASE_URL);
    }

    public void loginWithValidCreds() {
        openMainPage();
        getHeader().clickOnButtonLogin();
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.enterLoginEmail(LOGIN_DEFAULT);
        loginPage.enterLoginPassword(PASSWORD_DEFAULT);
        loginPage.clickOnLoginButton();

    }

}

