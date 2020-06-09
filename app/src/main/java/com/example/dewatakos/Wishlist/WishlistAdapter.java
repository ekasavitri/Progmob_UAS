package com.example.dewatakos.Wishlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.astungkarafix.R;

import java.util.ArrayList;

public class WishlistAdapter extends RecyclerView.Adapter<WishlistAdapter.WishlistViewHolder> {

    private ArrayList<WishlistKos> mWishlistList;

    public static class WishlistViewHolder extends RecyclerView.ViewHolder{
        public TextView wish_judul;
        public TextView wish_harga;
        public ImageView wish_foto;
        public ImageButton wdelbut;

        public WishlistViewHolder(@NonNull View itemView) {
            super(itemView);

            wish_judul = itemView.findViewById(R.id.wishlist_judul);
            wish_harga = itemView.findViewById(R.id.wishlist_harga);
            wish_foto = itemView.findViewById(R.id.wishlist_foto);
            wdelbut = itemView.findViewById(R.id.butdel);
        }
    }

    public WishlistAdapter(ArrayList<WishlistKos> wishlistList) {
        mWishlistList = wishlistList;
    }

    @NonNull
    @Override
    public WishlistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wishlist,parent,false);
        WishlistViewHolder wvh = new WishlistViewHolder(view);
        return wvh;
    }

    @Override
    public void onBindViewHolder(@NonNull WishlistViewHolder holder, int position) {
        WishlistKos koswish = mWishlistList.get(position);
        holder.wish_judul.setText(koswish.getTitle());
        holder.wish_judul.setText(koswish.getTitle());
        holder.wish_foto.setImageResource(koswish.getFotoKos());


    }

    @Override
    public int getItemCount() {
        return mWishlistList.size();
    }
}
