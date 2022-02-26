package com.tactics;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.open;

public class BaseTests {

    @BeforeEach
    @DisplayName("Allure-Selenide Initialization")
    public void init() {
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true));

        open("https://www.tactics.com/");

//        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true);
//        options.addArguments("--lang=en_US");
//        options.addArguments("--start-maximized");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        Configuration.browserCapabilities = capabilities;
    }

//    @AfterEach
//    public void closeBrowser(WebDriver webDriver) {
//        webDriver.quit();
//    }
}
