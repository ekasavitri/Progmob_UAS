package com.example.dewatakos.Home.KosRekomendasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.astungkarafix.R;

import java.util.ArrayList;
import java.util.List;

public class GridRekomendasiActivity extends AppCompatActivity {

    List<GridRekomendasi> duaKos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_rekomendasi);
        getSupportActionBar().setTitle("Dewata Kos");

        duaKos= new ArrayList<>();
        duaKos.add(new GridRekomendasi("Indekos Ragunan","Rp. 800.000","Alamat Kost: Jln. Seruni I/2 No.8 Puri Gading Jimbaran, Kuta Selatan - Badung \nNomor Telepon: 089629041191, 08567042416 \nTempat Kost Untuk: Pria/wanita/suami istri, masih pacaran tidak bisa \nUkuran Kamar: 2×2 sd 2,5×3,5 m2 \nJumlah Kamar: 10 \nFasilitas: WIFI, AC, springbed set, meja, lemari, lantal, Parkir motor, CCTV, jemuran, kamar mandi, Dapur.Parkir Motor. \nE-mail: hirman.lim@gmail.com",R.drawable.kos8));
        duaKos.add(new GridRekomendasi("The Red Colour Wall","Harga Sewa: Rp. 850.000 – Rp. 1.200.000/bulan","Alamat Kost: Jln. Raya Uluwatu II (Flora Bali Orchid) Kuta Selatan - Badung \nNomor Telepon: 089629041191, 08567042416 \nTempat Kost Untuk: Pria/wanita/suami istri, masih pacaran tidak bisa \nUkuran Kamar: 2×2 sd 2,5×3,5 m2 \nJumlah Kamar: 10 \nFasilitas: WIFI, AC, springbed set, meja, lemari, lantal, Parkir motor, CCTV, jemuran, kamar mandi, Dapur.Parkir Motor. \nE-mail: hirman.lim@gmail.com",R.drawable.kos9));
        duaKos.add(new GridRekomendasi("Ciniru Kost","Rp. 900.000","Alamat Kost: Jln. I Gusti Ngurah Rai, Benoa Kec. Kuta Selatan - Badung \nNomor Telepon: 089629041191, 08567042416 \nTempat Kost Untuk: Pria/wanita/suami istri, masih pacaran tidak bisa \nUkuran Kamar: 2×2 sd 2,5×3,5 m2 \nJumlah Kamar: 10 \nFasilitas: WIFI, AC, springbed set, meja, lemari, lantal, Parkir motor, CCTV, jemuran, kamar mandi, Dapur.Parkir Motor. \nE-mail: hirman.lim@gmail.com",R.drawable.kos10));
        duaKos.add(new GridRekomendasi("Gading Elok Residence","Rp. 1.200.000","Alamat Kost: Jln. Tegal Sari, Jimbaran, Kec. Kuta Selatan - Kab. Badung \nNomor Telepon: 089629041191, 08567042416 \nTempat Kost Untuk: Pria/wanita/suami istri, masih pacaran tidak bisa \nUkuran Kamar: 2×2 sd 2,5×3,5 m2 \nJumlah Kamar: 10 \nFasilitas: WIFI, AC, springbed set, meja, lemari, lantal, Parkir motor, CCTV, jemuran, kamar mandi, Dapur.Parkir Motor. \nE-mail: hirman.lim@gmail.com",R.drawable.kos11));
        duaKos.add(new GridRekomendasi("Kost Aimar","Harga Sewa: Rp. 850.000 – Rp. 1.200.000/bulan ","Alamat Kost: Jln. Nusa Dua Br. Petangan, Kutuh, Kuta Selatan - Badung \nNomor Telepon: 089629041191, 08567042416 \nTempat Kost Untuk: Pria/wanita/suami istri, masih pacaran tidak bisa \nUkuran Kamar: 2×2 sd 2,5×3,5 m2 \nJumlah Kamar: 10 \nFasilitas: WIFI, AC, springbed set, meja, lemari, lantal, Parkir motor, CCTV, jemuran, kamar mandi, Dapur.Parkir Motor. \nE-mail: hirman.lim@gmail.com",R.drawable.kos12));
        duaKos.add(new GridRekomendasi("D’SHANIA","Harga Sewa: Rp. 850.000 – Rp. 1.200.000 ","Alamat Kost: Jln. Raya Uluwatu, Br. Dinas Kangin Pecatu, Kec. Kuta Selatan - Badung \nNomor Telepon: 089629041191, 08567042416 \nTempat Kost Untuk: Pria/wanita/suami istri, masih pacaran tidak bisa \nUkuran Kamar: 2×2 sd 2,5×3,5 m2 \nJumlah Kamar: 10 \nFasilitas: WIFI, AC, springbed set, meja, lemari, lantal, Parkir motor, CCTV, jemuran, kamar mandi, Dapur.Parkir Motor. \nE-mail: hirman.lim@gmail.com",R.drawable.kos13));
        duaKos.add(new GridRekomendasi("Memoria Residence","Rp. 950.000","Alamat Kost: Jln. Danau Batur Raya Taman Griya Jimbaran, Kuta Selatan - Badung \nNomor Telepon: 089629041191, 08567042416 \nTempat Kost Untuk: Pria/wanita/suami istri, masih pacaran tidak bisa \nUkuran Kamar: 2×2 sd 2,5×3,5 m2 \nJumlah Kamar: 10 \nFasilitas: WIFI, AC, springbed set, meja, lemari, lantal, Parkir motor, CCTV, jemuran, kamar mandi, Dapur.Parkir Motor. \nE-mail: hirman.lim@gmail.com",R.drawable.kos14));
        duaKos.add(new GridRekomendasi("Gaharu Studio Residence","Rp. 1.200.000","Alamat Kost: Jln. Bantas Kangin Jimbaran Kuta Selatan - Badung \nNomor Telepon: 089629041191, 08567042416 \nTempat Kost Untuk: Pria/wanita/suami istri, masih pacaran tidak bisa \nUkuran Kamar: 2×2 sd 2,5×3,5 m2 \nJumlah Kamar: 10 \nFasilitas: WIFI, AC, springbed set, meja, lemari, lantal, Parkir motor, CCTV, jemuran, kamar mandi, Dapur.Parkir Motor. \nE-mail: hirman.lim@gmail.com",R.drawable.kosan15));
        duaKos.add(new GridRekomendasi("Griya Agung Permai","Rp. 850.000","Alamat Kost: Jl. Kran V no.21 Rt.10/Rw.05, Gunung Sahari Selatan, Kec Kuta Selatan, Badung, Bali \nNomor Telepon: 089629041191, 08567042416  \nTempat Kost Untuk: Pria/wanita/suami istri, masih pacaran tidak bisa \nUkuran Kamar: 2×2 sd 2,5×3,5 m2 \nJumlah Kamar: 10 \nFasilitas: WIFI, AC, springbed set, meja, lemari, lantal, Parkir motor, CCTV, jemuran, kamar mandi, Dapur.Parkir Motor. \nE-mail: hirman.lim@gmail.com",R.drawable.kosan2));

        RecyclerView rkrv = (RecyclerView) findViewById(R.id.recyclerview_idrekomen);
        GridRekomendasiAdapter myAdapter1 = new GridRekomendasiAdapter(this,duaKos);
        rkrv.setLayoutManager(new GridLayoutManager(this,2));
        rkrv.setAdapter(myAdapter1);
    }
}
