
package tech.alvarez.pokedex;

/**
 * Created by pabda on 11/4/2017.
 */


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import tech.alvarez.pokedex.models.Pokemon;

public class EntryAdapter extends RecyclerView.Adapter<EntryAdapter.ViewHolder> {


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    //Binds data to viewholder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}

/*private Pokemon data;
    private Context context;

    public EntryAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_dex_entery, parent, false);
        return new ViewHolder(view);
    }


@Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);

        holder.nombreTextView.setText(data.getName());

        Glide.with(context)
                .load("https://raw.githubusercontent.com/PokeAPI/pokeapi" +
                        "/master/data/Pokemon_XY_Sprites/" + data.getNumber() + ".png")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.fotoImageView);
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView fotoImageView;
        private TextView nombreTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            fotoImageView = (ImageView) itemView.findViewById(R.id.fotoImageView);
            nombreTextView = (TextView) itemView.findViewById(R.id.nombreTextView);
        }
    }

    public void setData(Pokemon p){
        this.data = p;
    }

    public void getData(Pokemon p) {
        return this.data;
    }
*/


