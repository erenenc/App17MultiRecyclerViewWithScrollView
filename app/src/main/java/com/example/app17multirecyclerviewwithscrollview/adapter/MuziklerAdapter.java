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
import com.example.app17multirecyclerviewwithscrollview.model.MuziklerSinifi;


import java.util.List;

public class MuziklerAdapter extends RecyclerView.Adapter<MuziklerAdapter.MuziklerViewHolder> {

    private List<MuziklerSinifi> muziklerSinifiList;
    private Context mContext;

    public MuziklerAdapter(List<MuziklerSinifi> muziklerSinifiList, Context mContext) {
        this.muziklerSinifiList = muziklerSinifiList;
        this.mContext = mContext;
    }

    public class MuziklerViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageViewMuzikResim;
        public TextView textViewMuzikBaslik;
        public TextView textViewMuzikFiyat;
        public Button buttonMuzikSepeteEkle;

        public MuziklerViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewMuzikResim = itemView.findViewById(R.id.imageViewMuzikResim);
            textViewMuzikBaslik = itemView.findViewById(R.id.textViewMuzikBaslik);
            textViewMuzikFiyat = itemView.findViewById(R.id.textViewMuzikFiyat);
            buttonMuzikSepeteEkle = itemView.findViewById(R.id.buttonMuzikSepeteEkle);

        }

    }

    @NonNull
    @Override
    public MuziklerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.muzik_card_tasarim, parent, false);
        return new MuziklerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MuziklerViewHolder holder, int position) {

        final MuziklerSinifi film = muziklerSinifiList.get(position);
        holder.imageViewMuzikResim.setImageResource(mContext.getResources()
                .getIdentifier(film.getMuzik_resim_ad(), "drawable", mContext.getPackageName()));
        //holder.imageViewDiziResim.setImageResource(R.drawable.dizi_lucifer);

        holder.textViewMuzikBaslik.setText(film.getMuzik_ad());
        holder.textViewMuzikFiyat.setText(film.getMuzik_fiyat() + "");

    }

    @Override
    public int getItemCount() {
        return muziklerSinifiList.size();
    }



}
