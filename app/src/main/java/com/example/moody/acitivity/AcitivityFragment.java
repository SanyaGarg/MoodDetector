package com.example.moody.acitivity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.moody.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class AcitivityFragment extends Fragment {

    public static AcitivityFragment newInstance() {
        return new AcitivityFragment();
    }

    RecyclerView recyclerView;
    List<Model> itemList;
   ImageView additional;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.acitivity_fragment, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(new ItemAdapter(initDate()));

        additional = view.findViewById(R.id.add);

        additional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment emojiFragment = new EmojiFragment();

                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,emojiFragment);

                fragmentTransaction.commit();
            }
        });

        return view;
    }

    private List<Model> initDate(){
        itemList = new ArrayList<>();
        itemList.add(new Model("Work","12:00pm",R.drawable.ic_action_calendar));
        itemList.add(new Model("Work","12:00pm",R.drawable.ic_action_calendar));
        itemList.add(new Model("Work","12:00pm",R.drawable.ic_action_calendar));
        itemList.add(new Model("Work","12:00pm",R.drawable.ic_action_calendar));
        itemList.add(new Model("Work","12:00pm",R.drawable.ic_action_calendar));
        itemList.add(new Model("Work","12:00pm",R.drawable.ic_action_calendar));
        itemList.add(new Model("Work","12:00pm",R.drawable.ic_action_calendar));
        itemList.add(new Model("Work","12:00pm",R.drawable.ic_action_calendar));

        return itemList;
    }

}