package com.example.muhammadarifin;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.muhammadarifin.model.wisata;

import java.util.List;

public class DaftarWisataActivity extends AppCompatActivity {
    public final static String WISATA_TERPILIH ="hewan_obj_key";
    List<wisata> wisatas;
    ListView listView;
    String jenisWisata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_wisata);
        Intent intent = getIntent();
        jenisWisata = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        TextView txJudul = findViewById(R.id.text_title_daftar);
        txJudul.setText("DAFTAR BERBAGAI RAS "+jenisWisata.toUpperCase());
        wisatas = galery.getWisatasByTipe(jenisWisata);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_wisata);
        DafatarWisataAdapter adapter = new DafatarWisataAdapter(this,wisatas);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            wisata terpilih = wisatas.get(position);
            bukaProfileHewan(terpilih);
        }
    };

    private void bukaProfileHewan(wisata wisataTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra(WISATA_TERPILIH, wisataTerpilih);
        startActivity(intent);
    }
}
