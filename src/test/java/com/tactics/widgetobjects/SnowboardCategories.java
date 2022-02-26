package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SnowboardCategories {

    public SelenideElement MenSnowboardsCategory = $("[href='/mens-snowboards']");

    @Step("Go to Men's Snowboard category")
    public void chooseMensSnowboard() {
        MenSnowboardsCategory.scrollTo().click();
    }
}
