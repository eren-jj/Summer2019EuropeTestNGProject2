package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchanged {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("sample@example.com");
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit+ "));

    }


}
