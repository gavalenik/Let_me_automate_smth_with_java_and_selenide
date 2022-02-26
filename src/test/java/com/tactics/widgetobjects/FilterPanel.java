package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class FilterPanel {

    public SelenideElement capitaBrand = $("[href='/capita/mens-snowboards']");
    public SelenideElement neverSummerBrand = $("[href='/never-summer/mens-snowboards']");
    public SelenideElement colorRed = $(".browse-nav-color-red");


    @Step("Choose Capita brand")
    public void chooseCapitaBrand() {
        capitaBrand.scrollTo().click();
    }

    @Step("Choose Never Summer brand")
    public void chooseNSBrand() {
        neverSummerBrand.scrollTo().click();
    }

    @Step("Set red color in filter")
    public void setColorRed() {
        colorRed.scrollTo().click();
    }
}
