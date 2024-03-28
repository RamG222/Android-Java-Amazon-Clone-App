package com.example.amazonclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class rv_homepage_products_adapter extends RecyclerView.Adapter<rv_homepage_products_adapter.ViewHolder> {
    private List<Integer> listofImages;
    private Context context;

    public rv_homepage_products_adapter(List<Integer> listofImages, Context context) {
        this.listofImages = listofImages;
        this.context = context;
    }

    @NonNull
    @Override
    public rv_homepage_products_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_homepage_products,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull rv_homepage_products_adapter.ViewHolder holder, int position) {
        int imageResId = listofImages.get(position);
        holder.imageView.setImageResource(imageResId);

    }

    @Override
    public int getItemCount() {
        return listofImages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.homepage_grid_imageview);
        }
    }
}
