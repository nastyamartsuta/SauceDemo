package tests;

import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void productShouldBeAddedIntoCart() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        productsPage.addToCart("Test.allTheThings() T-Shirt (Red)");
        productsPage.priceProduct("Test.allTheThings() T-Shirt (Red)");
        cartPage.open();
        cartPage.priceProduct("Test.allTheThings() T-Shirt (Red)");

//        TODO VALIDATE NAME AND PRICE

    }
}
