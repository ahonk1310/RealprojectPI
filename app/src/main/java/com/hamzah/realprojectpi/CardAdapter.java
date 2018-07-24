package com.hamzah.realprojectpi;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hamzah on 23/07/2017.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {
    private ArrayList<Card> cards = new ArrayList<Card>(); // cards: ArrayList<Card>
    private Context ctx;
    public CardAdapter (ArrayList<Card> cards, Context ctx)
    {
        this.cards = cards;
        this.ctx = ctx;
    }
    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        CardViewHolder cardViewHolder = new CardViewHolder(view,ctx,cards);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder,final int position) {

        Card CARD = cards.get(position);
        holder.img_content.setImageResource(CARD.getImage_id());
        holder.title_content.setText(CARD.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Card card = cards.get(position);
                Intent intent = new Intent(ctx,Content.class);
                intent.putExtra("img_id",card.getImage_id());
                intent.putExtra("title",card.getTitle());
                ctx.startActivity(intent);
            }
        });
    }

    @Override

    public int getItemCount() {
        return cards.size();
    }

    //Menggunakan ViewHolder
    public static class CardViewHolder extends RecyclerView.ViewHolder
    {
        ImageView img_content;
        TextView title_content;
        ArrayList<Card> cards = new ArrayList<Card>();
        Context ctx;
        public CardViewHolder(View view, Context ctx, ArrayList<Card> cards)
        {
            super(view);
            this.cards = cards;
            this.ctx = ctx;
            img_content = (ImageView) view.findViewById(R.id.content_image);
            title_content = (TextView) view.findViewById(R.id.nama_content);
        }


    }
}

