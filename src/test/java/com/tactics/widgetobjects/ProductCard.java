package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductCard {

    public SelenideElement firstSize = $$(".product-picker-size-label:not(.product-picker-disabled)").get(0);
    public SelenideElement addToCartButton = $(".product-head-add-to-cart-button");
}
