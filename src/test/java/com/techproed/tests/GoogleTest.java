package com.techproed.tests;

import com.techproed.pages.GooglePage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends TestBase {

    @Test
    public void aramaTesti() {
        driver.get("http://google.com");

        GooglePage googlePage = new GooglePage(driver);

        googlePage.aramaKutusu.sendKeys("Selamlar..");

    }
}