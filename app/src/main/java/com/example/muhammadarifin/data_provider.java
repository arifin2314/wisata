//package com.example.muhammadarifin;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.example.muhammadarifin.model.wisata;
//
//import java.util.List;
//
//public class data_provider extends AppCompatActivity {
//
//    List<wisata> wisatas;
//    int indeksTampil = 0;
//    String jenisWisata;
//    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
//    TextView txJenis, nama_wisata, txlokasi,txDeskripsi,txJudul;
//    ImageView ivFotoWisaat;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_profil);
//        Intent intent = getIntent();
//        jenisWisata = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
//        wisatas = galery.getWisatasByTipe(jenisWisata);
//        inisialisasiView();
//        tampilkanProfil();
//    }
//
//    private void inisialisasiView() {
//        btnPertama = findViewById(R.id.btnPertama);
//        btnSebelumnya = findViewById(R.id.btnSebelumnya);
//        btnBerikutnya = findViewById(R.id.btnBerikutnya);
//        btnTerakhir = findViewById(R.id.btnTerakhir);
//
//        btnPertama.setOnClickListener(view -> hewanPertama());
//        btnTerakhir.setOnClickListener(view -> hewanTerakhir());
//        btnSebelumnya.setOnClickListener(view -> hewanSebelumnya());
//        btnBerikutnya.setOnClickListener(view -> hewanBerikutnya());
//

//    }
//
//
//    private void tampilkanProfil() {
//        wisata k = wisatas.get(indeksTampil);
//        Log.d("WISATA","Menampilkan Wisata "+k.getJenis());
//        txJenis.setText(k.getJenis());
//        nama_wisata.setText(k.getNama_wisata());
//        txlokasi.setText(k.getLokasi());
//        txDeskripsi.setText(k.getDeskripsi());
//        ivFotoWisaat.setImageDrawable(this.getDrawable(k.getPoto()));
//    }
//
//    private void hewanPertama() {
//        int posAwal = 0;
//        if (indeksTampil == posAwal) {
//            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
//            return;
//        } else {
//            indeksTampil = posAwal;
//            tampilkanProfil();
//        }
//    }
//
//    private void hewanTerakhir() {
//        int posAkhir = wisatas.size() - 1;
//        if (indeksTampil == posAkhir) {
//            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
//            return;
//        } else {
//            indeksTampil = posAkhir;
//            tampilkanProfil();
//        }
//    }
//
//    private void hewanBerikutnya() {
//        if (indeksTampil == wisatas.size() - 1) {
//            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
//            return;
//        } else {
//            indeksTampil++;
//            tampilkanProfil();
//        }
//    }
//
//    private void hewanSebelumnya() {
//        if (indeksTampil == 0) {
//            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
//            return;
//        } else {
//            indeksTampil--;
//            tampilkanProfil();
//        }
//    }
//}
