package com.uas.jastipgo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TripAdapter extends RecyclerView.Adapter<TripAdapter.TripViewHolder> {

    private List<TripModel> tripList;

    public TripAdapter(List<TripModel> tripList) {
        this.tripList = tripList;
    }

    @NonNull
    @Override
    public TripViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_trip_layout, parent, false);
        return new TripViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TripViewHolder holder, int position) {
        TripModel trip = tripList.get(position);
        holder.tvDestination.setText(trip.getDestination());
        holder.tvCountry.setText(trip.getCountry());
        holder.tvTimeRemaining.setText(trip.getTimeRemaining());
        holder.tvInfo.setText("oleh " + trip.getJastiper() + ", berangkat " + trip.getDepartureDate());
        holder.tvQuotaCurrent.setText(String.valueOf(trip.getQuotaCurrent()));
        holder.tvQuotaMax.setText(String.valueOf(trip.getQuotaMax()));
    }

    @Override
    public int getItemCount() {
        return tripList.size();
    }

    public static class TripViewHolder extends RecyclerView.ViewHolder {
        TextView tvDestination, tvCountry, tvTimeRemaining, tvInfo, tvQuotaCurrent, tvQuotaMax;

        public TripViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDestination = itemView.findViewById(R.id.textView19);
            tvCountry = itemView.findViewById(R.id.textView24);
            tvTimeRemaining = itemView.findViewById(R.id.textView20);
            tvInfo = itemView.findViewById(R.id.textView21);
            tvQuotaCurrent = itemView.findViewById(R.id.textView22);
            tvQuotaMax = itemView.findViewById(R.id.textView25);
        }
    }
}
