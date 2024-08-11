package tests;

import org.testng.annotations.Test;

public class WebTablePageTest extends BaseTest{
    @Test
    public void WebTablePageTest(){
        pageManager.webTablePage.open();
        pageManager.webTablePage.WebTables();
        pageManager.webTablePage.InputData();
        pageManager.webTablePage.Edit();
}
}
