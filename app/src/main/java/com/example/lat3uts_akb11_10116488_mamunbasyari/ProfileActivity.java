package com.example.lat3uts_akb11_10116488_mamunbasyari;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.VideoView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfileActivity extends Fragment {

    @BindView(R.id.btn_tentang)
    ImageView btn_about;
    @BindView(R.id.btn_fb)
    ImageView btn_fb;
    @BindView(R.id.btn_ig)
    ImageView btn_ig;
    @BindView(R.id.btn_twit)
    ImageView btn_wordpress;
    @BindView(R.id.btn_map)
    ImageView btn_maps;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragView=inflater.inflate(R.layout.activity_profile, container, false);
        ButterKnife.bind(this,fragView);

        return fragView;

    }


        @OnClick(R.id.btn_tentang)
        public void click(){
            CustomDialogActivity cd = new CustomDialogActivity();
            cd.showDialog(getActivity(), "MSWApps V1.0 Developed by Mamun SW AKB11-10116488");
        }
        @OnClick(R.id.btn_fb)
        public void click_fb() {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.facebook.com/mamunsw98"));
            startActivity(intent);
        }

        @OnClick(R.id.btn_ig)
        public void click_ig() {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.instagram.com/mamunsw/?hl=id"));
            startActivity(intent);
        }

        @OnClick(R.id.btn_twit)
        public void click_twit() {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://twitter.com/Mamun_SW98"));
            startActivity(intent);
        }
        @OnClick(R.id.btn_map)
        public void click_map() {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://goo.gl/maps/nnoSHdBTptDcJqD38"));
            startActivity(intent);
        }
    }

