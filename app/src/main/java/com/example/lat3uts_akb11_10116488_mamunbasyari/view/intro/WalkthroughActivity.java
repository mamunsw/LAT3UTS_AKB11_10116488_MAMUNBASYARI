package com.example.lat3uts_akb11_10116488_mamunbasyari.view.intro;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

//<!-- Nama : Mamun Basyari
//        Nim : 10116488
//        Kelas : AKB11
//        Tgl Kerja : 26-April-2019-->

import com.example.lat3uts_akb11_10116488_mamunbasyari.MenuActivity;
import com.example.lat3uts_akb11_10116488_mamunbasyari.R;

public class WalkthroughActivity extends AppCompatActivity {

    private ViewPager nSlideViewPager;
    private LinearLayout mDotLayout;

    private TextView[] mDots;

    private  SlideActivity slideActivity;

    private Button nextBtn;

    private int currentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        nSlideViewPager = (ViewPager) findViewById(R.id.slidePager);
        mDotLayout = (LinearLayout) findViewById(R.id.linearSlide);

        nextBtn = (Button) findViewById(R.id.btnNext);

       slideActivity = new SlideActivity(this);
       nSlideViewPager.setAdapter(slideActivity);

       addDotsIndicator(0);

       nSlideViewPager.addOnPageChangeListener(viewListener);
    }

    public  void  addDotsIndicator(int position){
        mDots = new TextView[3];
        mDotLayout.removeAllViews();

        for(int i = 0; i<mDots.length; i++){

            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorGrey));

            mDotLayout.addView(mDots[i]);
        }
        if (mDots.length > 0){

            mDots[position].setTextColor(getResources().getColor(R.color.colorWhite));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsIndicator(i);
            currentPage = i;

            if (i == 0){
                nextBtn.setEnabled(false);
                nextBtn.setVisibility(View.INVISIBLE);
            }
            else if (i == mDots.length -1){
                nextBtn.setEnabled(true);
                nextBtn.setVisibility(View.VISIBLE);
                nextBtn.setText("Finish");

            }
            else {
                nextBtn.setEnabled(false);
                nextBtn.setVisibility(View.INVISIBLE);
            }


        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

    public void btnNext(View view) {
        Intent next = new Intent(WalkthroughActivity.this, MenuActivity.class);
        startActivity(next);
    }
}
