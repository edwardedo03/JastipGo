package com.uas.jastipgo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerViewTrips = view.findViewById(R.id.recyclerViewTrips);
        if (recyclerViewTrips != null) {
            recyclerViewTrips.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

            List<TripModel> tripList = new ArrayList<>();
            tripList.add(new TripModel("Seoul", "Korea Selatan", "Siti Rahma", "12 Des 2026", "2 Hari Lagi", 19, 50));
            tripList.add(new TripModel("Tokyo", "Jepang", "Budi Santoso", "18 Des 2026", "5 Hari Lagi", 30, 50));

            TripAdapter adapter = new TripAdapter(tripList);
            recyclerViewTrips.setAdapter(adapter);
        }
    }
}
