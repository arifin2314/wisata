package com.example.muhammadarifin.model;

import java.io.Serializable;

public class wisata implements Serializable {
    private String jenis;
    private String nama_wisata;
    private String lokasi;
    private String deskripsi;
    private int poto;


    public wisata(String jenis, String nama_wisata, String lokasi, String deskripsi, int poto) {
        this.jenis = jenis;
        this.nama_wisata = nama_wisata;
        this.lokasi = lokasi;
        this.deskripsi = deskripsi;
        this.poto = poto;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNama_wisata() {
        return nama_wisata;
    }

    public void setNama_wisata(String nama_wisata) {
        this.nama_wisata = nama_wisata;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getPoto() {
        return poto;
    }

    public void setPoto(int poto) {
        this.poto = poto;
    }
}
