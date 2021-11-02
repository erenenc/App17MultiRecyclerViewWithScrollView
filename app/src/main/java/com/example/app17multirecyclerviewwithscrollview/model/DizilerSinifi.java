package com.example.app17multirecyclerviewwithscrollview.model;

public class DizilerSinifi {

    private int dizi_id;
    private String dizi_ad;
    private String dizi_resim_ad;
    private double dizi_fiyat;

    public DizilerSinifi(int dizi_id, String dizi_ad, String dizi_resim_ad, double dizi_fiyat) {
        this.dizi_id = dizi_id;
        this.dizi_ad = dizi_ad;
        this.dizi_resim_ad = dizi_resim_ad;
        this.dizi_fiyat = dizi_fiyat;
    }

    public int getDizi_id() {
        return dizi_id;
    }

    public void setDizi_id(int dizi_id) {
        this.dizi_id = dizi_id;
    }

    public String getDizi_ad() {
        return dizi_ad;
    }

    public void setDizi_ad(String dizi_ad) {
        this.dizi_ad = dizi_ad;
    }

    public String getDizi_resim_ad() {
        return dizi_resim_ad;
    }

    public void setDizi_resim_ad(String dizi_resim_ad) {
        this.dizi_resim_ad = dizi_resim_ad;
    }

    public double getDizi_fiyat() {
        return dizi_fiyat;
    }

    public void setDizi_fiyat(double dizi_fiyat) {
        this.dizi_fiyat = dizi_fiyat;
    }
}
