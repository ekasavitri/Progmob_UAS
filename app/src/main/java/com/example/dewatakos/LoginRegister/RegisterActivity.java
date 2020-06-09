package com.example.dewatakos.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.astungkarafix.R;

public class RegisterActivity extends AppCompatActivity {

    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setTitle("Dewata Kos");

        register = (Button) findViewById(R.id.register_button);

        //button
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Berhasil Register",Toast.LENGTH_LONG).show();
                Register();
            }
        });

    }
    public void Register(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
