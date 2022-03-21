package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPaintAdapter extends RecyclerView.Adapter<ListPaintAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<Paint> listPaint;

    public ListPaintAdapter(Context context) {
        this.context = context;
    }

    public ListPaintAdapter(ArrayList<Paint> list) {
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
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_paint, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
    //onBindViewHolder untuk menampilkan dengan membaca satu per satu itemnya
        categoryViewHolder.tvName.setText(getListPaint().get(position).getPaint_name());
        categoryViewHolder.tvDetail.setText(getListPaint().get(position).getDetail());

        Glide.with(context)
                .load(getListPaint().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        //getItemCount = ukurannya nanti
        //return 0; => awalnya seperti ini, jadi jangan lupa untuk diganti menjadi seperti dibawah
        return getListPaint().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        //CategoryViewHolder simpelnya untuk menghubungkan ke item yang ada
        //untuk hold item yang akan ditampilkan
        //holder ini tempat untuk menghubungkan dengan id yang sudah diberikan pada layout

        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
