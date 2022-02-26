package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Menu {

    SelenideElement menu = $("#header-category-links");

    @Step("Open menu {menuName}")
    public void openMenu(String menuName){
        menu.find(byText(menuName)).click();
    }
}
