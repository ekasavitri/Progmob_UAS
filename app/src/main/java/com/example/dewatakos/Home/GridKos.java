package com.example.dewatakos.Home;

public class GridKos {

    private String title;
    private int image;
    private String dekripsi;
    private String harga;

    public GridKos(String title, int image, String dekripsi, String harga) {
        this.title = title;
        this.image = image;
        this.dekripsi = dekripsi;
        this.harga = harga;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public String getDeskripsi() {
        return dekripsi;
    }

    public String getHarga() { return harga; }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setDekripsi (String deskripsi) { this.dekripsi = deskripsi; }

    public void setHarga(String harga) { this.harga = harga; }
}
