package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void userNameShouldBeRequired() {
        loginPage.open();
        loginPage.login("", PASSWORD);
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Username is required", "Error message is not correct");
    }

    @Test
    public void passwordShouldBeRequired() {
        loginPage.open();
        loginPage.login(USER, "");
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Password is required", "Error message is not correct");
    }

    @Test
    public void incorrectPassword() {
        loginPage.open();
        loginPage.login(USER, "dfddfgfg");
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Username and password do not match any user in this service", "Error message is not correct");
    }

    @Test
    public void lockedPassword() {
        loginPage.open();
        loginPage.login("locked_out_user", PASSWORD);
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Sorry, this user has been locked out.", "Error message is not correct");
    }
}
