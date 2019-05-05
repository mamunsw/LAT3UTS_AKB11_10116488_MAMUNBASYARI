package com.example.lat3uts_akb11_10116488_mamunbasyari.adapter;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.lat3uts_akb11_10116488_mamunbasyari.R;
import com.example.lat3uts_akb11_10116488_mamunbasyari.model.ModelDailyActivity;
import com.example.lat3uts_akb11_10116488_mamunbasyari.model.ModelVideoActivity;

import java.net.URI;
import java.util.ArrayList;

//<!-- Nama : Mamun Basyari
//        Nim : 10116488
//        Kelas : AKB11
//        Tgl Kerja : 26-April-2019-->
public class AdapterVideoActivity extends RecyclerView.Adapter<AdapterVideoActivity.DailyViewHolder> {

    private ArrayList<ModelVideoActivity> mvideoList;


    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_video, viewGroup, false);
        DailyViewHolder Da = new DailyViewHolder(v);
        return Da;
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder holder, int position) {
        ModelVideoActivity currentItem = mvideoList.get(position);
        holder.mVideoView.setVideoURI(Uri.parse(currentItem.getTxtNamaVideo()));
        holder.mVideoView.start();
        holder.txtJudul1.setText(currentItem.getRawVideo());
    }

    @Override
    public int getItemCount() {
        return mvideoList.size();
    }


    public static class DailyViewHolder extends RecyclerView.ViewHolder {
        public VideoView mVideoView;
        public TextView txtJudul1;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            mVideoView = itemView.findViewById(R.id.rawVideo);
            txtJudul1 = itemView.findViewById(R.id.txtVideo);
        }
    }

    public AdapterVideoActivity(ArrayList<ModelVideoActivity> videoList) {
        mvideoList = videoList;
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

