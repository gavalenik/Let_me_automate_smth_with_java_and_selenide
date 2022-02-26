package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class FoundItems {

    public SelenideElement firstItem = $$("#browse-grid .browse-grid-item").get(0);
    public SelenideElement firstItemPrice = firstItem.$(".browse-grid-item-price");
}
