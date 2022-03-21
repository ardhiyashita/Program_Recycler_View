package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridPaintAdapter extends RecyclerView.Adapter<GridPaintAdapter.CategoryViewHolder> {

    private ArrayList<Paint> listPaint;
    public GridPaintAdapter(ArrayList<Paint> list) {
        this.listPaint = list;
    }
    public ArrayList<Paint> getListPaint() {
        return listPaint;
    }
    public void setListPaint(ArrayList<Paint> listPaint) {
        this.listPaint = listPaint;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemGrid = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_paint, viewGroup, false);
        return new GridPaintAdapter.CategoryViewHolder(itemGrid);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        Glide.with(categoryViewHolder.itemView.getContext())
                .load(listPaint.get(position).getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(categoryViewHolder.imgPhoto);

    }

    @Override
    public int getItemCount() {
        return listPaint.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }

}
