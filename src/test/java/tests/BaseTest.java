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

    @BeforeClass
    public void setUp() {
        pageManager = new PageManager();
        softAssert = new SoftAssert();
    }

    @BeforeMethod
    public void openDriver() {
        Selenide.open();
        maximize();
    }

    @AfterMethod
    public void clearCookies() {
        DriverFactory.clearCookies();
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.close();
    }
}
