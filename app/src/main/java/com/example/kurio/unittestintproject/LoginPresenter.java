package com.example.kurio.unittestintproject;

import android.content.Context;

public class LoginPresenter {
    Context context;
    LoginView v;
    public LoginPresenter(LoginView v, Context c){
        this.v=v;
        this.context=c;
    }
    public String validate(String userName, String password) {
        if (userName.equals("user") && password.equals("user")){
            v.successLogin();
            return "Login was successful";
        }
        else{
            v.failLogin();
            return "Invalid login!";
        }
    }
}
