package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class LoginTest extends BaseTest {

//    @Parameters({"user", "password"})
//    @Test (retryAnalyzer = Retry.class)
//    public void loginShouldBeCorrect(String user, String password) {
//        loginPage.open();
//        loginPage.login(user, password);
//        boolean isError = loginPage.isErrorDisplayed();
//        assertFalse(isError, "ERROR WAS DISPLAYED");
//    }

    @Test (retryAnalyzer = Retry.class)
    public void loginShouldBeCorrect() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        boolean isError = loginPage.isErrorDisplayed();
        assertFalse(isError, "ERROR WAS DISPLAYED");
    }

    @DataProvider(name = "Login Data")
    public Object[][] getLoginData() {
        return new Object[][]{
                {"", PASSWORD, "Epic sadface: Username is required"},
                {USER, "", "Epic sadface: Password is required"},
                {USER, "dfddfgfg", "Epic sadface: Username and password do not match any user in this service"},
                {"locked_out_user", PASSWORD, "Epic sadface: Sorry, this user has been locked out."},
        };
    }

    @Test(description = "Negative tests for login", dataProvider = "Login Data")
    public void userNameShouldBeRequired(String user, String password, String errorMessage) {
        loginPage.open();
        loginPage.login(user, password);
        String error = loginPage.getError();
        assertEquals(error, errorMessage, "Error message is not correct");
    }
}
//
//    @Test(enabled = false)
//    public void passwordShouldBeRequired() {
//        loginPage.open();
//        loginPage.login(USER, "");
//        String error = loginPage.getError();
//        assertEquals(error, "Epic sadface: Password is required",
//                "Error message is not correct");
//    }
//
//    @Test
//    public void incorrectPassword() {
//        loginPage.open();
//        loginPage.login(USER, "dfddfgfg");
//        String error = loginPage.getError();
//        assertEquals(error, "Epic sadface: Username and password do not match any user in this service",
//                "Error message is not correct");
//    }
//
//    @Test
//    public void lockedPassword() {
//        loginPage.open();
//        loginPage.login("locked_out_user", PASSWORD);
//        String error = loginPage.getError();
//        assertEquals(error, "Epic sadface: Sorry, this user has been locked out.", "Error message is not correct");
//    }
