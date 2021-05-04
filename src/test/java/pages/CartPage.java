package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    String priceProductButton ="//*[contains(text(), '%s')]/ancestor::*[@class='inventory_item']//inventory_item_price";

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.saucedemo.com/cart.html");
    }

    public void priceProduct (String name) {
        driver.findElement(By.xpath(String.format(priceProductButton, name))).getText();
    }


}
