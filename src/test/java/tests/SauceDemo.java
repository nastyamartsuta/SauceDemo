package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SauceDemo extends BaseTest {
    @Test
    public void locators () {

        driver.get("https://www.saucedemo.com/");

//        driver.findElements(By.tagName("input")).get(0).getText();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();

//        СТРАНИЦА ПОСЛЕ РЕГИСТРАЦИИ
//        driver.findElement(By.linkText("Twitter"));
//        cssSelector:
//        .class
        driver.findElements(By.cssSelector("[class='btn btn_primary btn_small btn_inventory']"));
//        #id
        driver.findElement(By.cssSelector("[id='add-to-cart-sauce-labs-backpack']"));
//        tagname
        driver.findElement(By.cssSelector("button"));
//        tagname.class
        driver.findElement(By.cssSelector("button.btn_inventory"));
//        [attribute*=value]	a[href*="w3schools"]
        driver.findElement(By.cssSelector("[href='#']"));

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_badge")).click();

//        xpath
//        driver.findElement(By.xpath("//*[@id='item_4_title_link'']/div"));
//        driver.findElement(By.xpath("//*DESCRIPTION"));

    }
}
