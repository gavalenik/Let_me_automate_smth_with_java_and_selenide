package com.tactics;

import com.tactics.widgetobjects.ForgotPassword;
import com.tactics.widgetobjects.Header;
import com.tactics.widgetobjects.Login;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;

@Epic("tactics.com")
@Feature("Sign in")
@DisplayName("Tactics sign in tests")
public class SignInTests extends BaseTests {

    @Test
    @DisplayName("Empty Email and password fields")
    void signIn_EmptyFields() {
        new Header().logo.shouldBe(visible);
        new Header().myAccount.click();
        new Login().loginButton.click();

        Assertions.assertEquals("Email address is not valid.", new Login().errorMessage.getText(),
                "Wrong error message");
    }

    @Test
    @DisplayName("Password is empty")
    void signIn_EmptyPassword() {
        new Header().myAccount.click();
        new Login().loginField.setValue("justForPractice@gmail.com");
        //new Login().passwordFieldLocator.setValue("");
        new Login().loginButton.click();

        Assertions.assertEquals("Password is required.", new Login().errorMessage.getText(),
                "Wrong error message");
    }

    @Test
    @DisplayName("Account not found")
    void signIn_AccountNotFound() {
        new Header().myAccount.click();
        new Login().loginField.setValue("justForPractice@gmail.com");
        new Login().passwordField.setValue("password1!");
        new Login().loginButton.click();

        Assertions.assertEquals("No account found under this email address.",
                new Login().errorMessage.getText(), "Wrong error message");
    }

    @Test
    @DisplayName("Forgot password. Empty email")
    void signIn_ForgotPasswordAndEmptyEmail() {
        new Header().myAccount.click();
        new Login().forgotPasswordLink.click();
        new ForgotPassword().buttonSend.click();

        Assertions.assertEquals("You need to enter an email address.",
                new ForgotPassword().errorMessage.getText(), "Wrong error message");
    }

    @Test
    @DisplayName("Forgot password. Invalid email")
    void signIn_ForgotPasswordAndInvalidEmail() {
        new Header().myAccount.click();
        new Login().forgotPasswordLink.click();
        new ForgotPassword().emailField.setValue("123456");
        new ForgotPassword().buttonSend.click();

        Assertions.assertEquals("You need to enter a valid email address.",
                new ForgotPassword().errorMessage.getText(), "Wrong error message");
    }
}
