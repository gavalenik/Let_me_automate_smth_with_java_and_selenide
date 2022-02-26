package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Header {

    public SelenideElement logo = $(".header-logo");
    public SelenideElement myAccount = $$(".header-util-item").get(1);

}
