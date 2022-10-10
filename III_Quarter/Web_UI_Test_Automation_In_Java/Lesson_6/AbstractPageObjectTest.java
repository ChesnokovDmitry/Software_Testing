package org.example.PageFactoryTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public abstract class AbstractPageObjectTest {
    private static WebDriver driver;

    @BeforeClass
    public static void init() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Before
    public void goTo() {
        Assertions.assertDoesNotThrow(() -> driver.navigate().to("https://www.aqua-shop.ru/"), "Page not found");
    }

    @After
    public void close() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
