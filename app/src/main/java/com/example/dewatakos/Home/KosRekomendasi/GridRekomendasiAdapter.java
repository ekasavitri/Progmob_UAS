package com.example.dewatakos.Home.KosRekomendasi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.astungkarafix.R;

import java.util.List;

public class GridRekomendasiAdapter extends RecyclerView.Adapter<GridRekomendasiAdapter.MyViewHolder> {

    private Context mContext;
    private List<GridRekomendasi> mData;

    public GridRekomendasiAdapter(Context mContext, List<GridRekomendasi> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater nInflater = LayoutInflater.from(mContext);
        view = nInflater.inflate(R.layout.item_gridrekomendasi,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.judul_rekomendasi.setText(mData.get(position).getNamaKosRekomen());
        holder.foto_rekomendasi.setImageResource(mData.get(position).getFotoKosRekomen());
        holder.cardrek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, DetailRekomendasiActivity.class);
                intent.putExtra("Title",mData.get(position).getNamaKosRekomen());
                intent.putExtra("Harga",mData.get(position).getHargaKosRekomen());
                intent.putExtra("Deskripsi",mData.get(position).getDeskripsiKosRekomen());
                intent.putExtra("FotoKos",mData.get(position).getFotoKosRekomen());
                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public  static  class  MyViewHolder extends RecyclerView.ViewHolder{
        TextView judul_rekomendasi;
        ImageView foto_rekomendasi;
        CardView cardrek;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            judul_rekomendasi = (TextView) itemView.findViewById(R.id.grid_rekomennamakos);
            foto_rekomendasi = (ImageView) itemView.findViewById(R.id.grid_rekomenfotokos);
            cardrek = (CardView) itemView.findViewById(R.id.cardview_idrek);
        }
    }
}
