package com.example.kurio.unittestintproject;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements LoginView {
    Button btnLogin;
    EditText userName;
    EditText password;
    LoginPresenter presenter;

    public LoginActivity() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new LoginPresenter(this, this);
        btnLogin = findViewById(R.id.btnLogin);
        userName = findViewById(R.id.edtUsername);
        password = findViewById(R.id.edtPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateInput();
            }
        });
    }

    public void validateInput() {
        if (!TextUtils.isEmpty(userName.getText().toString().trim()) &&
                !TextUtils.isEmpty(password.getText().toString().trim())) {
            presenter.validate(userName.getText().toString().trim()
                    , password.getText().toString().trim());
        } else {
            Toast.makeText(this, "Enter All Fields", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void successLogin() {
        Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void failLogin() {
        Toast.makeText(this, "Fail Login", Toast.LENGTH_SHORT).show();
    }

}