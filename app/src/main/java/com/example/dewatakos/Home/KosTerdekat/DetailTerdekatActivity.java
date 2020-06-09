package com.example.dewatakos.Home.KosTerdekat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dewatakos.Home.BookingForm;
import com.example.astungkarafix.R;

public class DetailTerdekatActivity extends AppCompatActivity {

    private Button dktbut;
    private TextView ddkttitle, ddktharga, ddktdeskripsi;
    private ImageView ddktimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_terdekat);
        getSupportActionBar().setTitle("Dewata Kos");

        ddkttitle = (TextView) findViewById(R.id.ddekat_judul);
        ddktharga = (TextView) findViewById(R.id.ddekat_harga);
        ddktdeskripsi = (TextView) findViewById(R.id.ddekat_deksripsi);
        ddktimg = (ImageView) findViewById(R.id.ddekat_foto);
        dktbut = (Button) findViewById(R.id.butdkt);

        //button
        dktbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DktForm();
            }
        });

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Harga = intent.getExtras().getString("Harga");
        String Deskripsi = intent.getExtras().getString("Deskripsi");
        int FotoKos = intent.getExtras().getInt("FotoKos");

        ddkttitle.setText(Title);
        ddktharga.setText(Harga);
        ddktdeskripsi.setText(Deskripsi);
        ddktimg.setImageResource(FotoKos);
    }
    public void DktForm(){
        Intent intent = new Intent(this, BookingForm.class);
        startActivity(intent);
    }
}
