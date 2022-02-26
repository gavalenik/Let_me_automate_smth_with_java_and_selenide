package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ForgotPassword {

    public SelenideElement emailField = $("#login-forgot-password-email");
    public SelenideElement buttonSend = $("#login-forgot-password-button");
    public SelenideElement errorMessage = $("#login-forgot-password-errors");
}
