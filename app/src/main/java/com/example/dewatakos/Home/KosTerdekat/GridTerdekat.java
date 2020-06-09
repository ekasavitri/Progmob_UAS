package com.example.dewatakos.Home.KosTerdekat;

public class GridTerdekat {
    private String NamaKosDekat;
    private String HargaKosDekat;
    private String DeskripsiKosDekat;
    private int FotoKosDekat;

    public GridTerdekat() {
    }

    public GridTerdekat(String namaKosDekat, String hargaKosDekat, String deskripsiKosDekat, int fotoKosDekat) {
        NamaKosDekat = namaKosDekat;
        HargaKosDekat = hargaKosDekat;
        DeskripsiKosDekat = deskripsiKosDekat;
        FotoKosDekat = fotoKosDekat;
    }

    public String getNamaKosDekat() {
        return NamaKosDekat;
    }

    public String getHargaKosDekat() {
        return HargaKosDekat;
    }

    public String getDeskripsiKosDekat() {
        return DeskripsiKosDekat;
    }

    public int getFotoKosDekat() {
        return FotoKosDekat;
    }

    public void setNamaKosDekat(String namaKosDekat) {
        NamaKosDekat = namaKosDekat;
    }

    public void setHargaKosDekat(String hargaKosDekat) {
        HargaKosDekat = hargaKosDekat;
    }

    public void setDeskripsiKosDekat(String deskripsiKosDekat) {
        DeskripsiKosDekat = deskripsiKosDekat;
    }

    public void setFotoKosDekat(int fotoKosDekat) {
        FotoKosDekat = fotoKosDekat;
    }
}
