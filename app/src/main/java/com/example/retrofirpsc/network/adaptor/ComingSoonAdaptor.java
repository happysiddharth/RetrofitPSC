package com.example.retrofirpsc.network.adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.retrofirpsc.R;
import com.example.retrofirpsc.model.ComingSoonDTO;
import com.example.retrofirpsc.model.NowShowingDTO;

import java.util.ArrayList;

public class ComingSoonAdaptor extends RecyclerView.Adapter<ComingSoonAdaptor.ComingSoonViewHolder> {

    private ArrayList<ComingSoonDTO> list;
    public ComingSoonAdaptor(ArrayList<ComingSoonDTO> list){
        this.list = list;
    }

    @NonNull
    @Override
    public ComingSoonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.coming_soon,parent,false);
        return new ComingSoonAdaptor.ComingSoonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ComingSoonViewHolder holder, int position) {
        holder.setData(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ComingSoonViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;

        public ComingSoonViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.comingImage);
        }
        public void setData(ComingSoonDTO comingSoonDTO){
            if (comingSoonDTO.getPosterurl()!=null){
                Glide.with(imageView)
                        .load(comingSoonDTO.getPosterurl())
                        .into(imageView);
            }
        }
    }
}
