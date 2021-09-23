package com.example.retrofirpsc.network.adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.retrofirpsc.R;
import com.example.retrofirpsc.model.NowShowingDTO;

import java.util.ArrayList;

public class NewMovieAdaptor extends RecyclerView.Adapter<NewMovieAdaptor.NewMovieViewHolder> {

    private ArrayList<NowShowingDTO> list;
    public NewMovieAdaptor(ArrayList<NowShowingDTO> list){
        this.list = list;
    }

    @NonNull
    @Override
    public NewMovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.new_shows,parent,false);
        return new NewMovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewMovieViewHolder holder, int position) {
        holder.setData(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class NewMovieViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        public NewMovieViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imagePoster);
        }
        public void setData(NowShowingDTO nowShowingDTO){
            if (nowShowingDTO.getPosterurl()!=null){
                Glide.with(imageView)
                        .load(nowShowingDTO.getPosterurl())
                        .placeholder(R.drawable.ic_baseline_agriculture_24)
                        .into(imageView);
            }
        }
    }
}
