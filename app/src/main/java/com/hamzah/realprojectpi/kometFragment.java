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

public class kometFragment extends Fragment{

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Card> list = new ArrayList<Card>();

    int[] image_id = {R.drawable.komet_halley,R.drawable.komet_encke,R.drawable.komet_kohoutek,
            R.drawable.komet_ikeya_seki,R.drawable.komet_hyakutake};
    String[] title;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_komet, container,false);
        title = getResources().getStringArray(R.array.komet_content);

        int count = 0;
        for (String Title : title){
            Card card = new Card(image_id[count], title[count]);
            count++;
            list.add(card);
        }
        recyclerView = (RecyclerView) v.findViewById(R.id.content3);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new CardAdapter(list, getActivity());
        recyclerView.setAdapter(adapter);
        return v;
    }
}
