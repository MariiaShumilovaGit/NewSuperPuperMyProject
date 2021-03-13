package com.it.tests;

import com.it.App;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    protected User validUser = UserFactory.getValidUser();
    protected App app=new App();

    @AfterSuite
    public  void afterSuite() {
        app.common.stopApp();
    }
}
