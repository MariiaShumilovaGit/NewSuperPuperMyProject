package com.it.helpers;

import com.it.pages.LoginPage;
import com.it.users.User;

public class LoginHelper extends LoginPage {
    public  void login(User user){
        log.info(String.format("User login name - %s, password -%s", user.login,user.password));

        login (user.login,user.password);
    }

}
