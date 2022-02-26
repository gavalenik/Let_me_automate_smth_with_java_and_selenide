package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FilterPanel {

    public SelenideElement capitaBrand = $("[href='/capita/mens-snowboards']");
    public SelenideElement neverSummerBrand = $("[href='/never-summer/mens-snowboards']");
}
