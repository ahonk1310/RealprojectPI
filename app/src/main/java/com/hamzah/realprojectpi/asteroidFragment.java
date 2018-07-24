package com.hamzah.realprojectpi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Hamzah on 17/07/2017.
 */

public class asteroidFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Card> list = new ArrayList<Card>();

    int[] image_id = {R.drawable.ceres,R.drawable.asteroid_pallas,R.drawable.vesta1,
            R.drawable.hygiea,R.drawable.interamnia};
    String[] title;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_asteroid, container,false);
        title = getResources().getStringArray(R.array.asteroid_content);

        int count = 0;
        for (String Title : title){
            Card card = new Card(image_id[count], title[count]);
            count++;
            list.add(card);
        }
        recyclerView = (RecyclerView) v.findViewById(R.id.content2);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new CardAdapter(list,  getActivity());
        recyclerView.setAdapter(adapter);
        return v;
    }
}