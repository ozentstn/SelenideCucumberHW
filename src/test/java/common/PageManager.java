package common;

import driver.DriverFactory;
import pages.ElementsPage;
import pages.WebTablePage;

public class PageManager {
    public WebTablePage webTablePage;
    public ElementsPage elementsPage;

    public PageManager() {

        DriverFactory.initDriver();

        webTablePage = PageFactory.buildWebTablePage();
        elementsPage = PageFactory.buildElementsPage();

    }
}
