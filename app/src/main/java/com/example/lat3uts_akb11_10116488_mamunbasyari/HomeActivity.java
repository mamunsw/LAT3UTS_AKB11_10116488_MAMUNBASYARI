package com.example.lat3uts_akb11_10116488_mamunbasyari;
//<!-- Nama : Mamun Basyari
//        Nim : 10116488
//        Kelas : AKB11
////        Tgl Kerja : 26-April-2019-->
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class HomeActivity extends Fragment implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.activity_home, container, false);
        BottomNavigationView navHomeMenu = fragView.findViewById(R.id.home_bar);
        navHomeMenu.setOnNavigationItemSelectedListener(this);
        loadfragment(new HomeProfileActivity());
        return fragView;


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.homeprofile_nav:
                loadfragment(new HomeProfileActivity());
                break;
            case R.id.homeinterest_nav:
                loadfragment(new HomeInterestActivity());
                break;

        }

        return true;
    }

    void loadfragment(Fragment fragment) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fram_home, fragment);
        ft.commit();
    }


}




