package pages;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage extends BasePage {
    public SelenideElement buttons = $("li:nth-of-type(5)>.text");
    public SelenideElement clickMe=$("div.col-md-6 div:nth-of-type(3) >button");
    public SelenideElement showMessage=$("#dynamicClickMessage");

    public ElementsPage (String pageUrl){
        super(pageUrl);
    }

    public void clickButtons(){
        buttons.click();
        clickMe.click();
    }

    public void showMessage(){
        Assert.assertTrue(showMessage.isDisplayed());
        Assert.assertEquals(showMessage.getText(),"You have done a dynamic click");
    }
}
