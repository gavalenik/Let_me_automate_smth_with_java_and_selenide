package com.tactics;

import com.tactics.widgetobjects.ForgotPassword;
import com.tactics.widgetobjects.Header;
import com.tactics.widgetobjects.Login;
import com.tactics.widgetobjects.MyAccount;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;


@Epic("tactics.com")
@Feature("Sign in")
@DisplayName("Tactics sign in tests")
public class SignInTests extends BaseTests {

    @Test
    @DisplayName("Sign in with login and password")
    void signIn() {
        new Header().goToMyAccount();
        new Login().inputEmail("niteti5533@naluzotan.com");
        new Login().inputPassword("Qwerty1!");
        new Login().clickLoginButton();
        new MyAccount().clickLogoutLink();
        new Header().goToMyAccount();

        new Login().loginField.shouldBe(visible);
    }

    @Test
    @DisplayName("Empty Email and password fields")
    void signIn_EmptyFields() {
        new Header().goToMyAccount();
        new Login().clickLoginButton();

        new Login().errorMessage.shouldHave(exactText("Email address is not valid."));
    }

    @Test
    @DisplayName("Password is empty")
    void signIn_EmptyPassword() {
        new Header().goToMyAccount();
        new Login().inputEmail("justForPractice@gmail.com");
        new Login().clickLoginButton();

        new Login().errorMessage
                .shouldBe(visible)
                .shouldHave(exactText("Password is required."));
    }

    @Test
    @DisplayName("Account not found")
    void signIn_AccountNotFound() {
        new Header().goToMyAccount();
        new Login().inputEmail("justForPractice@gmail.com");
        new Login().inputPassword("password1!");
        new Login().clickLoginButton();

        new Login().errorMessage
                .shouldBe(visible)
                .shouldHave(exactText("No account found under this email address."));
    }

    @Test
    @DisplayName("Forgot password")
    void signIn_ForgotPassword() {
        new Header().goToMyAccount();
        new Login().clickForgotPasswordLink();
        new ForgotPassword().inputEmail("niteti5533@naluzotan.com");
        new ForgotPassword().clickButtonSend();

        new ForgotPassword().successfulMessage
                .shouldBe(visible)
                .shouldHave(exactText("A link to reset your Tactics password has been sent to niteti5533@naluzotan.com."));
    }

    @Test
    @DisplayName("Forgot password. Empty email")
    void signIn_ForgotPasswordAndEmptyEmail() {
        new Header().goToMyAccount();
        new Login().clickForgotPasswordLink();
        new ForgotPassword().clickButtonSend();

        new ForgotPassword().errorMessage
                .shouldBe(visible)
                .shouldHave(exactText("You need to enter an email address."));
    }

    @Test
    @DisplayName("Forgot password. Invalid email")
    void signIn_ForgotPasswordAndInvalidEmail() {
        new Header().goToMyAccount();
        new Login().clickForgotPasswordLink();
        new ForgotPassword().inputEmail("123456");
        new ForgotPassword().clickButtonSend();

        new ForgotPassword().errorMessage
                .shouldBe(visible)
                .shouldHave(exactText("You need to enter a valid email address."));
    }
}
