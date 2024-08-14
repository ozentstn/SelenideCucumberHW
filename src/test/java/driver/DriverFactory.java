package driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.PropertyManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class DriverFactory {

    public static String browser;
    static PropertyManager propertyManager = new PropertyManager();

    public static void initDriver() {
        if (Objects.equals(propertyManager.getProperty("BROWSER"), "REMOTE")) {
            initRemoteDriver();
            return;
        }
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = false;
        Configuration.timeout = 50000;
        Configuration.pageLoadTimeout = 50000;
        Configuration.headless = Objects.equals(propertyManager.getProperty("HEADLESS"), "Y");

        browser = Objects.equals(propertyManager.getProperty("BROWSER"), null) ? "chrome" : propertyManager.getProperty("BROWSER");
    }


    public static void initRemoteDriver() {
        String host = "http://localhost:4444/wd/hub";

        String browserName = "CHROME";

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("browserName", browserName);
        capabilities.setCapability("screenResolution", "1920x1080");


        try {
            RemoteWebDriver driver = new RemoteWebDriver(new URL(host), capabilities);
            setWebDriver(driver);
            String sessionId = driver.getSessionId().toString();
        } catch (MalformedURLException ignored) {
        }
    }

    public static WebDriver currentDriver() {
        return WebDriverRunner.getWebDriver();
    }

    public static void open(String url) {
        Selenide.open(url);
    }

    public static void maximize() {
        currentDriver().manage().window().maximize();
    }


    public static void clearCookies() {
        open(propertyManager.getProperty("APP_URL"));
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }

    public static void close() {
        currentDriver().quit();
    }
}

