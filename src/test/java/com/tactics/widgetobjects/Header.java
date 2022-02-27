package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

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
        cart.sendKeys(Keys.ESCAPE);
    }
}
