package com.example.dewatakos.Account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.astungkarafix.R;

public class EditAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_account);

        Button button2 = findViewById(R.id.simpanedit);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Berhasil Edit",Toast.LENGTH_LONG).show();
                ProfileEdit();
            }
        });
    }

    public void ProfileEdit(){
        Intent intent = new Intent(this, AccountActivity.class);
        startActivity(intent);
    }
}
