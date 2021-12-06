    package com.example.muhammadarifin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

    public class MainActivity extends AppCompatActivity {

    ImageButton btnairterjun,btnpantai,btnpengunungan,btnreligi;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }
    private void inisialisasiView() {
        btnairterjun = findViewById(R.id.btn_airterjun);
        btnpantai = findViewById(R.id.btn_pantai);
        btnpengunungan = findViewById(R.id.btn_pengunungan);
        btnreligi = findViewById(R.id.btn_religi);
        btnairterjun.setOnClickListener(view -> bukaGaleri("air_terjun"));
        btnpantai.setOnClickListener(view -> bukaGaleri("pantai"));
        btnpengunungan.setOnClickListener(view -> bukaGaleri("pengunungan"));
        btnreligi.setOnClickListener(view -> bukaGaleri("religi"));
    }

    private void bukaGaleri(String jenisWisata) {
        Intent intent = new Intent(this, DaftarWisataActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisWisata);
        startActivity(intent);
    }

    public void onClikPROFILE(View v) {
        Intent intent = new Intent(this, PROFIL.class);
        startActivity(intent);
    }
}