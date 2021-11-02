package com.example.app17multirecyclerviewwithscrollview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app17multirecyclerviewwithscrollview.R;
import com.example.app17multirecyclerviewwithscrollview.model.DizilerSinifi;
import com.example.app17multirecyclerviewwithscrollview.model.FilmlerSinifi;

import java.util.List;

public class DizilerAdapter extends RecyclerView.Adapter<DizilerAdapter.DizilerViewHolder> {

    private List<DizilerSinifi> dizilerSinifiList;
    private Context mContext;

    public DizilerAdapter(List<DizilerSinifi> dizilerSinifiList, Context mContext) {
        this.dizilerSinifiList = dizilerSinifiList;
        this.mContext = mContext;
    }

    public class DizilerViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageViewDiziResim;
        public TextView textViewDiziBaslik;
        public TextView textViewDiziFiyat;
        public Button buttonDiziSepeteEkle;

        public DizilerViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewDiziResim = itemView.findViewById(R.id.imageViewDiziResim);
            textViewDiziBaslik = itemView.findViewById(R.id.textViewDiziBaslik);
            textViewDiziFiyat = itemView.findViewById(R.id.textViewDiziFiyat);
            buttonDiziSepeteEkle = itemView.findViewById(R.id.buttonDiziSepeteEkle);

        }

    }

    @NonNull
    @Override
    public DizilerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.dizi_card_tasarim, parent, false);
        return new DizilerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DizilerViewHolder holder, int position) {

        final DizilerSinifi film = dizilerSinifiList.get(position);
        holder.imageViewDiziResim.setImageResource(mContext.getResources()
                .getIdentifier(film.getDizi_resim_ad(), "drawable", mContext.getPackageName()));
        //holder.imageViewDiziResim.setImageResource(R.drawable.dizi_lucifer);

        holder.textViewDiziBaslik.setText(film.getDizi_ad());
        holder.textViewDiziFiyat.setText(film.getDizi_fiyat() + "");


    }

    @Override
    public int getItemCount() {
        return dizilerSinifiList.size();
    }



}
