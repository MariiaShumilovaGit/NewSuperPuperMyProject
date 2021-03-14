package com.it.pages;

import com.it.driver.DriverFactory;
import com.it.driver.MyDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;

import static com.it.common.Constants.BASE_URL;

public abstract class BasePage {
    protected Logger log = Logger.getLogger(this.getClass().getCanonicalName());
    protected static MyDriver driver= MyDriver.getMyDriver();

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
