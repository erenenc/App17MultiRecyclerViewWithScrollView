package com.example.app17multirecyclerviewwithscrollview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.app17multirecyclerviewwithscrollview.adapter.DizilerAdapter;
import com.example.app17multirecyclerviewwithscrollview.adapter.FilmlerAdapter;
import com.example.app17multirecyclerviewwithscrollview.adapter.KitaplarAdapter;
import com.example.app17multirecyclerviewwithscrollview.adapter.MuziklerAdapter;
import com.example.app17multirecyclerviewwithscrollview.model.DizilerSinifi;
import com.example.app17multirecyclerviewwithscrollview.model.FilmlerSinifi;
import com.example.app17multirecyclerviewwithscrollview.model.KitaplarSinifi;
import com.example.app17multirecyclerviewwithscrollview.model.MuziklerSinifi;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView filmlerRV, dizilerRV, kitaplarRV, muziklerRV;

    private ArrayList<FilmlerSinifi> filmlerSinifiArrayList;
    private ArrayList<DizilerSinifi> dizilerSinifiArrayList;
    private ArrayList<KitaplarSinifi> kitaplarSinifiArrayList;
    private ArrayList<MuziklerSinifi> muziklerSinifiArrayList;

    private FilmlerAdapter filmlerAdapter;
    private DizilerAdapter dizilerAdapter;
    private KitaplarAdapter kitaplarAdapter;
    private MuziklerAdapter muziklerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //filmlerRV icin
        filmlerRV = findViewById(R.id.filmlerRV);
        filmlerRV.setHasFixedSize(true);
        filmlerRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        FilmlerSinifi f1 = new FilmlerSinifi(1, "Django", "film_django", 12.45);
        FilmlerSinifi f2 = new FilmlerSinifi(2, "Bir Zamanlar Anadoluda", "film_birzamanlaranadoluda", 16.75);
        FilmlerSinifi f3 = new FilmlerSinifi(3, "Inception", "film_inception", 42.45);
        FilmlerSinifi f4 = new FilmlerSinifi(4, "Interstellar", "film_interstellar", 67.45);
        FilmlerSinifi f5 = new FilmlerSinifi(5, "The Hateful Eight", "film_thehatefuleight", 72.45);
        FilmlerSinifi f6 = new FilmlerSinifi(6, "The Pianist", "film_thepianist", 62.45);

        filmlerSinifiArrayList = new ArrayList<>();
        filmlerSinifiArrayList.add(f1);
        filmlerSinifiArrayList.add(f2);
        filmlerSinifiArrayList.add(f3);
        filmlerSinifiArrayList.add(f4);
        filmlerSinifiArrayList.add(f5);
        filmlerSinifiArrayList.add(f6);

        filmlerAdapter = new FilmlerAdapter(filmlerSinifiArrayList, this);
        filmlerRV.setAdapter(filmlerAdapter);



        //dizilerRV icin
        dizilerRV = findViewById(R.id.dizilerRV);
        dizilerRV.setHasFixedSize(true);
        dizilerRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        DizilerSinifi d1 = new DizilerSinifi(1, "Canan", "dizi_canan", 12.45);
        DizilerSinifi d2 = new DizilerSinifi(2, "locke", "dizi_locke", 16.75);
        DizilerSinifi d3 = new DizilerSinifi(3, "Lucifer", "dizi_lucifer", 42.45);
        DizilerSinifi d4 = new DizilerSinifi(4, "Prison Break", "dizi_prison", 67.45);
        DizilerSinifi d5 = new DizilerSinifi(5, "Snoj", "dizi_snoj", 72.45);
        DizilerSinifi d6 = new DizilerSinifi(6, "Texas", "dizi_texas", 62.45);

        dizilerSinifiArrayList = new ArrayList<>();
        dizilerSinifiArrayList.add(d1);
        dizilerSinifiArrayList.add(d2);
        dizilerSinifiArrayList.add(d3);
        dizilerSinifiArrayList.add(d4);
        dizilerSinifiArrayList.add(d5);
        dizilerSinifiArrayList.add(d6);

        dizilerAdapter = new DizilerAdapter(dizilerSinifiArrayList, this);
        dizilerRV.setAdapter(dizilerAdapter);


        //kitaplarRV icin
        kitaplarRV = findViewById(R.id.kitaplarRV);
        kitaplarRV.setHasFixedSize(true);
        kitaplarRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        KitaplarSinifi k1 = new KitaplarSinifi(1, "kitap1", "kitap1", 12.45);
        KitaplarSinifi k2 = new KitaplarSinifi(2, "kitap2", "kitap2", 12.45);
        KitaplarSinifi k3 = new KitaplarSinifi(3, "kitap3", "kitap3", 12.45);
        KitaplarSinifi k4 = new KitaplarSinifi(4, "kitap4", "kitap4", 12.45);
        KitaplarSinifi k5 = new KitaplarSinifi(5, "kitap5", "kitap5", 12.45);
        KitaplarSinifi k6 = new KitaplarSinifi(6, "kitap6", "kitap6", 12.45);
        KitaplarSinifi k7 = new KitaplarSinifi(7, "kitap7", "kitap7", 12.45);
        KitaplarSinifi k8 = new KitaplarSinifi(8, "kitap8", "kitap8", 12.45);

        kitaplarSinifiArrayList = new ArrayList<>();
        kitaplarSinifiArrayList.add(k1);
        kitaplarSinifiArrayList.add(k2);
        kitaplarSinifiArrayList.add(k3);
        kitaplarSinifiArrayList.add(k4);
        kitaplarSinifiArrayList.add(k5);
        kitaplarSinifiArrayList.add(k6);
        kitaplarSinifiArrayList.add(k7);
        kitaplarSinifiArrayList.add(k8);

        kitaplarAdapter = new KitaplarAdapter(kitaplarSinifiArrayList, this);
        kitaplarRV.setAdapter(kitaplarAdapter);


        //muziklerRV icin
        muziklerRV = findViewById(R.id.muziklerRV);
        muziklerRV.setHasFixedSize(true);
        muziklerRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        MuziklerSinifi m1 = new MuziklerSinifi(1, "muzik1", "muzik1", 12.45);
        MuziklerSinifi m2 = new MuziklerSinifi(2, "muzik2", "muzik2", 12.45);
        MuziklerSinifi m3 = new MuziklerSinifi(3, "muzik3", "muzik3", 12.45);
        MuziklerSinifi m4 = new MuziklerSinifi(4, "muzik4", "muzik4", 12.45);
        MuziklerSinifi m5 = new MuziklerSinifi(5, "muzik5", "muzik5", 12.45);
        MuziklerSinifi m6 = new MuziklerSinifi(6, "muzik6", "muzik6", 12.45);
        MuziklerSinifi m7 = new MuziklerSinifi(7, "muzik7", "muzik7", 12.45);

        muziklerSinifiArrayList = new ArrayList<>();
        muziklerSinifiArrayList.add(m1);
        muziklerSinifiArrayList.add(m2);
        muziklerSinifiArrayList.add(m3);
        muziklerSinifiArrayList.add(m4);
        muziklerSinifiArrayList.add(m5);
        muziklerSinifiArrayList.add(m6);
        muziklerSinifiArrayList.add(m7);

        muziklerAdapter = new MuziklerAdapter(muziklerSinifiArrayList, this);
        muziklerRV.setAdapter(muziklerAdapter);

    }
}