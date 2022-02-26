package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.Thread.sleep;

public class ProductCard {

    public SelenideElement firstAvailableAttribute = $$(".product-picker-size-label:not(.product-picker-disabled)").get(0);
    public SelenideElement addToCartButton = $(".product-head-add-to-cart-button");
    public SelenideElement viewCartButton = $(".cre-tactic-29-cta > .cre-viewcar-btn");
    public SelenideElement addToWishListButton = $("#product-add-to-wishlist-button");
    public SelenideElement tooltip = $("#tooltip");
    public SelenideElement tooltipCloseButton = $(".tooltip-close-icon");


    @Step("Choose first size")
    public void chooseFirstAvailableAttribute() {
        firstAvailableAttribute.click();
    }

    @Step("Add to wish list")
    public void addToWishList() {
        addToWishListButton.click();
    }

    @Step("Close create account tooltip")
    public void closeTooltip() {
        tooltipCloseButton.click();
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
