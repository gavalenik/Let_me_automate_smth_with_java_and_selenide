package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductCard {

    public SelenideElement firstAvailableAttribute = $$(".product-picker-size-label:not(.product-picker-disabled)").get(0);
    public SelenideElement addToCartButton = $(".product-head-add-to-cart-button");
    public SelenideElement itemPrice = $(".product-price-container");
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
    public void addToCart() {
        addToCartButton.click();
        if (new Cart().totalAmount.isDisplayed()) {
            new Cart().totalAmount.sendKeys(Keys.ESCAPE);
        }
    }

    @Step("Get item price")
    public String getItemPrice() {
        return itemPrice.getText();
    }
}
