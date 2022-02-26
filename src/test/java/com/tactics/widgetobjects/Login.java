package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class Login {

    public SelenideElement loginField = $("#login-email");
    public SelenideElement passwordField = $("#login-password");
    public SelenideElement loginButton = $("#login-button");
    public SelenideElement errorMessage = $("#vsummary li");
    public SelenideElement forgotPasswordLink = $("#login-forgot-password-link");

    @Step("Input email")
    public void inputEmail(String email) {
        loginField.setValue(email);
    }

    @Step("Input password")
    public void inputPassword(String password) {
        passwordField.setValue(password);
    }

    @Step("Click button login")
    public void clickLoginButton() {
        loginButton.click();
    }

    @Step("Click forgot password link")
    public void clickForgotPasswordLink() {
        forgotPasswordLink.click();
    }
}
