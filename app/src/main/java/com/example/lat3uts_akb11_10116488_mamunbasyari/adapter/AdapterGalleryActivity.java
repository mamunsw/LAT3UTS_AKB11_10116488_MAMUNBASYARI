package com.example.lat3uts_akb11_10116488_mamunbasyari.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.lat3uts_akb11_10116488_mamunbasyari.R;
import com.example.lat3uts_akb11_10116488_mamunbasyari.model.ModelGalleryActivity;

import java.util.ArrayList;


public class AdapterGalleryActivity extends RecyclerView.Adapter<AdapterGalleryActivity.DailyViewHolder> {

    private ArrayList<ModelGalleryActivity> mgalleryList;
    Context cntx;


    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_gallery_activ, viewGroup, false);
        DailyViewHolder galleryView = new DailyViewHolder(v);
        return galleryView;
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder holder, int position) {
        final ModelGalleryActivity currentItem = mgalleryList.get(position);
        holder.mImageViewGallery.setImageResource(currentItem.getimgGambarGallery());
    }

    @Override
    public int getItemCount() {

        return mgalleryList.size();
    }


    public static class DailyViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageViewGallery;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageViewGallery= itemView.findViewById(R.id.imageViewgallery);
        }
    }

    public AdapterGalleryActivity(ArrayList<ModelGalleryActivity> mgalleryList) {
        this.mgalleryList = mgalleryList;
    }

}

//    private Context mCtx;
//    private List<ModelDailyActivity> dailylist;
//
//    public AdapterDailyActivity(Context mCtx, List<ModelDailyActivity> dailylist) {
//        this.mCtx = mCtx;
//        this.dailylist = dailylist;
//    }
//
//    @NonNull
//    @Override
//    public AdapterDailyActivity.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater inflater = LayoutInflater.from(mCtx);
//        View view = inflater.inflate(R.layout.fragment_daily_activ, null);
//        return  new AdapterViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull AdapterDailyActivity.AdapterViewHolder holder, int position) {
//        ModelDailyActivity daily = dailylist.get(position);
//
//        holder.txtDescrip.setText(daily.getTextDescrip());
//        holder.imgGambar.setImageDrawable(mCtx.getResources().getDrawable(daily.getImageView()));
//    }
//
//    @Override
//    public int getItemCount() {
//        return dailylist.size();
//    }
//
//    class AdapterViewHolder extends RecyclerView.ViewHolder {
//        TextView txtDescrip;
//        ImageView imgGambar;
//
//
//        public AdapterViewHolder(@NonNull View itemView) {
//            super(itemView);
//            txtDescrip = itemView.findViewById(R.id.textViewTitle);
//            imgGambar = itemView.findViewById(R.id.imageView);
//        }
//    }

