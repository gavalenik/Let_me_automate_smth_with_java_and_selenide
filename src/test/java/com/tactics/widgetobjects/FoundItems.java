package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.Thread.sleep;

public class FoundItems {

    public SelenideElement firstItem = $$("#browse-grid .browse-grid-item").get(0);
    public SelenideElement loader = $("#browse_loader");

    @Step("Open card of first item")
    public void openFirstItemCard() throws InterruptedException {
        loader.shouldNotBe(visible);
        sleep(500);
        firstItem.click();
    }
}
