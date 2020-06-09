package com.example.dewatakos.Home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.dewatakos.Account.AccountActivity;
import com.example.dewatakos.Home.KosPopuler.GridPopulerActivity;
import com.example.dewatakos.Home.KosRekomendasi.GridRekomendasiActivity;
import com.example.dewatakos.Home.KosTerdekat.GridTerdekatActivity;
import com.example.astungkarafix.R;
import com.example.dewatakos.Wishlist.WishlistActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private Button button, button1, button2;
    private RecyclerView kosgrid, kosrekomen, kosterdekat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Dewata Kos");

        button = (Button) findViewById(R.id.button1);
        button1 = (Button) findViewById(R.id.button2);
        button2 = (Button) findViewById(R.id.button3);
        kosgrid = findViewById(R.id.grid1);
        kosrekomen = findViewById(R.id.grid2);
        kosterdekat = findViewById(R.id.grid3);

        //button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopulerGrid();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RekomendasiGrid();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TerdekatKos();
            }
        });



        // grid data kos populer
        List<GridKos> satuKos = new ArrayList<>();
        satuKos.add(new GridKos("Welive Coliving Pangeran Jimbaran",R.drawable.pangeran, "Alamat Kost : Jalan Pangeran Jayakarta 14 No 23, Kecamatan Kuta, Kelurahan Mangga Dua Jimbaran , Badung - Bali 10730 \nNomor Telepon : 08111949406, 08111949406 \nHarga Sewa : Rp 2,000,000 - Deposit 1 juta \nTempat Kost Untuk : Pria, wanita, pasutri, karyawan, karyawati \nUkuran Kamar : Deluxe 4,3m x 3m, Deluxe+ 4,3m x 3,5m, Exclusive 4,3m x 4,3m \nJumlah Kamar : 25 \nFasilitas : lobby, spring bed full set, nakas, TV 32inc, bantal, lemari, meja & kursi belajar, rak sepatu, keset kamar mandi, wifi 100mbps unlimited, water heater, laundry 2stel / hari, cctv 24 jam, parkir motor, kamar mandi dalam, wastafel \nE-mail : welive.coliving@gmail.com", "800000"));
        satuKos.add(new GridKos("Welive Coliving Sunter Nusa Dua",R.drawable.sunter, "Alamat Kost: Jalan Papanggo 1 Gg Mangga no. 11, RT 10/2, Kelurahan Papanggo, Kecamatan Nusa Dua, Badung – Bali \nNomor Telepon: 08111949406 \nHarga Sewa: Rp 1,500,000 \nTempat Kost Untuk: Pria, Wanita, Pasutri, karyawan, karyawati. \nUkuran Kamar: 3mx4m \nJumlah Kamar: 51 \nFasilitas: Spring Bed Full set, 1 set Bantal & Guling, Lemari disetiap kamar, Meja & Kursi Belajar, Rak sepatu, Keset kamar mandi, Free Wifi unlimited, Water heater, Laundry 2stel / Hari, Kitchen Set, Alat masak lengkap( mirkowave,panci dll),  air minum Free, Cctv 24 jam, Parkir motor gratis, Kamar Mandi dalam, Water Heater, Jendela setiap kamar, Wifi 150mbps \nJenis Kamar :Standard (9m) 1,5jt, Deluxe (12m) 2jt, Exclusive(20m) 2,5jt \nE-mail: welive.coliving@gmail.com", "900000"));
        satuKos.add(new GridKos("Ngurah Rai Transit Kost",R.drawable.ngurahrai, "Alamat Kost: Jl. Adisucipto Km. 2.5 Kel.Tuban, Kec. Kuta, Badung \nNomor Telepon: 085213880707 \nHarga Sewa: Mingguan Rp 750.000, Bulanan Rp 2.000.000 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 24 m2 \nJumlah Kamar: 10 \nFasilitas: Tempat tidur, TV, wardrobe, hangers, Free Wi-Fi, kamar mandi di dalam, shower air panas, Parkir Mobil, Parkir Motor. \nAkses Lokasi Dekat Bandara dan menyatu dengan Ngurah Rai Transit Kost \nInfo Tambahan: Tempat paling nyaman buat orang yang bekerja di sekitar Bandara Soekarno-Hatta \nE-mail: cengkarengtransithotel@gmail.com", "1000000"));
        satuKos.add(new GridKos("Kos Joyful",R.drawable.joyful, "Alamat Kost: Jl. Kran V no.21 Rt.10/Rw.05, Gunung Sahari Selatan, Kec Kuta Selatan, Badung, Bali \nNomor Telepon: 089629041191, 08567042416 \nHarga Sewa: Rp. 850.000 – Rp. 1.200.000 \nTempat Kost Untuk: Pria/wanita/suami istri, masih pacaran tidak bisa \nUkuran Kamar: 2×2 sd 2,5×3,5 m2 \nJumlah Kamar: 10 \nFasilitas: WIFI, AC, springbed set, meja, lemari, lantal, Parkir motor, CCTV, jemuran, kamar mandi, Dapur.Parkir Motor. \nE-mail: hirman.lim@gmail.com", "1500000"));

        HomeAdapter homeAdapter = new HomeAdapter(this,satuKos);
        kosgrid.setAdapter(homeAdapter);
        kosgrid.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

        // grid data kos rekomendasi
        List<GridKos> duaKos = new ArrayList<>();
        duaKos.add(new GridKos("Koze Anarta H2/9",R.drawable.koze, "Alamat Kost: Koze Kost Anarta H2/9, Anarta House Vanya Park BSD. Cijantra, Kec. Sesetan, Denpasar, Bali 15336 \nNomor Telepon: 081213416560 \nHarga Sewa: Rp 1.500.000 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 3×3 \nJumlah Kamar: 6 \nFasilitas: Ranjang, Meja Belajar, Kursi Belajar, Lemari, AC, Wifi Cepat, Water Heater, Free Aqua dan Gas 1 bulan 1x, Kitchen Set dan Perabotan, Parkir Mobil, Parkir Motor \nInfo Tambahan: Kost eksklusif, 1 lantai hanya terdiri dari 2 kamar tidur, 1 kamar mandi, 1 dapur akses mudah, posisi enak kost nyaman \nE-mail: stayinkoze@gmail.com", "750000"));
        duaKos.add(new GridKos("Syailendra Kost",R.drawable.syailendra, "Alamat Kost: Komplek PJKA, Jl Rawamangun Muka IV no. 12 (Dekat Masjid Baitunnur) \nNomor Telepon: 081212069203 \nHarga Sewa: Rp 950.000 \nTempat Kost Untuk: Pria \nUkuran Kamar: 2×3 \\nJumlah Kamar: 1 \nFasilitas: AC, lemari, kasur+sprei, Parkiran mobil/motor, dispenser, tempat cuci, Parkir Mobil, Parkir Motor \nAkses Lokasi: Di Google saja Syailendra kost / Jl. Rawamangun muka IV no 12 \nE-mail: renoverdinan@gmail.com", "600000"));
        duaKos.add(new GridKos("Kost 573",R.drawable.kos_573, "Alamat Kost: Tanjung Duren Utara 7 / 573, Kec. Tanjung Benoa Utara, Kel. Grogol Petamburan – Bali \nNomor Telepon: 089656705827 \nHarga Sewa: Rp 900.000/bulan \nTempat Kost Untuk: Khusus Wanita \nUkuran Kamar: 3 x 3 m \nJumlah Kamar: 18 \nFasilitas: Spring bed, Lemari , Meja, AC / kipas angina, Jendela, Dapur, Wifi, Ruang tengah, Closet duduk, Shower, Parkir Mobil, Parkir Motor \nInfo Tambahan: Khusus wanita, laki-laki tidak boleh masuk.", "900000"));
        duaKos.add(new GridKos("Kos Kemuning",R.drawable.kemuning, "Alamat Kost: Jl. Kemuning Raya No. 1 RT/RW 012/02 Utan Kayu Utara, Kec.Denpasar Barat – Denpasar Bali \nNo. Telepon: 082114517337 \nHarga Sewa: Bulanan Rp 1.600.000 s.d Rp 2.000.000 Sewa harian Rp 150.000/hari \nTempat Kost Untuk: Pria / Wanita / Suami-Istri \nUkuran Kamar: 18 m2 \nFasilitas:AC, TV LCD, tempat tidur, kamar mandi dalam, shower, water heater, kloset duduk, free wifi dengan kecepatan tinggi untuk memudahkan akses internet anda dan tv kabel (terbatas)., security 24 jam dispenser air dingin dan panas serta lemari clean storage. parkir mobil, parkir motor, \nE-mail: abdulfirman1@gmail.com\n" +
                "\n", "1200000"));

        HomeAdapter homeAdapter1 = new HomeAdapter(this,duaKos);
        kosrekomen.setAdapter(homeAdapter1);
        kosrekomen.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        // grid data kos terdekat
        List<GridKos> tigaKos = new ArrayList<>();
        tigaKos.add(new GridKos("Welive Coliving Pangeran Jimbaran",R.drawable.pangeran, "Alamat Kost : Jalan Pangeran Jayakarta 14 No 23, Kecamatan Kuta, Kelurahan Mangga Dua Jimbaran , Badung - Bali 10730 \nNomor Telepon : 08111949406, 08111949406 \nHarga Sewa : Rp 2,000,000 - Deposit 1 juta \nTempat Kost Untuk : Pria, wanita, pasutri, karyawan, karyawati \nUkuran Kamar : Deluxe 4,3m x 3m, Deluxe+ 4,3m x 3,5m, Exclusive 4,3m x 4,3m \nJumlah Kamar : 25 \nFasilitas : lobby, spring bed full set, nakas, TV 32inc, bantal, lemari, meja & kursi belajar, rak sepatu, keset kamar mandi, wifi 100mbps unlimited, water heater, laundry 2stel / hari, cctv 24 jam, parkir motor, kamar mandi dalam, wastafel \nE-mail : welive.coliving@gmail.com", "800000"));
        tigaKos.add(new GridKos("Ngurah Rai Transit Kost",R.drawable.ngurahrai, "Alamat Kost: Jl. Adisucipto Km. 2.5 Kel.Tuban, Kec. Kuta, Badung \nNomor Telepon: 085213880707 \nHarga Sewa: Mingguan Rp 750.000, Bulanan Rp 2.000.000 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 24 m2 \nJumlah Kamar: 10 \nFasilitas: Tempat tidur, TV, wardrobe, hangers, Free Wi-Fi, kamar mandi di dalam, shower air panas, Parkir Mobil, Parkir Motor. \nAkses Lokasi Dekat Bandara dan menyatu dengan Ngurah Rai Transit Kost \nInfo Tambahan: Tempat paling nyaman buat orang yang bekerja di sekitar Bandara Soekarno-Hatta \nE-mail: cengkarengtransithotel@gmail.com", "1000000"));
        tigaKos.add(new GridKos("Kost 573",R.drawable.kos_573, "Alamat Kost: Tanjung Duren Utara 7 / 573, Kec. Tanjung Benoa Utara, Kel. Grogol Petamburan – Bali \nNomor Telepon: 089656705827 \nHarga Sewa: Rp 900.000/bulan \nTempat Kost Untuk: Khusus Wanita \nUkuran Kamar: 3 x 3 m \nJumlah Kamar: 18 \nFasilitas: Spring bed, Lemari , Meja, AC / kipas angina, Jendela, Dapur, Wifi, Ruang tengah, Closet duduk, Shower, Parkir Mobil, Parkir Motor \nInfo Tambahan: Khusus wanita, laki-laki tidak boleh masuk.", "900000"));
        tigaKos.add(new GridKos("Syailendra Kost",R.drawable.syailendra, "Alamat Kost: Komplek PJKA, Jl Rawamangun Muka IV no. 12 (Dekat Masjid Baitunnur) \nNomor Telepon: 081212069203 \nHarga Sewa: Rp 950.000 \nTempat Kost Untuk: Pria \nUkuran Kamar: 2×3 \\nJumlah Kamar: 1 \nFasilitas: AC, lemari, kasur+sprei, Parkiran mobil/motor, dispenser, tempat cuci, Parkir Mobil, Parkir Motor \nAkses Lokasi: Di Google saja Syailendra kost / Jl. Rawamangun muka IV no 12 \nE-mail: renoverdinan@gmail.com", "600000"));

        HomeAdapter homeAdapter2 = new HomeAdapter(this,tigaKos);
        kosterdekat.setAdapter(homeAdapter2);
        kosterdekat.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));



        // bottom navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        return true;
                    case R.id.nav_wishlist:
                        startActivity(new Intent(getApplicationContext(), WishlistActivity.class));
                        overridePendingTransition(0,0);
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

    public void PopulerGrid(){
        Intent intent = new Intent(this, GridPopulerActivity.class);
        startActivity(intent);
    }

    public void RekomendasiGrid(){
        Intent intent = new Intent(this, GridRekomendasiActivity.class);
        startActivity(intent);
    }

    public void TerdekatKos(){
        Intent intent = new Intent(this, GridTerdekatActivity.class);
        startActivity(intent);
    }
}
