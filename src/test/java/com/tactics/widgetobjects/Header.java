package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class Header {

    public SelenideElement myAccount = $("[href='/account']");

    @Step("Click on link My Account")
    public void goToMyAccount() {
        myAccount.click();
    }
}
