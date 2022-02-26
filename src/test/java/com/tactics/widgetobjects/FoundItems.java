package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class FoundItems {

    public SelenideElement firstItem = $$("#browse-grid .browse-grid-item").get(0);
    public SelenideElement firstItemPrice = firstItem.$(".browse-grid-item-price");
    public SelenideElement loader = $("#browse_loader");

    @Step("Get item price")
    public String getFirstItemPrice() {
        sleep(500);
        return firstItemPrice.getText();
    }

    @Step("Open card of first item")
    public void openFirstItemCard() {
        firstItem.click();
    }
}
