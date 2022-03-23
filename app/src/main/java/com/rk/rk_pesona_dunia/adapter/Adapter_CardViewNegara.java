package com.rk.rk_pesona_dunia.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.rk.rk_pesona_dunia.R;
import com.rk.rk_pesona_dunia.data.Data_GetterSetter;

import java.util.ArrayList;

public class Adapter_CardViewNegara extends RecyclerView.Adapter<Adapter_CardViewNegara.PenampilDaftar> {
    private ArrayList<Data_GetterSetter> daftarDataGetterSetter;

    public Adapter_CardViewNegara(ArrayList<Data_GetterSetter> daftar) {
        this.daftarDataGetterSetter = daftar;
    }

    @NonNull
    @Override
    public Adapter_CardViewNegara.PenampilDaftar onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View lihat = LayoutInflater.from(parent.getContext()).inflate(R.layout.mode_cardview_item_negara, parent, false);
        return new Adapter_CardViewNegara.PenampilDaftar(lihat);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_CardViewNegara.PenampilDaftar holder, int position) {
        Data_GetterSetter dataGetterSetter = daftarDataGetterSetter.get(position);
        Glide.with(holder.itemView.getContext()).load(dataGetterSetter.getFotoBenderaNegara()).apply(new RequestOptions().override(350, 550)).into(holder.ImageView_GambarBenderaNegara);
        holder.TextView_NamaNegara.setText(dataGetterSetter.getNamaNegara().toUpperCase());
        holder.TextView_RincianNegara.setText(dataGetterSetter.getRincianNegara());
        holder.Button_LihatDestinasiWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), holder.Button_LihatDestinasiWisata.getText() + " " + daftarDataGetterSetter.get(holder.getAdapterPosition()).getNamaNegara(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), holder.Button_LihatDestinasiWisata.getText() + " " + daftarDataGetterSetter.get(holder.getAdapterPosition()).getNamaNegara(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return daftarDataGetterSetter.size();
    }

    public class PenampilDaftar extends RecyclerView.ViewHolder {
        ImageView ImageView_GambarBenderaNegara;
        TextView TextView_NamaNegara;
        TextView TextView_RincianNegara;
        Button Button_LihatDestinasiWisata;

        public PenampilDaftar(@NonNull View itemView) {
            super(itemView);
            ImageView_GambarBenderaNegara = itemView.findViewById(R.id.ImageView_GambarItemNegara);
            TextView_NamaNegara = itemView.findViewById(R.id.TextView_ItemNamaNegara);
            TextView_RincianNegara = itemView.findViewById(R.id.TextView_ItemRincianNegara);
            Button_LihatDestinasiWisata = itemView.findViewById(R.id.button_lihat_destinasi_wisata);
        }
    }
}
