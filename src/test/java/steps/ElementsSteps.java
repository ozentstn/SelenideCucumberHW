package steps;
import common.PageManager;
import common.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseTest;
import static org.assertj.core.api.Assertions.assertThat;

public class ElementsSteps extends BaseTest {
    PageManager pageManager=new PageManager();
    ScenarioContext scenarioContext = new ScenarioContext();

    @Given("Elements page opened")
    public void openElementsPage(){
        pageManager.elementsPage.open();
    }
    @When("Click on the button named buttons")
    public void clickButtons(){
        pageManager.elementsPage.buttons.click();
    }
    @When("Click on the button named clickMe")
    public void clickClickMe(){
        pageManager.elementsPage.clickMe.click();
    }
    @Then("Displaying the message on the screen")
    public void showMessageClickMe(){
        assertThat(pageManager.elementsPage.showMessage.getText()).contains("You have done a dynamic click");
    }
}
