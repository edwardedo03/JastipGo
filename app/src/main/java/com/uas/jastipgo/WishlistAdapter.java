package com.uas.jastipgo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WishlistAdapter extends RecyclerView.Adapter<WishlistAdapter.WishlistViewHolder> {

    private List<WishlistModel> wishlistList;

    public WishlistAdapter(List<WishlistModel> wishlistList) {
        this.wishlistList = wishlistList;
    }

    @NonNull
    @Override
    public WishlistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_wishlist_layout, parent, false);
        return new WishlistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WishlistViewHolder holder, int position) {
        WishlistModel wishlist = wishlistList.get(position);
        holder.tvTitle.setText(wishlist.getTitle());
        holder.tvCountry.setText(wishlist.getCountry());
        holder.tvOfferCount.setText(String.valueOf(wishlist.getOfferCount()));
    }

    @Override
    public int getItemCount() {
        return wishlistList.size();
    }

    public static class WishlistViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvCountry, tvOfferCount;

        public WishlistViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.textView40);
            tvCountry = itemView.findViewById(R.id.textView41);
            tvOfferCount = itemView.findViewById(R.id.textView42);
        }
    }
}
