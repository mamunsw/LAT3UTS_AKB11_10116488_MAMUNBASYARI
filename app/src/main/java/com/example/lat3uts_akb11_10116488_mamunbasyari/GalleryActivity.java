package com.example.lat3uts_akb11_10116488_mamunbasyari;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lat3uts_akb11_10116488_mamunbasyari.adapter.AdapterFriendActivity;
import com.example.lat3uts_akb11_10116488_mamunbasyari.adapter.AdapterGalleryActivity;
import com.example.lat3uts_akb11_10116488_mamunbasyari.model.ModelGalleryActivity;

import java.util.ArrayList;

public class GalleryActivity extends Fragment {

    private RecyclerView mswRecycleGallery;
    private RecyclerView.Adapter mswAdappterGallery;
    private RecyclerView.LayoutManager mswLayoutManagerGallery;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View findView = inflater.inflate(R.layout.activity_gallery, container, false);

        ArrayList<ModelGalleryActivity> ModelGalleryActivityArrayList = new ArrayList<>();
        ModelGalleryActivityArrayList.add(new ModelGalleryActivity(R.drawable.img_doctor_strange));
        ModelGalleryActivityArrayList.add(new ModelGalleryActivity(R.drawable.img_ironman));
        ModelGalleryActivityArrayList.add(new ModelGalleryActivity(R.drawable.img_infinitywar));
        ModelGalleryActivityArrayList.add(new ModelGalleryActivity(R.drawable.endgame));
        ModelGalleryActivityArrayList.add(new ModelGalleryActivity(R.drawable.civilwar));
        ModelGalleryActivityArrayList.add(new ModelGalleryActivity(R.drawable.img_avenger1));


        mswRecycleGallery = findView.findViewById(R.id.gallery_recycle);
        mswRecycleGallery.setHasFixedSize(true);
        mswLayoutManagerGallery = new GridLayoutManager(getActivity(),3);
        mswAdappterGallery = new AdapterGalleryActivity(ModelGalleryActivityArrayList);

        mswRecycleGallery.setLayoutManager(mswLayoutManagerGallery);
        mswRecycleGallery.setAdapter(mswAdappterGallery);



        return findView;

    }
}
