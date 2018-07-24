package com.hamzah.realprojectpi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import static android.R.id.list;

/**
 * Created by Hamzah on 17/07/2017.
 */

public class planetFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Card> list = new ArrayList<Card>();

    int[] image_id = {R.drawable.matahari1,R.drawable.merkurius,R.drawable.venus,
            R.drawable.bumi1,R.drawable.mars,R.drawable.jupiter_altair,
            R.drawable.saturnus,R.drawable.uranus,R.drawable.neptun1};
        String[] title;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_planet, container,false);
        title = getResources().getStringArray(R.array.planet_content);

 int count = 0;
        for (String Title : title){
Card card = new Card(image_id[count], title[count]);
        count++;
            list.add(card);
        }
        recyclerView = (RecyclerView) v.findViewById(R.id.content1);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new CardAdapter(list,  getActivity());
        recyclerView.setAdapter(adapter);
        return v;
    }
}
