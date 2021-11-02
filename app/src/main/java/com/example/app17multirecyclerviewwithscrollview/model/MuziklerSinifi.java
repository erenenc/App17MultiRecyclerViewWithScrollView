package com.example.app17multirecyclerviewwithscrollview.model;

public class MuziklerSinifi {

    private int muzik_id;
    private String muzik_ad;
    private String muzik_resim_ad;
    private double muzik_fiyat;

    public MuziklerSinifi(int muzik_id, String muzik_ad, String muzik_resim_ad, double muzik_fiyat) {
        this.muzik_id = muzik_id;
        this.muzik_ad = muzik_ad;
        this.muzik_resim_ad = muzik_resim_ad;
        this.muzik_fiyat = muzik_fiyat;
    }

    public int getMuzik_id() {
        return muzik_id;
    }

    public void setMuzik_id(int muzik_id) {
        this.muzik_id = muzik_id;
    }

    public String getMuzik_ad() {
        return muzik_ad;
    }

    public void setMuzik_ad(String muzik_ad) {
        this.muzik_ad = muzik_ad;
    }

    public String getMuzik_resim_ad() {
        return muzik_resim_ad;
    }

    public void setMuzik_resim_ad(String muzik_resim_ad) {
        this.muzik_resim_ad = muzik_resim_ad;
    }

    public double getMuzik_fiyat() {
        return muzik_fiyat;
    }

    public void setMuzik_fiyat(double muzik_fiyat) {
        this.muzik_fiyat = muzik_fiyat;
    }
}
