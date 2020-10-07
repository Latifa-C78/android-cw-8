package com.example.pokemon;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PokemonAdapter extends RecyclerView.Adapter {
    ArrayList<pokemon> parray;
    Context context;

    public PokemonAdapter(ArrayList<pokemon> parray, Context context) {
        this.parray = parray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon,parent,false);
        ViewHolder vh=new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).img.setImageResource(parray.get(position).getImage());
        ((ViewHolder)holder).name.setText(parray.get(position).getName());
        ((ViewHolder)holder).total.setText(parray.get(position).getTotal()+"");
    }

    @Override
    public int getItemCount() {
        return parray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public TextView name;
        public TextView total;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.imageView3);
            name = itemView.findViewById(R.id.textView3);
            total = itemView.findViewById(R.id.textView5);

        }
    }
}
