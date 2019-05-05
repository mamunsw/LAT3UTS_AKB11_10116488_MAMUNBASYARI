package com.example.lat3uts_akb11_10116488_mamunbasyari.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lat3uts_akb11_10116488_mamunbasyari.model.ModelDailyActivity;
import com.example.lat3uts_akb11_10116488_mamunbasyari.R;

import java.util.ArrayList;


public class AdapterDailyActivity extends RecyclerView.Adapter<AdapterDailyActivity.DailyViewHolder> {

    private ArrayList<ModelDailyActivity> mdailyList;


    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_daily_activ, viewGroup, false);
        DailyViewHolder Da = new DailyViewHolder(v);
        return Da;
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder holder, int position) {
        ModelDailyActivity currentItem = mdailyList.get(position);
        holder.mImageView.setImageResource(currentItem.getImgGambarDaily());
        holder.txtJudul1.setText(currentItem.getTxtJudulDaily());
    }

    @Override
    public int getItemCount() {
        return mdailyList.size();
    }


    public static class DailyViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView txtJudul1;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageViewdaily);
            txtJudul1 = itemView.findViewById(R.id.textViewTitledaily);
        }
    }

    public AdapterDailyActivity(ArrayList<ModelDailyActivity> dailyList) {
        mdailyList = dailyList;
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

