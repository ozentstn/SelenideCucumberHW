package pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import static com.codeborne.selenide.Selenide.$;

public class WebTablePage extends BasePage{

    public SelenideElement webtables=$("li:nth-of-type(4)>.text");
    public SelenideElement addRecord=$("#addNewRecordButton");
    public SelenideElement submit=$("#submit");
    public SelenideElement depText=$(".rt-tr-group:nth-child(4) div:nth-of-type(6)");
    public SelenideElement edit=$("#edit-record-4");
    public SelenideElement dep2Text=$(".rt-tr-group:nth-child(4) div:nth-of-type(6)");
    public SelenideElement fName=$("#firstName");
    public SelenideElement lName=$("#lastName");
    public SelenideElement mail=$("#userEmail");
    public SelenideElement age=$("#age");
    public SelenideElement salary=$("#salary");
    public SelenideElement dep=$("#department");

    public WebTablePage(String pageUrl) {
        super(pageUrl);
    }

    public void WebTables(){
        webtables.click();
    }

    public void InputData(){
        addRecord.click();
        //region[Veri girme]
        fName.click();
        fName.sendKeys("Özen");

        lName.click();
        lName.sendKeys("Taştan");

        mail.click();
        mail.sendKeys("ozentastan1@gmail.com");

        age.click();
        age.sendKeys("27");

        salary.click();
        salary.sendKeys("123456789");

        dep.click();
        dep.sendKeys("Meva");

        submit.click();
        //endregion
    }

    public void Edit(){
        edit.click();
        dep.click();
        dep.sendKeys("-Ökc");
        submit.click();
        String showDep2Text=dep2Text.getText();
        String showDepText=depText.getText();
        Assert.assertEquals(showDepText,showDep2Text,"Veri değiştirilmedi");
    }
}

