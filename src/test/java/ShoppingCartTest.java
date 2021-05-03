import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ShoppingCartTest extends BaseTest {

    @Test
    public void addProductToShoppingCart() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();

        boolean message = driver.findElement(By.cssSelector("[class='title']")).isDisplayed();
        Assert.assertTrue(message, "Регистрации не прошла");

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_badge")).click();

        String message2 = driver.findElements(By.className("inventory_item_name")).get(0).getText();
        assertEquals(message2, "Sauce Labs Backpack",
                "Несоответствие имени товара в корзине");

        String message3 = driver.findElements(By.className("inventory_item_price")).get(0).getText();
        assertEquals(message3, "$29.99",
                "Несоответствие стоимости товара в корзине");
    }
}
