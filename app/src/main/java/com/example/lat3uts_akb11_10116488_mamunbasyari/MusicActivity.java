package com.example.lat3uts_akb11_10116488_mamunbasyari;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
//<!-- Nama : Mamun Basyari
//        Nim : 10116488
//        Kelas : AKB11
//        Tgl Kerja : 26-April-2019-->
import com.example.lat3uts_akb11_10116488_mamunbasyari.R;
import com.example.lat3uts_akb11_10116488_mamunbasyari.adapter.AdapterMusicActivity;
import com.example.lat3uts_akb11_10116488_mamunbasyari.model.ModelMusicActivity;


public class MusicActivity extends Fragment {

    private RecyclerView mswRecycleMmusic;
    private RecyclerView.Adapter mswAdappterMusic;
    private RecyclerView.LayoutManager mswLayoutManagerMusic;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View findView = inflater.inflate(R.layout.activity_video, container, false);


        ArrayList<ModelMusicActivity> ModelMusicActivityArrayList = new ArrayList<>();
        ModelMusicActivityArrayList.add(new ModelMusicActivity(R.drawable.isabela,"I'll Stay","Isabela Moner",R.raw.ill_stay));
        ModelMusicActivityArrayList.add(new ModelMusicActivity(R.drawable.isabela,"I'll Stay","Isabela Moner",R.raw.ill_stay));

        mswRecycleMmusic= findView.findViewById(R.id.video_recycle);
        mswRecycleMmusic.setHasFixedSize(true);
        mswLayoutManagerMusic = new LinearLayoutManager(getActivity());
        mswAdappterMusic = new AdapterMusicActivity(ModelMusicActivityArrayList, getContext());

        mswRecycleMmusic.setLayoutManager(mswLayoutManagerMusic);
        mswRecycleMmusic.setAdapter(mswAdappterMusic);

        return findView;
    }
}