package com.example.dewatakos.Account;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dewatakos.Home.HomeActivity;
import com.example.astungkarafix.R;
import com.example.dewatakos.Wishlist.WishlistActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AccountActivity extends AppCompatActivity {

    private Button editbut;
    TextView nameuser, walletuser, histori, saldo, points, mainmenus,
            pagetitle, pagetitle2, pagetitle3, pagesubtitle, pagesubtitle2, pagesubtitle3;

    ImageView imageView, imageView2, imageView3, imageView_p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        getSupportActionBar().setTitle("Dewata Kos");

        //button
        editbut = (Button) findViewById(R.id.but_editprof);
        editbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProfileEdit();
            }
        });

        //layout
        nameuser = findViewById(R.id.nameuser);
        walletuser = findViewById(R.id.walletuser);

        imageView_p = findViewById(R.id.imageView_p);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);

        histori = findViewById(R.id.histori);
        saldo = findViewById(R.id.saldo);
        points = findViewById(R.id.points);
        mainmenus = findViewById(R.id.mainmenus);

        pagetitle = findViewById(R.id.pagetitle);
        pagesubtitle = findViewById(R.id.pagesubtitle);
        pagetitle2 = findViewById(R.id.pagetitle2);
        pagesubtitle2 = findViewById(R.id.pagesubtitle2);
        pagetitle3 = findViewById(R.id.pagetitle3);
        pagesubtitle3 = findViewById(R.id.pagesubtitle3);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_account);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_wishlist:
                        startActivity(new Intent(getApplicationContext(), WishlistActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_account:
                        return true;
                }
                return false;
            }
        });
    }
    public void ProfileEdit(){
        Intent intent = new Intent(this, EditAccount.class);
        startActivity(intent);
    }
}
