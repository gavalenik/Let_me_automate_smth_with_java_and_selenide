package com.tactics;

import com.tactics.widgetobjects.*;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("tactics.com")
@Feature("Cart")
@DisplayName("Tactics add items to cart")
public class CartTests extends BaseTests {

    @Test
    @DisplayName("Add item to cart and check total price")
    void signIn_EmptyFields() {
        new Menu().openMenu("Snowboard");
        new SnowboardCategories().MenSnowboardsCategory.click();
        new FilterPanel().capitaBrand.click();
        new FilterPanel().neverSummerBrand.click();
        var itemPrice = new FoundItems().firstItemPrice.getText();
        new FoundItems().firstItem.click();
        new ProductCard().firstSize.click();
        new ProductCard().addToCartButton.click();

        Assertions.assertEquals(itemPrice, new Cart().totalAmount.getText(),
                "Item price and total amount is not the same");
    }
}
