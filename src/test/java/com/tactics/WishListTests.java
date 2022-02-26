package com.tactics;

import com.tactics.widgetobjects.FilterPanel;
import com.tactics.widgetobjects.FoundItems;
import com.tactics.widgetobjects.Menu;
import com.tactics.widgetobjects.ProductCard;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static java.lang.Thread.sleep;

@Epic("tactics.com")
@Feature("Wish List")
@DisplayName("Tactics wish list tests")
public class WishListTests extends BaseTests {

    @Test
    @DisplayName("Add item to wish list. Close tooltip")
    void wishList_CloseTooltip() throws InterruptedException {
        new Menu().searchFor("shoes");
        new FilterPanel().setColorRed();
        new FoundItems().loader.shouldNotBe(visible);
        sleep(500);
        new FoundItems().openFirstItemCard();
        new ProductCard().chooseFirstAvailableAttribute();
        new ProductCard().addToWishList();
        new ProductCard().closeTooltip();

        new ProductCard().tooltip.shouldNotBe(visible);
    }
}
