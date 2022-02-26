package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class FilterPanel {

    public SelenideElement capitaBrand = $("[href='/capita/mens-snowboards']");
    public SelenideElement neverSummerBrand = $("[href='/never-summer/mens-snowboards']");

    @Step("Choose Capita brand")
    public void chooseCapitaBrand() {
        capitaBrand.click();
    }

    @Step("Choose Never Summer brand")
    public void chooseNSBrand() {
        neverSummerBrand.click();
    }
}
