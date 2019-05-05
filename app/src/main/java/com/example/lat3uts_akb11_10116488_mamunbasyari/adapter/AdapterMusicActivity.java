package com.example.lat3uts_akb11_10116488_mamunbasyari.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lat3uts_akb11_10116488_mamunbasyari.R;
import com.example.lat3uts_akb11_10116488_mamunbasyari.model.ModelGalleryActivity;
import com.example.lat3uts_akb11_10116488_mamunbasyari.model.ModelMusicActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

//<!-- Nama : Mamun Basyari
//        Nim : 10116488
//        Kelas : AKB11
//        Tgl Kerja : 26-April-2019-->

import java.util.ArrayList;

public class AdapterMusicActivity extends RecyclerView.Adapter<AdapterMusicActivity.DailyViewHolder> {

    private ArrayList<ModelMusicActivity> mmusicList;
    private Context context;
    private ArrayList<Integer> newMusic=new ArrayList<>();

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_music, viewGroup, false);
        DailyViewHolder Dv = new DailyViewHolder(v);
        return Dv;
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder holder, int position) {

        ModelMusicActivity currentItem = mmusicList.get(position);
        holder.imgLagu.setImageResource(currentItem.getImgMusicLagu());
        holder.txtArtis.setText(currentItem.getTxtArtisMusic());
        holder.txtJudulMusic.setText(currentItem.getTxtJudulMusic());
        int uri=currentItem.getRawAudio();
        newMusic.add(uri);
        holder.setItem(newMusic);

    }

    @Override
    public int getItemCount() {
        return mmusicList.size();
    }


    public static class DailyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtJudulMusic;
        public TextView txtArtis;
        public ImageView imgLagu;
        private ArrayList<Integer> modelAudio=new ArrayList<>();
        private static MediaPlayer mediaPlayer;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            txtArtis = itemView.findViewById(R.id.txtBand);
            txtJudulMusic = itemView.findViewById(R.id.txtJudullagu);
            imgLagu = itemView.findViewById(R.id.imgLagu);
        }

        public void setItem(ArrayList<Integer> item){
            modelAudio=item;
        }

        @OnClick
        void klik(@NonNull View itemView){
            int position=getAdapterPosition();
            int uri=modelAudio.get(position);
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
                mediaPlayer = null;
            }else{
                mediaPlayer = MediaPlayer.create(itemView.getContext(), uri);
                mediaPlayer.start();
            }
        }
    }
    public AdapterMusicActivity(ArrayList<ModelMusicActivity> musicLiist, Context context)
    {
        mmusicList = musicLiist;
        this.context = context;
    }
}