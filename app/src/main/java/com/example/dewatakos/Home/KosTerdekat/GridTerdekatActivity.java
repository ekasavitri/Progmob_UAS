package com.example.dewatakos.Home.KosTerdekat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.astungkarafix.R;

import java.util.ArrayList;
import java.util.List;

public class GridTerdekatActivity extends AppCompatActivity {

    List<GridTerdekat> tigaKos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_terdekat);
        getSupportActionBar().setTitle("Dewata Kos");

        tigaKos = new ArrayList<>();
        tigaKos.add(new GridTerdekat("Taman Griya","Harga Sewa: Rp 950.000/bulan","Alamat Kost: Jln. Bali Cliff, Ungasan, Kec. Kuta Selatan - Badung \nNomor Telepon: 081212069203 \nTempat Kost Untuk: Pria \nUkuran Kamar: 2×3 \\nJumlah Kamar: 1 \nFasilitas: AC, lemari, kasur+sprei, Parkiran mobil/motor, dispenser, tempat cuci, Parkir Mobil, Parkir Motor \nAkses Lokasi: Di Google saja Syailendra kost / Jl. Rawamangun muka IV no 12 \nE-mail: renoverdinan@gmail.com",R.drawable.kos1));
        tigaKos.add(new GridTerdekat("Bunda Homestay","Rp. 1.200.000","Alamat Kost: Jln. I Gusti Ngurah Rai, Nusa Dua, Kec. Kuta Selatan \nNomor Telepon: 081212069203 \nTempat Kost Untuk: Pria \nUkuran Kamar: 2×3 \\nJumlah Kamar: 1 \nFasilitas: AC, lemari, kasur+sprei, Parkiran mobil/motor, dispenser, tempat cuci, Parkir Mobil, Parkir Motor \nAkses Lokasi: Di Google saja Syailendra kost / Jl. Rawamangun muka IV no 12 \nE-mail: renoverdinan@gmail.com",R.drawable.kos2));
        tigaKos.add(new GridTerdekat("Sumber Rejeki Kost 28","Harga Sewa: Rp 950.000/bulan","Alamat Kost: Jln. Wanagiri Jimbaran, Kuta Selatan - Badung \nNomor Telepon: 081212069203 \nTempat Kost Untuk: Pria \nUkuran Kamar: 2×3 \\nJumlah Kamar: 1 \nFasilitas: AC, lemari, kasur+sprei, Parkiran mobil/motor, dispenser, tempat cuci, Parkir Mobil, Parkir Motor \nAkses Lokasi: Di Google saja Syailendra kost / Jl. Rawamangun muka IV no 12 \nE-mail: renoverdinan@gmail.com",R.drawable.kos3));
        tigaKos.add(new GridTerdekat("Palm Residence Rawasari","Rp. 1.700.000","Alamat Kost: Jl. Bali Cliff Resort Ungasan, Kec. Kuta Selatan - Badung \nNomor Telepon: 081212069203 \nTempat Kost Untuk: Pria \nUkuran Kamar: 2×3 \\nJumlah Kamar: 1 \nFasilitas: AC, lemari, kasur+sprei, Parkiran mobil/motor, dispenser, tempat cuci, Parkir Mobil, Parkir Motor \nAkses Lokasi: Di Google saja Syailendra kost / Jl. Rawamangun muka IV no 12 \nE-mail: renoverdinan@gmail.com",R.drawable.kos4));
        tigaKos.add(new GridTerdekat("Grand Pondok","Rp. 1.300.000","Alamat Kost: Jln. Praja Sentral, Tanjung Benoa, Kec. Kuta Selatan - Badung \nNomor Telepon: 081212069203 \nTempat Kost Untuk: Pria \nUkuran Kamar: 2×3 \\nJumlah Kamar: 1 \nFasilitas: AC, lemari, kasur+sprei, Parkiran mobil/motor, dispenser, tempat cuci, Parkir Mobil, Parkir Motor \nAkses Lokasi: Di Google saja Syailendra kost / Jl. Rawamangun muka IV no 12 \nE-mail: renoverdinan@gmail.com",R.drawable.kos5));
        tigaKos.add(new GridTerdekat("Griya Amartha","Harga Sewa: Rp 950.000/bulan ","Alamat Kost: Jln. Raya Uluwatu, Pecatu, Desa Pecatu Kec. Kuta Selatan, Badung \nTempat Kost Untuk: Pria \nUkuran Kamar: 2×3 \\nJumlah Kamar: 1 \nFasilitas: AC, lemari, kasur+sprei, Parkiran mobil/motor, dispenser, tempat cuci, Parkir Mobil, Parkir Motor \nAkses Lokasi: Di Google saja Syailendra kost / Jl. Rawamangun muka IV no 12 \nE-mail: renoverdinan@gmail.com",R.drawable.kos6));
        tigaKos.add(new GridTerdekat("Jenny Kost","Rp. 950.000","Alamat Kost: Jln. Bukit Permai Jimbaran, Kuta Selatan- Badung \nNomor Telepon: 081212069203 \nTempat Kost Untuk: Pria \nUkuran Kamar: 2×3 \\nJumlah Kamar: 1 \nFasilitas: AC, lemari, kasur+sprei, Parkiran mobil/motor, dispenser, tempat cuci, Parkir Mobil, Parkir Motor \nAkses Lokasi: Di Google saja Syailendra kost / Jl. Rawamangun muka IV no 12 \nE-mail: renoverdinan@gmail.com",R.drawable.kos7));
        tigaKos.add(new GridTerdekat("Asri Home","Rp. 800.000","Alamat Kost: Jl. Kembar Kampus Udayana Pondok Taman Nusantara 1 Jimbaran, Kuta Selatan - Badung \nNomor Telepon: 081212069203 \nTempat Kost Untuk: Pria \nUkuran Kamar: 2×3 \\nJumlah Kamar: 1 \nFasilitas: AC, lemari, kasur+sprei, Parkiran mobil/motor, dispenser, tempat cuci, Parkir Mobil, Parkir Motor \nAkses Lokasi: Di Google saja Syailendra kost / Jl. Rawamangun muka IV no 12 \nE-mail: renoverdinan@gmail.com",R.drawable.kosan1));
        tigaKos.add(new GridTerdekat("Bumi Asri","Rp. 1.200.000","Alamat Kost: Jln. Raya Kampus Udayana No. 98, Bukit JImbaran, Badung \nNomor Telepon: 081212069203 \nTempat Kost Untuk: Pria \nUkuran Kamar: 2×3 \\nJumlah Kamar: 1 \nFasilitas: AC, lemari, kasur+sprei, Parkiran mobil/motor, dispenser, tempat cuci, Parkir Mobil, Parkir Motor \nAkses Lokasi: Di Google saja Syailendra kost / Jl. Rawamangun muka IV no 12 \nE-mail: renoverdinan@gmail.com",R.drawable.kosan2));
        tigaKos.add(new GridTerdekat("Sophilia House","Rp. 1.100.000","Alamat Kost: Jln. Nuansa Utama, Jimbaran, Kuta, Badung \nNomor Telepon: 081212069203 \nTempat Kost Untuk: Pria \nUkuran Kamar: 2×3 \\nJumlah Kamar: 1 \nFasilitas: AC, lemari, kasur+sprei, Parkiran mobil/motor, dispenser, tempat cuci, Parkir Mobil, Parkir Motor \nAkses Lokasi: Di Google saja Syailendra kost / Jl. Rawamangun muka IV no 12 \nE-mail: renoverdinan@gmail.com",R.drawable.kosan8));

        RecyclerView rvdeket = (RecyclerView) findViewById(R.id.recyclerview_iddekat);
        GridTerdekatAdapter adaptermy = new GridTerdekatAdapter(this,tigaKos);
        rvdeket.setLayoutManager(new GridLayoutManager(this,2));
        rvdeket.setAdapter(adaptermy);
    }
}
