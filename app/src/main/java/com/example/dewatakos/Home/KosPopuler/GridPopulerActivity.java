package com.example.dewatakos.Home.KosPopuler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.astungkarafix.R;

import java.util.ArrayList;
import java.util.List;

public class GridPopulerActivity extends AppCompatActivity {

    List<GridPopuler> satuKos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_populer);
        getSupportActionBar().setTitle("Dewata Kos");

        satuKos = new ArrayList<>();
        satuKos.add(new GridPopuler("Little Home","Harga Sewa: Rp 1.500.000 ","Alamat Kost: Jalan Segara Madu Kedonganan 15336, Badung \nNomor Telepon: 081213416560 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 3×3 \nJumlah Kamar: 6 \nFasilitas: Ranjang, Meja Belajar, Kursi Belajar, Lemari, AC, Wifi Cepat, Parkir Mobil, Parkir Motor \nInfo Tambahan: Kost eksklusif, 1 lantai hanya terdiri dari 2 kamar tidur, 1 kamar mandi, 1 dapur akses mudah, posisi enak kost nyaman \nE-mail: stayinkoze@gmail.com",R.drawable.kosan15));
        satuKos.add(new GridPopuler("KD Residence","Rp. 900.000","Alamat Kost: Jln. Uluwatu 1 No.6, Jimbaran Kec. Kuta Selatan, Badung \nNomor Telepon: 081213416560 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 3×3 \nJumlah Kamar: 6 \nFasilitas: Ranjang, Meja Belajar, Kursi Belajar, Lemari, AC, Wifi Cepat, Kitchen Set dan Perabotan, Parkir Mobil, Parkir Motor \nInfo Tambahan: Kost eksklusif, 1 lantai hanya terdiri dari 2 kamar tidur, 1 kamar mandi, 1 dapur akses mudah, posisi enak kost nyaman \nE-mail: stayinkoze@gmail.com",R.drawable.kosan2));
        satuKos.add(new GridPopuler("Lafina Kos","Harga Sewa: Rp 1.500.000 ","Alamat Kost: Jln. Dewi Saraswati, Simnayak Kec. Kuta, Badung \nNomor Telepon: 081213416560 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 3×3 \nJumlah Kamar: 6 \nFasilitas: Ranjang, Lemari, AC, Wifi Cepat, Water Heater, Free Aqua dan Gas 1 bulan 1x, Kitchen Set dan Perabotan, Parkir Mobil, Parkir Motor \nInfo Tambahan: Kost eksklusif, 1 lantai hanya terdiri dari 2 kamar tidur, 1 kamar mandi, 1 dapur akses mudah, posisi enak kost nyaman \nE-mail: stayinkoze@gmail.com",R.drawable.kos1));
        satuKos.add(new GridPopuler("Shafia 56","Rp. 1.300.000","Alamat Kost: Jln. Kartika Plaza Kuta, Kec. Kuta, Badung \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 3×3 \nJumlah Kamar: 6 \nFasilitas: Ranjang, Meja Belajar, Kursi Belajar, Lemari, AC, Wifi Cepat, Water Heater, Free Aqua dan Gas 1 bulan 1x, Kitchen Set dan Perabotan, Parkir Mobil, Parkir Motor \nInfo Tambahan: Kost eksklusif, 1 lantai hanya terdiri dari 2 kamar tidur, 1 kamar mandi, 1 dapur akses mudah, posisi enak kost nyaman \nE-mail: stayinkoze@gmail.com",R.drawable.kos3));
        satuKos.add(new GridPopuler("Kost BRRH","Rp. 1.000.000","Alamat Kost: Jln. Bhinneka Nusa Kangin 1X Desa Dalung, Kuta Utara \nNomor Telepon: 081213416560 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 3×3 \nJumlah Kamar: 6 \nFasilitas: Ranjang, Meja Belajar, Kursi Belajar, Lemari, AC, Wifi Cepat, Parkir Mobil, Parkir Motor \nInfo Tambahan: Kost eksklusif, 1 lantai hanya terdiri dari 2 kamar tidur, 1 kamar mandi, 1 dapur akses mudah, posisi enak kost nyaman \nE-mail: stayinkoze@gmail.com",R.drawable.kos5));
        satuKos.add(new GridPopuler("Sunter Agung ","Harga Sewa: Rp 1.500.000 ","Alamat Kost: Anarta House Vanya Park BSD. Cijantra, Kec. Sesetan, Denpasar, Bali 15336 \nNomor Telepon: 081213416560 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 3×3 \nJumlah Kamar: 6 \nFasilitas: Ranjang, Meja Belajar, Kursi Belajar, Lemari, AC, Wifi Cepat, Water Heater, Parkir Motor \nInfo Tambahan: Kost eksklusif, 1 lantai hanya terdiri dari 2 kamar tidur, 1 kamar mandi, 1 dapur akses mudah, posisi enak kost nyaman \nE-mail: stayinkoze@gmail.com",R.drawable.kos7));
        satuKos.add(new GridPopuler("Kost Batu Kencana","Rp. 1.000.000","Alamat Kost: Jln. Taman Sari Gg. Melati No. 2 Kelan Kuta, Badung \nNomor Telepon: 081213416560 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 3×3 \nJumlah Kamar: 6 \nFasilitas: Ranjang, Meja Belajar, Kursi Belajar, Lemari, AC, Wifi Cepat, Water Heater, Free Aqua dan Gas 1 bulan 1x, Kitchen Set dan Perabotan, Parkir Mobil, Parkir Motor \nInfo Tambahan: Kost eksklusif, 1 lantai hanya terdiri dari 2 kamar tidur, 1 kamar mandi, 1 dapur akses mudah, posisi enak kost nyaman \nE-mail: stayinkoze@gmail.com",R.drawable.kos11));
        satuKos.add(new GridPopuler("Kost Ananda","Rp. 1.500.000","Alamat Kost: Jln. Majapahit, Blahkiuh, Kec. Abiansemal \nNomor Telepon: 081213416560 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 3×3 \nJumlah Kamar: 6 \nFasilitas: Ranjang, Meja Belajar, Kursi Belajar, Lemari, AC, Wifi Cepat, Water Heater, Free Aqua dan Gas 1 bulan 1x, Parkir Motor \nInfo Tambahan: Kost eksklusif, 1 lantai hanya terdiri dari 2 kamar tidur, 1 kamar mandi, 1 dapur akses mudah, posisi enak kost nyaman \nE-mail: stayinkoze@gmail.com",R.drawable.kos13));
        satuKos.add(new GridPopuler("Guesthouse Kost","Rp. 1.300.000","Alamat Kost: Jln. Raya Sibangkaja, Sibang Kaja Kec. Abiansemal, Badung \nNomor Telepon: 081213416560 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 3×3 \nJumlah Kamar: 6 \nFasilitas: Ranjang, Meja Belajar, Kursi Belajar, Lemari, AC, Wifi Cepat, Water Heater, Free Aqua dan Gas 1 bulan 1x, Kitchen Set dan Perabotan, Parkir Mobil, Parkir Motor \nInfo Tambahan: Kost eksklusif, 1 lantai hanya terdiri dari 2 kamar tidur, 1 kamar mandi, 1 dapur akses mudah, posisi enak kost nyaman \nE-mail: stayinkoze@gmail.com",R.drawable.kosan3));
        satuKos.add(new GridPopuler("Aalaya Kost","Rp. 950.000","Alamat Kost: Jln. Gunung Agung No. 3, Mengwi Kec. Mengwi, Badung \nNomor Telepon: 081213416560 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 3×3 \nJumlah Kamar: 6 \nFasilitas: Ranjang, Meja Belajar, Kursi Belajar, Lemari, AC, Wifi Cepat, Water Heater, Parkir Mobil, Parkir Motor \nInfo Tambahan: Kost eksklusif, 1 lantai hanya terdiri dari 2 kamar tidur, 1 kamar mandi, 1 dapur akses mudah, posisi enak kost nyaman \nE-mail: stayinkoze@gmail.com",R.drawable.kosan7));
        satuKos.add(new GridPopuler("MetHanna Home","Rp. 1.000.000","Alamat Kost: Jln. Muding Sangiang LC Batu Bidak Kerobokan, Kuta Utara \nNomor Telepon: 081213416560 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 3×3 \nJumlah Kamar: 6 \nFasilitas: Ranjang, Meja Belajar, Kursi Belajar, Lemari, AC, Wifi Cepat, Water Heater, Parkir Mobil, Parkir Motor \nInfo Tambahan: Kost eksklusif, 1 lantai hanya terdiri dari 2 kamar tidur, 1 kamar mandi, 1 dapur akses mudah, posisi enak kost nyaman \nE-mail: stayinkoze@gmail.com",R.drawable.kosan9));
        satuKos.add(new GridPopuler("Baitis Salmah","Rp. 950.000","Alamat Kost: Jln. Gunung Sanghiyang Kerobokan, Kuta Utara, Badung \nNomor Telepon: 081213416560 \nTempat Kost Untuk: Pria / Wanita \nUkuran Kamar: 3×3 \nJumlah Kamar: 6 \nFasilitas: Lemari, AC, Wifi Cepat, Water Heater, Free Aqua dan Gas 1 bulan 1x, Kitchen Set dan Perabotan, Parkir Mobil, Parkir Motor \nInfo Tambahan: Kost eksklusif, 1 lantai hanya terdiri dari 2 kamar tidur, 1 kamar mandi, 1 dapur akses mudah, posisi enak kost nyaman \nE-mail: stayinkoze@gmail.com",R.drawable.kosan4));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        GridPopulerAdapter myAdapter = new GridPopulerAdapter(this, satuKos);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);
    }
}
