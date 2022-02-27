package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Header {

    public SelenideElement myAccount = $("[href='/account']");
    public SelenideElement cart = $("[class*='header-util'] [href='/cart']");

    @Step("Click on link My Account")
    public void goToMyAccount() {
        myAccount.click();
    }

    @Step("Click on Cart (header)")
    public void goToCart() {
        cart.click();
    }
}
