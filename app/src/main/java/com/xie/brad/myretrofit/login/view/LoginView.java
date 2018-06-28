package com.xie.brad.myretrofit.login.view;

import com.xie.brad.myretrofit.login.model.LoginModel;

/**
 */

public interface LoginView {

    void showMessage(String message);

    void LoginSuccess(LoginModel loginModelImpl);
}
