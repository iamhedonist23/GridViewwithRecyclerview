package com.example.demogridlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GallaryAdapter extends RecyclerView.Adapter<GallaryAdapter.MyViewHolder> {


    private final List<Gallary> gallaryList;

    public GallaryAdapter(List<Gallary> gallaryList) {

        this.gallaryList = gallaryList;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView imagename;
        public ImageView image;

        public MyViewHolder(View view) {
            super(view);
            imagename = view.findViewById(R.id.txt_image_name);
            image=view.findViewById(R.id.imgView);
        }
    }


    @NonNull
    @Override
    public GallaryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gallary_view, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull GallaryAdapter.MyViewHolder holder, int position) {

        Gallary gallary = gallaryList.get(position);
        holder.imagename.setText(gallary.getImagename());
        holder.image.setImageResource(gallary.getImage());
    }

    @Override
    public int getItemCount() {
        return gallaryList.size();
    }
}
