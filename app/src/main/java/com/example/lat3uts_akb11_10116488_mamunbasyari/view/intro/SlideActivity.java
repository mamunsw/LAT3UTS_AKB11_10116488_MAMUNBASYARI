package com.example.lat3uts_akb11_10116488_mamunbasyari.view.intro;
//<!-- Nama : Mamun Basyari
//        Nim : 10116488
//        Kelas : AKB11
//        Tgl Kerja : 26-April-2019-->

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.lat3uts_akb11_10116488_mamunbasyari.R;

public class SlideActivity extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SlideActivity(Context context){

        this.context = context;
    }

    public int[] slide_images = {

            R.drawable.img_aktifitas,
            R.drawable.img_bisnis,
            R.drawable.img_music,
    };

    public String[] slide_juduls = {
                "PROFILE",
                "AKTIFITAS",
                "MUSIC"
    };

    public  String[] slide_descr = {
            "Aplikasi ini menjelaskan latar belakang pembuat aplikasi. Jadi ga perlu dibaca karena ga pentig :)",
            "Aktifitas yang dilakukan pun hanya kegiatan biasa jadi abaikan saja karena ga penting buat dibaca :)",
            "Kalau untuk music mungkin silahkan dibaca mungkin bisa jadi refensi untuk mendengarkan musik baru :)"
    };

    @Override
    public int getCount() {
        return slide_juduls.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_slide, container, false);

        ImageView slideImageview = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideJudul = (TextView) view.findViewById(R.id.slide_judul);
        TextView slideDesc = (TextView) view.findViewById(R.id.slide_desc);

        slideImageview.setImageResource(slide_images[position]);
        slideJudul.setText(slide_juduls[position]);
        slideDesc.setText(slide_descr[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

         container.removeView((RelativeLayout)object);
    }
}
