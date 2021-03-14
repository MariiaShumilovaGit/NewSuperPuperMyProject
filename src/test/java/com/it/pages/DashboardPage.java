package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span [@class='sn_menu_title']")
    private WebElement lbMail;


    public String getMailUser() {
        return lbMail.getText();
    }

}
