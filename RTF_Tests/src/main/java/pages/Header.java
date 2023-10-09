package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends ActionsWithElements {

    @FindBy(xpath = "//a[@class='header-base__logo relative z-10']")
    private WebElement buttonReadyToFight;

    @FindBy(xpath = "//*[@id='__nuxt']/div/div[1]/div/div/div[1]/div[1]/a")
    private WebElement buttonOffers;

    @FindBy(xpath = "//*[@id='__nuxt']/div/div[1]/div/div/div[1]/div[2]/a")
    private WebElement buttonNews;

    @FindBy(xpath = "//*[@id='__nuxt']/div/div[1]/div/div/div[1]/div[3]/a")
    private WebElement buttonFAQ;

    @FindBy(xpath = "//input[@id='__input_93']")
    private WebElement inputSearch;

    @FindBy(xpath = "//*[@id='__nuxt']/div/div[1]/div/div/div[3]/div[1]/a")
    private WebElement buttonChat;

    @FindBy(xpath = "//*[@id='__nuxt']/div/div[1]/div/div/div[3]/div[1]/div/div/div[1]/div/div[1]")
    private WebElement userAvatar;

    @FindBy(xpath = "//div[@class='select-none hidden md:block truncate']")
    private WebElement buttonSubMenu;

    @FindBy(xpath = "//a[@href='/profile']")
    private WebElement buttonProfile;

    @FindBy(xpath = "//a[@href='/profile/edit']")
    private WebElement buttonEditProfile;

    @FindBy(xpath = "//span[text()='Log out']")
    private WebElement buttonLogOut;


    public Header(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkIsButtonUserAvatarVisible() {
        checkElementDisplayed(userAvatar);
    }

    public void checkIsButtonSubMenuVisible() {
        checkElementDisplayed(buttonSubMenu);
    }

    public MainPage clickOnButtonReadyToFight() {
        clickOnElement(buttonReadyToFight);
        return new MainPage(webDriver);
    }

    public OffersPage clickOnButtonOffers() {
        clickOnElement(buttonOffers);
        return new OffersPage(webDriver);
    }

    public NewsPage clickOnButtonNews() {
        clickOnElement(buttonNews);
        return new NewsPage(webDriver);
    }

    public FAQPage clickOnButtonFAQ() {
        clickOnElement(buttonFAQ);
        return new FAQPage(webDriver);
    }

    public ChatPage clickOnButtonChat() {
        clickOnElement(buttonChat);
        return new ChatPage(webDriver);
    }

    public ProfilePage clickOnButtonProfile() {
        clickOnElement(buttonProfile);
        return new ProfilePage(webDriver);
    }

    public EditProfilePage clickOnButtonEditProfile() {
        clickOnElement(buttonEditProfile);
        return new EditProfilePage(webDriver);
    }

    public void clickOnButtonLogOut() {
        clickOnElement(buttonLogOut);
    }

}
