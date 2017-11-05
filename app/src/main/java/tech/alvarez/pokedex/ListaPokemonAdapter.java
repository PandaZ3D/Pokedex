package tech.alvarez.pokedex;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
//import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;

import tech.alvarez.pokedex.models.Pokemon;

/**
 * Created by Daniel Alvarez on 28/7/16.
 * Copyright © 2016 Alvarez.tech. All rights reserved.
 */
public class ListaPokemonAdapter extends RecyclerView.Adapter<ListaPokemonAdapter.ViewHolder> {

    private ArrayList<Pokemon> dataset;
    private Context context;

    private int currX, currY;
    private int minX= 0, minY = 0;
    private int maxX, maxY;

    public ListaPokemonAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Pokemon p = dataset.get(position);
        holder.nombreTextView.setText(p.getName());

        Glide.with(context)
                .load("https://raw.githubusercontent.com/PokeAPI/pokeapi" +
                        "/master/data/Pokemon_XY_Sprites/" + p.getNumber() + ".png")
                //    "http://www.pokestadium.com/sprites/xy/"+p.getName()+".gif")
				 //.asBitmap()
                //.asGif()
                //.crossFade()

                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.fotoImageView);
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void adicionarListaPokemon(ArrayList<Pokemon> listaPokemon) {
        dataset.addAll(listaPokemon);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView fotoImageView;
        private TextView nombreTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            fotoImageView = (ImageView) itemView.findViewById(R.id.fotoImageView);
            fotoImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent  myIntent =  new Intent(v.getContext(), DexEnteryActivity.class);
                        context.startActivity(myIntent);
                    }
            });

            /*currX = fotoImageView.getWidth();
            currY = fotoImageView.getHeight();
            if (currX > minX) {minX = currX;}
            if (currY > minY) {minY = currY;}
            maxX = fotoImageView.getMaxWidth();
            maxY = fotoImageView.getMaxHeight();

            Log.e("CURR",currX+" "+currY);
            Log.e("MIN",minX+" "+minY);
            Log.e("MAX",maxX+" "+maxY);
            */
            nombreTextView = (TextView) itemView.findViewById(R.id.nombreTextView);
        }
    }
}
