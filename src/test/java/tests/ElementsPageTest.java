package tests;


import org.testng.annotations.Test;

public class ElementsPageTest extends BaseTest{

    @Test
    public void click(){
        pageManager.elementsPage.open();
        pageManager.elementsPage.clickButtons();
        pageManager.elementsPage.showMessage();
    }
}
