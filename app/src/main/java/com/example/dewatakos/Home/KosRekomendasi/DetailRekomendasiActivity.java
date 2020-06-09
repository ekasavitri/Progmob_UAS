package com.example.dewatakos.Home.KosRekomendasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dewatakos.Home.BookingForm;
import com.example.astungkarafix.R;

public class DetailRekomendasiActivity extends AppCompatActivity {

    private Button rekbut;
    private TextView drektitle, drekharga, drekdeskripsi;
    private ImageView drekfoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_rekomendasi);
        getSupportActionBar().setTitle("Dewata Kos");

        drektitle = (TextView) findViewById(R.id.drek_judul);
        drekharga = (TextView) findViewById(R.id.drek_harga);
        drekdeskripsi = (TextView) findViewById(R.id.drek_deksripsi);
        drekfoto = (ImageView) findViewById(R.id.drek_foto);
        rekbut = (Button) findViewById(R.id.butrek);

        //button
        rekbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RekForm();
            }
        });

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Harga = intent.getExtras().getString("Harga");
        String Deskripsi = intent.getExtras().getString("Deskripsi");
        int FotoKos = intent.getExtras().getInt("FotoKos");

        drektitle.setText(Title);
        drekharga.setText(Harga);
        drekdeskripsi.setText(Deskripsi);
        drekfoto.setImageResource(FotoKos);
    }

    public void RekForm(){
        Intent intent = new Intent(this, BookingForm.class);
        startActivity(intent);
    }
}
