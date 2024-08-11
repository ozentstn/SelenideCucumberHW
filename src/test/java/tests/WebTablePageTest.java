package tests;

import org.testng.annotations.Test;

public class WebTablePageTest extends BaseTest{
    @Test
    public void WebTablePageTest(){
        pageManager.webTablePage.AddRecord();
        pageManager.webTablePage.InputData();
        pageManager.webTablePage.Edit();
}
}
