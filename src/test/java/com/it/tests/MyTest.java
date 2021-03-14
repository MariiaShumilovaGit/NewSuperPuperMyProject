package com.it.tests;

import com.it.common.Constants;
import com.it.pages.DashboardPage;
import com.it.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static com.it.common.Constants.BASE_URL;

public class MyTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        app.login.login(validUser);
        Thread.sleep(2000);
        Assert.assertEquals(app.dashboard.getMailUser(), validUser.email);
        app.common.takeScreenShot();
    }
}

