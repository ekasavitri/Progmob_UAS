package com.example.dewatakos.Home.KosRekomendasi;

public class GridRekomendasi {
    private String NamaKosRekomen;
    private String HargaKosRekomen;
    private String DeskripsiKosRekomen;
    private int FotoKosRekomen;

    public GridRekomendasi() {
    }

    public GridRekomendasi(String namaKosRekomen, String hargaKosRekomen, String deskripsiKosRekomen, int fotoKosRekomen) {
        NamaKosRekomen = namaKosRekomen;
        HargaKosRekomen = hargaKosRekomen;
        DeskripsiKosRekomen = deskripsiKosRekomen;
        FotoKosRekomen = fotoKosRekomen;
    }

    public String getNamaKosRekomen() {
        return NamaKosRekomen;
    }

    public String getHargaKosRekomen() {
        return HargaKosRekomen;
    }

    public String getDeskripsiKosRekomen() {
        return DeskripsiKosRekomen;
    }

    public int getFotoKosRekomen() {
        return FotoKosRekomen;
    }

    public void setNamaKosRekomen(String namaKosRekomen) {
        NamaKosRekomen = namaKosRekomen;
    }

    public void setHargaKosRekomen(String hargaKosRekomen) {
        HargaKosRekomen = hargaKosRekomen;
    }

    public void setDeskripsiKosRekomen(String deskripsiKosRekomen) {
        DeskripsiKosRekomen = deskripsiKosRekomen;
    }

    public void setFotoKosRekomen(int fotoKosRekomen) {
        FotoKosRekomen = fotoKosRekomen;
    }
}
