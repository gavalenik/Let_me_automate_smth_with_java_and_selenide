package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.Thread.sleep;

public class ProductCard {

    public SelenideElement firstSize = $$(".product-picker-size-label:not(.product-picker-disabled)").get(0);
    public SelenideElement addToCartButton = $(".product-head-add-to-cart-button");
    public SelenideElement viewCartButton = $(".cre-tactic-29-cta > .cre-viewcar-btn");


    @Step("Choose first size")
    public void chooseFirstSize() {
        firstSize.click();
    }

    @Step("Add to cart")
    public void addToCart() throws InterruptedException {
        addToCartButton.click();
        sleep(500);
        if (viewCartButton.isDisplayed()) {
            viewCartButton.click();
        }
    }
}
