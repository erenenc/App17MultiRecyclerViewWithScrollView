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
import com.example.app17multirecyclerviewwithscrollview.model.KitaplarSinifi;

import java.util.List;

public class KitaplarAdapter extends RecyclerView.Adapter<KitaplarAdapter.KitaplarViewHolder> {

    private List<KitaplarSinifi> kitaplarSinifiList;
    private Context mContext;

    public KitaplarAdapter(List<KitaplarSinifi> kitaplarSinifiList, Context mContext) {
        this.kitaplarSinifiList = kitaplarSinifiList;
        this.mContext = mContext;
    }

    public class KitaplarViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageViewKitapResim;
        public TextView textViewKitapBaslik;
        public TextView textViewKitapFiyat;
        public Button buttonKitapSepeteEkle;

        public KitaplarViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewKitapResim = itemView.findViewById(R.id.imageViewKitapResim);
            textViewKitapBaslik = itemView.findViewById(R.id.textViewKitapBaslik);
            textViewKitapFiyat = itemView.findViewById(R.id.textViewKitapFiyat);
            buttonKitapSepeteEkle = itemView.findViewById(R.id.buttonKitapSepeteEkle);

        }

    }

    @NonNull
    @Override
    public KitaplarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.kitap_card_tasarim, parent, false);
        return new KitaplarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KitaplarViewHolder holder, int position) {

        final KitaplarSinifi film = kitaplarSinifiList.get(position);
        holder.imageViewKitapResim.setImageResource(mContext.getResources()
                .getIdentifier(film.getKitap_resim_ad(), "drawable", mContext.getPackageName()));
        //holder.imageViewKitapResim.setImageResource(R.drawable.dizi_lucifer);

        holder.textViewKitapBaslik.setText(film.getKitap_ad());
        holder.textViewKitapFiyat.setText(film.getKitap_fiyat() + "");

    }

    @Override
    public int getItemCount() {
        return kitaplarSinifiList.size();
    }



}
