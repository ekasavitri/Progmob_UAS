package com.example.dewatakos.Wishlist;

public class WishlistKos {

    private String Title;
    private String Harga;
    private int FotoKos;

    public WishlistKos() {
    }

    public WishlistKos(String title, String harga, int fotoKos) {
        Title = title;
        Harga = harga;
        FotoKos = fotoKos;
    }

    public String getTitle() {
        return Title;
    }

    public String getHarga() {
        return Harga;
    }

    public int getFotoKos() {
        return FotoKos;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setHarga(String harga) {
        Harga = harga;
    }

    public void setFotoKos(int fotoKos) {
        FotoKos = fotoKos;
    }
}
