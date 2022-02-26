package com.tactics.widgetobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Menu {

    SelenideElement menu = $("#header-category-links");
    SelenideElement searchField = $("#header-desktop-search-input");

    @Step("Open menu {menuName}")
    public void openMenu(String menuName){
        menu.find(byText(menuName)).click();
    }

    @Step("Search for {item}")
    public void searchFor(String item){
        searchField.setValue(item).sendKeys(Keys.ENTER);
    }
}
