package com.example.dewatakos.Home.KosPopuler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dewatakos.Home.BookingForm;
import com.example.astungkarafix.R;

public class DetailPopulerActivity extends AppCompatActivity {

    private Button popbut;
    private TextView dpoptitle, dpopharga, dpopdeskripsi;
    private ImageView dpopimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_populer);
        getSupportActionBar().setTitle("Dewata Kos");

        dpoptitle = (TextView) findViewById(R.id.dpopuler_judul);
        dpopharga = (TextView) findViewById(R.id.dpopuler_harga);
        dpopdeskripsi = (TextView) findViewById(R.id.dpopuler_deksripsi);
        dpopimg = (ImageView) findViewById(R.id.dpopuler_foto);
        popbut = (Button) findViewById(R.id.butpop);

        //button
        popbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FormKos();
            }
        });

        // menerima data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Harga = intent.getExtras().getString("Harga");
        String Deskripsi = intent.getExtras().getString("Deskripsi");
        int FotoKos = intent.getExtras().getInt("FotoKos");

        // setting value
        dpoptitle.setText(Title);
        dpopharga.setText(Harga);
        dpopdeskripsi.setText(Deskripsi);
        dpopimg.setImageResource(FotoKos);
    }

    public void FormKos(){
        Intent intent = new Intent(this, BookingForm.class);
        startActivity(intent);
    }
}
