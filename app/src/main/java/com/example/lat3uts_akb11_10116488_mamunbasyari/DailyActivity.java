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
import android.widget.LinearLayout;

import com.example.lat3uts_akb11_10116488_mamunbasyari.adapter.AdapterDailyActivity;
import com.example.lat3uts_akb11_10116488_mamunbasyari.adapter.AdapterFriendActivity;
import com.example.lat3uts_akb11_10116488_mamunbasyari.model.ModelDailyActivity;
import com.example.lat3uts_akb11_10116488_mamunbasyari.model.ModelFriendActivity;

import java.util.ArrayList;

public class DailyActivity extends Fragment {

    private RecyclerView mswRecycleFriend;
    private RecyclerView.Adapter mswAdappterFriend;
    private RecyclerView.LayoutManager mswLayoutManagerFriend;

    private RecyclerView mswRecycleActivity;
    private RecyclerView.Adapter mswAdapterActivity;
    private RecyclerView.LayoutManager mswLayoutManagerActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View findView = inflater.inflate(R.layout.activity_dailyactiv, container, false);

        //Untuk Friend Activity

        ArrayList<ModelFriendActivity> ModelFreindActivityArrayList = new ArrayList<>();
        ModelFreindActivityArrayList.add(new ModelFriendActivity(R.drawable.man, "Fata El Ismail"));
        ModelFreindActivityArrayList.add(new ModelFriendActivity(R.drawable.boy, "M. Fajar I"));
        ModelFreindActivityArrayList.add(new ModelFriendActivity(R.drawable.man, "Faldi Fav"));
        ModelFreindActivityArrayList.add(new ModelFriendActivity(R.drawable.boy, "Gerdi Abdi"));
        ModelFreindActivityArrayList.add(new ModelFriendActivity(R.drawable.man, "Esa Maulana"));
        ModelFreindActivityArrayList.add(new ModelFriendActivity(R.drawable.boy, "Eko Nursonic"));
        ModelFreindActivityArrayList.add(new ModelFriendActivity(R.drawable.man, "Adisri Yus"));
        ModelFreindActivityArrayList.add(new ModelFriendActivity(R.drawable.boy, "Ilham Prasetyo"));


        mswRecycleFriend = findView.findViewById(R.id.friend_recycle);
        mswRecycleFriend.setHasFixedSize(true);
        mswLayoutManagerFriend = new LinearLayoutManager(getActivity());
        mswAdappterFriend = new AdapterFriendActivity(ModelFreindActivityArrayList);

        mswRecycleFriend.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayout.HORIZONTAL, false));
        mswRecycleFriend.setAdapter(mswAdappterFriend);


        ArrayList<ModelDailyActivity> modelDailyActivityArrayList = new ArrayList<>();
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_calendar, "Sholat Subuh"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_calendar, "Ngampus"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_calendar, "Makan Siang"));
        modelDailyActivityArrayList.add(new ModelDailyActivity(R.drawable.ic_calendar, "Nonton Game Of Thrones"));


        mswRecycleActivity = findView.findViewById(R.id.daily_recycle);
        mswRecycleActivity.setHasFixedSize(true);
        mswLayoutManagerActivity = new LinearLayoutManager(getActivity());
        mswAdapterActivity = new AdapterDailyActivity(modelDailyActivityArrayList);

        mswRecycleActivity.setLayoutManager(mswLayoutManagerActivity);
        mswRecycleActivity.setAdapter(mswAdapterActivity);

        return findView;

    }
}
