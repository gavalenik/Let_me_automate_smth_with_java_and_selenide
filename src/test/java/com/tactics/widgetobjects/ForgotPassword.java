package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class ForgotPassword {

    public SelenideElement emailField = $("#login-forgot-password-email");
    public SelenideElement buttonSend = $("#login-forgot-password-button");
    public SelenideElement errorMessage = $("#login-forgot-password-errors");
    public SelenideElement successfulMessage = $("#login-forgot-password-contents");
    public SelenideElement loader = $("#loader");

    @Step("Click button send")
    public void clickButtonSend() {
        buttonSend.click();
        loader.should(disappear);
        sleep(500);
    }

    @Step("Input email")
    public void inputEmail(String email) {
        emailField.setValue(email);
    }
}
