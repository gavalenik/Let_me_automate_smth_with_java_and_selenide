package com.tactics;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.open;

public class BaseTests {

    @BeforeEach
    @DisplayName("Allure-Selenide Initialization")
    public void init() {
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true));

        Configuration.browserSize = "1920x1080";
        // Configuration.pageLoadTimeout = 40000;

        open("https://www.tactics.com/");
    }

    @AfterEach
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }

    @Attachment(value = "Page", fileExtension = "png")
    public byte[] doPageScreenshot() throws IOException {
        return Files.readAllBytes(Objects.requireNonNull(Screenshots.takeScreenShotAsFile()).toPath());
    }
}
