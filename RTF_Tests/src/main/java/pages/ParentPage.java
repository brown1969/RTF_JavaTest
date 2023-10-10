package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static libs.ConfigProvider.configProperties;

public class ParentPage extends ActionsWithElements{


    public ParentPage(WebDriver webDriver) {
        super(webDriver);
    }

    String BASE_URL = configProperties.base_url();

    public void  openPage(String url) {
        try {
            webDriver.get(url);
            logger.info("Page was opened " + url);
        } catch (Exception e) {
            logger.error("Can not open " + url);
            Assert.fail("Can not open " + url);
        }
    }

    //TODO add checkUrl



}
