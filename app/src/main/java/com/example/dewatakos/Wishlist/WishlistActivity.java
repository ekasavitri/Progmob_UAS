package com.example.dewatakos.Wishlist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.dewatakos.Account.AccountActivity;
import com.example.dewatakos.Home.HomeActivity;
import com.example.astungkarafix.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class WishlistActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private  RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);
        getSupportActionBar().setTitle("Dewata Kos");

        //recyclerview
        ArrayList<WishlistKos> wKos = new ArrayList<>();
        wKos.add(new WishlistKos("Little Home","Rp 800.000/bulan",R.drawable.kosan15));
        wKos.add(new WishlistKos("KD Residence","Rp 900.000/bulan",R.drawable.kosan2));
        wKos.add(new WishlistKos("Lafina Kos","Rp 1.200.000/bulan",R.drawable.kos1));
        wKos.add(new WishlistKos("Shafia 56","Rp 1.300.000/bulan",R.drawable.kos3));
        wKos.add(new WishlistKos("Kos BRRH","Rp 1.000.000/bulan",R.drawable.kos5));
        wKos.add(new WishlistKos("Sunter Agung","Rp 700.000/bulan",R.drawable.kos7));

        recyclerView = findViewById(R.id.wishlist_recyclerview);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new WishlistAdapter(wKos);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        // bottom nav bar
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_wishlist);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_wishlist:
                        return true;
                    case R.id.nav_account:
                        startActivity(new Intent(getApplicationContext(), AccountActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
