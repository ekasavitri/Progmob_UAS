package com.example.dewatakos.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dewatakos.Home.HomeActivity;
import com.example.astungkarafix.R;

public class LoginActivity extends AppCompatActivity {

    private Button but_login;
    private Button but_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Dewata Kos");

        but_login = (Button) findViewById(R.id.login_login);
        but_register = (Button) findViewById(R.id.login_register);

        //button
        but_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Berhasil Login",Toast.LENGTH_LONG).show();
                LoginForm();
            }
        });

        but_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterForm();
            }
        });
    }

    public void LoginForm(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void RegisterForm(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
