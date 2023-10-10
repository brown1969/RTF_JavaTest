package pages;

import org.openqa.selenium.WebDriver;

public class PageProvider {
    WebDriver webDriver;

    public PageProvider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public MainPage getMainPage(){
        return new MainPage(webDriver);
    }

    public LoginPage getLoginPage() {
        return new LoginPage(webDriver);

    }

}
