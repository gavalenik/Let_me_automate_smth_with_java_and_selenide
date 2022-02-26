package com.tactics;

import com.tactics.widgetobjects.*;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static java.lang.Thread.sleep;

@Epic("tactics.com")
@Feature("Cart")
@DisplayName("Tactics add items to cart")
public class CartTests extends BaseTests {

    @Test
    @DisplayName("Add item to cart and check total price")
    void addSnowboardToCart_CheckTotalAmount() throws InterruptedException {
        new Menu().openMenu("Snowboard");
        new SnowboardCategories().chooseMensSnowboard();
        new FilterPanel().chooseCapitaBrand();
        new FilterPanel().chooseNSBrand();
        new FoundItems().loader.shouldNotBe(visible);
        sleep(500);
        var itemPrice = new FoundItems().getFirstItemPrice();
        new FoundItems().openFirstItemCard();
        new ProductCard().chooseFirstAvailableAttribute();
        new ProductCard().addToCart();

        new Cart().totalAmount.shouldHave(exactText(itemPrice));
    }
}
