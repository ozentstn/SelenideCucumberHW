package tests;

import com.codeborne.selenide.Selenide;
import driver.DriverFactory;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import common.PageManager;

import static driver.DriverFactory.maximize;

public class BaseTest {
    protected PageManager pageManager;
    protected SoftAssert softAssert;

    @BeforeSuite
    public void setUp() {
        pageManager = new PageManager();
        softAssert = new SoftAssert();
    }

    @BeforeTest
    public void openDriver() {
        Selenide.open();
        maximize();
    }

    @AfterTest
    public void clearCookies() {
        DriverFactory.clearCookies();
    }

    @AfterSuite
    public void tearDown() {
        DriverFactory.close();
    }
}
