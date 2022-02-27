package com.tactics;

import com.tactics.widgetobjects.Footer;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;


@Epic("tactics.com")
@Feature("Email subscription")
@DisplayName("Tactics subscription for deals")
public class EmailSubscriptionTests extends BaseTests {

    @Test
    @DisplayName("Subscribe for deals")
    void subscribe() {
        new Footer().inputEmailToSubscribe("justForTest@test.ww");

        new Footer().subscriptionMessageSuccess
                .shouldBe(visible)
                .shouldHave(text("Success! You’ve been signed up."));
    }

    @Test
    @DisplayName("Subscribe for deals. Wrong email format")
    void subscribe_WrongEmailFormat() {
        new Footer().inputEmailToSubscribe("123456");

        new Footer().subscriptionMessageErrors
                .shouldBe(visible)
                .shouldHave(text("You didn't enter in a valid email address. Please try again."));
    }
}
