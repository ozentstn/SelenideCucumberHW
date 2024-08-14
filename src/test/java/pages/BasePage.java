package pages;

import com.codeborne.selenide.Selenide;
import utils.PropertyManager;
import com.codeborne.selenide.WebDriverRunner;

public abstract class BasePage {

    protected String pageUrl;
    PropertyManager propertyManager = new PropertyManager();

    public BasePage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void open() {
        String url = propertyManager.getProperty("APP_URL") + pageUrl ;
        Selenide.open(url);
    }
    public String getUrl(){
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }
}
