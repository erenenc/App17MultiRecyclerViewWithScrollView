package com.example.app17multirecyclerviewwithscrollview.model;

public class KitaplarSinifi {

    private int kitap_id;
    private String kitap_ad;
    private String kitap_resim_ad;
    private double kitap_fiyat;

    public KitaplarSinifi(int kitap_id, String kitap_ad, String kitap_resim_ad, double kitap_fiyat) {
        this.kitap_id = kitap_id;
        this.kitap_ad = kitap_ad;
        this.kitap_resim_ad = kitap_resim_ad;
        this.kitap_fiyat = kitap_fiyat;
    }

    public int getKitap_id() {
        return kitap_id;
    }

    public void setKitap_id(int kitap_id) {
        this.kitap_id = kitap_id;
    }

    public String getKitap_ad() {
        return kitap_ad;
    }

    public void setKitap_ad(String kitap_ad) {
        this.kitap_ad = kitap_ad;
    }

    public String getKitap_resim_ad() {
        return kitap_resim_ad;
    }

    public void setKitap_resim_ad(String kitap_resim_ad) {
        this.kitap_resim_ad = kitap_resim_ad;
    }

    public double getKitap_fiyat() {
        return kitap_fiyat;
    }

    public void setKitap_fiyat(double kitap_fiyat) {
        this.kitap_fiyat = kitap_fiyat;
    }
}
