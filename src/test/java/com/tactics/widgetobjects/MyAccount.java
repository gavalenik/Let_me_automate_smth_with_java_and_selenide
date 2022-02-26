package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MyAccount {

    public SelenideElement logout = $("[href='/logout']");

    @Step("Click logout link")
    public void clickLogoutLink() {
        logout.click();
    }
}
