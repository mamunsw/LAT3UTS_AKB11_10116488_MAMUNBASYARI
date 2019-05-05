package com.example.lat3uts_akb11_10116488_mamunbasyari;
//<!-- Nama : Mamun Basyari
//        Nim : 10116488
//        Kelas : AKB11
//        Tgl Kerja : 26-April-2019-->
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lat3uts_akb11_10116488_mamunbasyari.adapter.AdapterGalleryActivity;
import com.example.lat3uts_akb11_10116488_mamunbasyari.adapter.AdapterVideoActivity;
import com.example.lat3uts_akb11_10116488_mamunbasyari.model.ModelGalleryActivity;
import com.example.lat3uts_akb11_10116488_mamunbasyari.model.ModelVideoActivity;

import java.util.ArrayList;

public class VideoActivity extends Fragment {

    private RecyclerView mswRecycleVideo;
    private RecyclerView.Adapter mswAdappterVideo;
    private RecyclerView.LayoutManager mswLayoutManagerVideo;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View findView = inflater.inflate(R.layout.activity_video, container, false);
        String rawVideo= "android.resource://" + getActivity().getPackageName() + "/" + R.raw.videoplayback;
        String rawVideo2= "android.resource://" + getActivity().getPackageName() + "/" + R.raw.videoplayback;
        String rawVideo1= "android.resource://" + getActivity().getPackageName() + "/" + R.raw.end_game;
        ArrayList<ModelVideoActivity> ModelVideoActivityArrayList = new ArrayList<>();
        ModelVideoActivityArrayList.add(new ModelVideoActivity(rawVideo, "Against The Current"));
        ModelVideoActivityArrayList.add(new ModelVideoActivity(rawVideo1, "Avenger Endgame"));
        ModelVideoActivityArrayList.add(new ModelVideoActivity(rawVideo, "Against The Current"));


        mswRecycleVideo = findView.findViewById(R.id.video_recycle);
        mswRecycleVideo.setHasFixedSize(true);
        mswLayoutManagerVideo = new LinearLayoutManager(getActivity());
        mswAdappterVideo = new AdapterVideoActivity(ModelVideoActivityArrayList);

        mswRecycleVideo.setLayoutManager(mswLayoutManagerVideo);
        mswRecycleVideo.setAdapter(mswAdappterVideo);



        return findView;

    }
}
