package com.example.dewatakos.Home.KosPopuler;

public class GridPopuler {
    private String NamaKos;
    private String HargaKos;
    private String DeskripsiKos;
    private int FotoKos;

    public GridPopuler() {
    }

    public GridPopuler(String namaKos, String hargaKos, String deskripsiKos, int fotoKos) {
        NamaKos = namaKos;
        HargaKos = hargaKos;
        DeskripsiKos = deskripsiKos;
        FotoKos = fotoKos;
    }

    public String getNamaKos() {
        return NamaKos;
    }

    public String getHargaKos() {
        return HargaKos;
    }

    public String getDeskripsiKos() {
        return DeskripsiKos;
    }

    public int getFotoKos() {
        return FotoKos;
    }

    public void setNamaKos(String namaKos) {
        NamaKos = namaKos;
    }

    public void setHargaKos(String hargaKos) {
        HargaKos = hargaKos;
    }

    public void setDeskripsiKos(String deskripsiKos) {
        DeskripsiKos = deskripsiKos;
    }

    public void setFotoKos(int fotoKos) {
        FotoKos = fotoKos;
    }
}
