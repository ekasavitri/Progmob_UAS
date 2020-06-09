package com.example.dewatakos.Home.KosPopuler;

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

public class GridPopulerAdapter extends RecyclerView.Adapter<GridPopulerAdapter.MyViewHolder> {
    private Context mcontext;
    private List<GridPopuler> mData;

    public GridPopulerAdapter(Context mcontext, List<GridPopuler> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mcontext);
        view = mInflater.inflate(R.layout.item_gridpopuler,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.kos_title.setText(mData.get(position).getNamaKos());
        holder.kos_img.setImageResource(mData.get(position).getFotoKos());
        holder.cardviewpop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mcontext, DetailPopulerActivity.class);
                // memberi data ke detailpopuler
                intent.putExtra("Title", mData.get(position).getNamaKos());
                intent.putExtra("Harga", mData.get(position).getHargaKos());
                intent.putExtra("Deskripsi", mData.get(position).getDeskripsiKos());
                intent.putExtra("FotoKos", mData.get(position).getFotoKos());
                // start activity
                mcontext.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView kos_title;
        ImageView kos_img;
        CardView cardviewpop;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            kos_title = (TextView) itemView.findViewById(R.id.grid_namakos);
            kos_img = (ImageView) itemView.findViewById(R.id.grid_fotokos);
            cardviewpop = (CardView) itemView.findViewById(R.id.cardview_idpop);
        }
    }
}
