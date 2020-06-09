package com.example.dewatakos.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.astungkarafix.R;

public class HomeDetailActivity extends AppCompatActivity {

    private Button homebut;
    private TextView dhome_judul, dhome_deskripsi, dhome_harga;
    private ImageView dhome_foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_detail);
        getSupportActionBar().setTitle("Dewata Kos");

        dhome_judul = (TextView) findViewById(R.id.dhome_judul);
        dhome_foto = (ImageView) findViewById(R.id.dhome_foto);
        dhome_deskripsi = (TextView) findViewById(R.id.dhome_deksripsi);
        dhome_harga = (TextView) findViewById(R.id.dhome_harga);
        homebut = (Button) findViewById(R.id.buthome);

        //button
        homebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeForm();
            }
        });

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Harga = intent.getExtras().getString("Harga");
        String Deskripsi = intent.getExtras().getString("Deskripsi");
        int FotoKos = intent.getExtras().getInt("FotoKos");

        dhome_judul.setText(Title);
        dhome_foto.setImageResource(FotoKos);
        dhome_harga.setText(Harga);
        dhome_deskripsi.setText(Deskripsi);
    }

    public void HomeForm(){
        Intent intent = new Intent(this, BookingForm.class);
        startActivity(intent);
    }
}
