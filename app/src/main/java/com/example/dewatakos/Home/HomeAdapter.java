package com.example.dewatakos.Home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.astungkarafix.R;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    Context context;
    List<GridKos> mList;

    public HomeAdapter(Context context, List<GridKos> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_gridkos, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.judulkos.setText(mList.get(position).getTitle());
        holder.fotokos.setImageResource(mList.get(position).getImage());
        holder.fotokos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, HomeDetailActivity.class);
                intent.putExtra("Title",mList.get(position).getTitle());
                intent.putExtra("FotoKos",mList.get(position).getImage());
                intent.putExtra("HargaKos",mList.get(position).getHarga());
                intent.putExtra("Deskripsi",mList.get(position).getDeskripsi());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView judulkos;
        private ImageView fotokos;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            judulkos = itemView.findViewById(R.id.gridkos_judul);
            fotokos = itemView.findViewById(R.id.gridkos_foto);
        }
    }
}
