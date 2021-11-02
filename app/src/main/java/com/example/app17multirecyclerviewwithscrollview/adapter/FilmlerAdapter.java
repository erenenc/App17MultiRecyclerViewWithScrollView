package com.example.app17multirecyclerviewwithscrollview.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app17multirecyclerviewwithscrollview.R;
import com.example.app17multirecyclerviewwithscrollview.model.FilmlerSinifi;

import java.util.List;

public class FilmlerAdapter extends RecyclerView.Adapter<FilmlerAdapter.FilmlerViewHolder> {

    private List<FilmlerSinifi> filmlerSinifiList;
    private Context mContext;

    public FilmlerAdapter(List<FilmlerSinifi> filmlerSinifiList, Context mContext) {
        this.filmlerSinifiList = filmlerSinifiList;
        this.mContext = mContext;
    }

    public class FilmlerViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageViewFilmResim;
        public TextView textViewFilmBaslik;
        public TextView textViewFilmFiyat;
        public Button buttonFilmSepeteEkle;

        public FilmlerViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewFilmResim = itemView.findViewById(R.id.imageViewFilmResim);
            textViewFilmBaslik = itemView.findViewById(R.id.textViewFilmBaslik);
            textViewFilmFiyat = itemView.findViewById(R.id.textViewFilmFiyat);
            buttonFilmSepeteEkle = itemView.findViewById(R.id.buttonFilmSepeteEkle);

        }

    }

    @NonNull
    @Override
    public FilmlerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.filmler_card_tasarim, parent, false);
        return new FilmlerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmlerViewHolder holder, int position) {

        final FilmlerSinifi film = filmlerSinifiList.get(position);
        holder.imageViewFilmResim.setImageResource(mContext.getResources()
                .getIdentifier(film.getFilm_resim_ad(), "drawable", mContext.getPackageName()));

        //Log.e("bu nedirrrrr", String.valueOf(mContext.getResources().getIdentifier(film.getFilm_resim_ad(), "drawable", mContext.getPackageName())));
        //Log.e("bu nedirrrrr222222", String.valueOf(film.getFilm_resim_ad()));
        //holder.imageViewFilmResim.setImageResource(R.drawable.film_inception);

        holder.textViewFilmBaslik.setText(film.getFilm_ad());
        holder.textViewFilmFiyat.setText(film.getFilm_fiyat() + "");

    }

    @Override
    public int getItemCount() {
        return filmlerSinifiList.size();
    }



}
