package com.example.lat3uts_akb11_10116488_mamunbasyari;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MusicVideoActivity extends Fragment implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.activity_musicvideo, container, false);
        BottomNavigationView navHomeMenu = fragView.findViewById(R.id.musicvideo_bar);
        navHomeMenu.setOnNavigationItemSelectedListener(this);
        loadfragment(new MusicActivity());
        return fragView;


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.music_navbar:
                loadfragment(new MusicActivity());
                break;
            case R.id.video_nav:
                loadfragment(new VideoActivity());
                break;

        }

        return true;
    }

    void loadfragment(Fragment fragment) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fram_musicvideo, fragment);
        ft.commit();
    }


}




