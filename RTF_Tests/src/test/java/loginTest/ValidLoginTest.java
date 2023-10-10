package loginTest;

import baseTest.BaseTest;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static data.TestData.LOGIN_DEFAULT;
import static data.TestData.PASSWORD_DEFAULT;

public class ValidLoginTest extends BaseTest {

    @Test
    public void validLogin() {
        pageProvider.getMainPage().openMainPage();
        pageProvider.getMainPage().getHeader().clickOnButtonLogin();
        pageProvider.getLoginPage().enterLoginEmail(LOGIN_DEFAULT).enterLoginPassword(PASSWORD_DEFAULT).clickOnLoginButton();
        pageProvider.getLoginPage().getHeader().checkIsButtonUserAvatarVisible();

//@Test
//    public void validLogin2() {
//    pageProvider.getMainPage().loginWithValidCreds();
//    }

    }
}
