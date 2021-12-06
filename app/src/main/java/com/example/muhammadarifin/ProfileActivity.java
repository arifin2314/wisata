package com.example.muhammadarifin;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.muhammadarifin.model.wisata;

public class ProfileActivity extends AppCompatActivity {
    wisata wisata;
    TextView txJenis, nama_wisata, txlokasi,txDeskripsi,txJudul;
    ImageView ivFotoWisaat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        Intent intent = getIntent();
        wisata = (wisata) intent.getSerializableExtra(DaftarWisataActivity.WISATA_TERPILIH);
        inisialisasiView();
        tampilkanProfil(wisata);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        nama_wisata = findViewById(R.id.nama_wisata);
        txlokasi = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoWisaat = findViewById(R.id.gambarwisata);
    }


    private void tampilkanProfil(wisata wisata) {
        Log.d("Profil","Menampilkan "+wisata.getJenis());
        txJudul.setText(wisata.getJenis());
        txJenis.setText(wisata.getJenis());
        nama_wisata.setText(wisata.getNama_wisata());
        txDeskripsi.setText(wisata.getDeskripsi());
        ivFotoWisaat.setImageDrawable(this.getDrawable(wisata.getPoto()));
    }

}
