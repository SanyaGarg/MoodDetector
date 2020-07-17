package com.example.moody.acitivity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

import static com.example.moody.acitivity.NoteFragment.TEXT;

public class AcitivityFragment extends Fragment {

    public static AcitivityFragment newInstance() {
        AcitivityFragment fragment = new AcitivityFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return new AcitivityFragment();
    }

    SharedPreferences sharedPreferences;
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

        recyclerView.setAdapter(new ItemAdapter(initDate("Array")));

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

    private List<Model> initDate(String arrayName){
        itemList = new ArrayList<>();

        sharedPreferences = this.getActivity().getSharedPreferences("text",Context.MODE_PRIVATE);
        int size = sharedPreferences.getInt(arrayName+"_size",0);
        for(int i=0;i<size;i++){
            String name =sharedPreferences.getString(arrayName+"_"+i,null);

        }

        return itemList;
    }

}