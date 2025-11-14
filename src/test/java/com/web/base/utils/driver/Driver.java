package com.web.base.utils.driver;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    public static WebDriver webDriver;

    @BeforeScenario
    public void setup() {
        if (webDriver == null) {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");

            webDriver = new ChromeDriver(options);
            System.out.println("✅ Browser başlatıldı");
        }
    }

    @AfterScenario
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
            System.out.println("🔴 Browser kapatıldı");
        }
    }
}