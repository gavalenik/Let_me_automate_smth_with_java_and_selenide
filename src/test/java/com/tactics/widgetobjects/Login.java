package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Login {

    public SelenideElement loginField = $("#login-email");
    public SelenideElement passwordField = $("#login-password");
    public SelenideElement loginButton = $("#login-button");
    public SelenideElement errorMessage = $("#vsummary li");
    public SelenideElement forgotPasswordLink = $("#login-forgot-password-link");
}
