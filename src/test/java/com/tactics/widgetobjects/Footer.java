package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class Footer {

    public SelenideElement subscriptionField = $("#footer-social-email-input");
    public SelenideElement subscriptionMessageSuccess = $(".footer-social-email-popup-container-success");
    public SelenideElement subscriptionMessageErrors = $(".footer-social-email-popup-container-error");

    @Step("Input email")
    public void inputEmailToSubscribe(String email) {
        subscriptionField
                .setValue(email)
                .sendKeys(Keys.ENTER);
    }
}
