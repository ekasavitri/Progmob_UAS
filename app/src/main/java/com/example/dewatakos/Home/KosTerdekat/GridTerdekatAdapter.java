package com.example.dewatakos.Home.KosTerdekat;

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

public class GridTerdekatAdapter extends RecyclerView.Adapter<GridTerdekatAdapter.MyViewHolder> {

    private Context mContext;
    private List<GridTerdekat> mData;

    public GridTerdekatAdapter(Context mContext, List<GridTerdekat> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater ninflater = LayoutInflater.from(mContext);
        view = ninflater.inflate(R.layout.item_griddekat, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.judul_dekat.setText(mData.get(position).getNamaKosDekat());
        holder.foto_dekat.setImageResource(mData.get(position).getFotoKosDekat());
        holder.carddeket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailTerdekatActivity.class);
                intent.putExtra("Title", mData.get(position).getNamaKosDekat());
                intent.putExtra("Harga", mData.get(position).getHargaKosDekat());
                intent.putExtra("Deskripsi", mData.get(position).getDeskripsiKosDekat());
                intent.putExtra("FotoKos", mData.get(position).getFotoKosDekat());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView judul_dekat;
        ImageView foto_dekat;
        CardView carddeket;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            judul_dekat = (TextView) itemView.findViewById(R.id.grid_dktnamakos);
            foto_dekat = (ImageView) itemView.findViewById(R.id.grid_dktfotokos);
            carddeket = (CardView) itemView.findViewById(R.id.cardview_iddkt);
        }
    }
}
