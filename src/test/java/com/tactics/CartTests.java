package com.tactics;

import com.tactics.widgetobjects.*;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;

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
        new FoundItems().openFirstItemCard();
        new ProductCard().chooseFirstAvailableAttribute();
        var itemPrice = new ProductCard().getItemPrice();
        new ProductCard().addToCart();
        new Header().goToCart();

        new Cart().totalAmount.shouldBe(visible)
                .shouldHave(exactText(itemPrice));
    }
}
