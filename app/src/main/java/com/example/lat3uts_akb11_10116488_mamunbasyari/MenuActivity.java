package com.example.lat3uts_akb11_10116488_mamunbasyari;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
//
//<!-- Nama : Mamun Basyari
//        Nim : 10116488
//        Kelas : AKB11
//        Tgl Kerja : 26-April-2019-->
public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        BottomNavigationView navBottom = findViewById(R.id.nav_bar);
        navBottom.setOnNavigationItemSelectedListener(navListen);
        getSupportFragmentManager().beginTransaction().replace(R.id.fram_menu, new HomeActivity()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListen = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;

            switch (menuItem.getItemId()) {
                case R.id.home_nav:
                    selectedFragment = new HomeActivity();
                    break;

                case R.id.act_nav:
                    selectedFragment = new DailyActivity();
                    break;
                case R.id.galery_nav:
                    selectedFragment = new GalleryActivity();
                    break;
                case R.id.music_nav:
                    selectedFragment = new MusicVideoActivity();
                    break;
                case R.id.profile_nav:
                    selectedFragment = new ProfileActivity();
                    break;


            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fram_menu, selectedFragment).commit();

            return true;

        }

    };
}
