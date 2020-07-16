package com.example.moody.acitivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.moody.R;

public class EmojiFragment extends Fragment {

    private ImageView happy,angry,indifferent,excited,sad,worried;

    public EmojiFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static EmojiFragment newInstance(String param1, String param2) {
        EmojiFragment fragment = new EmojiFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_emoji, container, false);

//        Bundle bundle = getArguments();
//        String message = bundle.getString("message");


        excited = view.findViewById(R.id.excited);
        happy = view.findViewById(R.id.happy);
        sad = view.findViewById(R.id.sad);
        indifferent = view.findViewById(R.id.indifferent);
        worried = view.findViewById(R.id.worried);
        angry = view.findViewById(R.id.angry);

        excited.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Fragment noteFragment = new NoteFragment();

                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,noteFragment);

                fragmentTransaction.commit();
            }
        });

        angry.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Fragment noteFragment = new NoteFragment();

                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,noteFragment);

                fragmentTransaction.commit();
            }
        });

        happy.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Fragment noteFragment = new NoteFragment();

                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,noteFragment);

                fragmentTransaction.commit();
            }
        });

        indifferent.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Fragment noteFragment = new NoteFragment();

                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,noteFragment);

                fragmentTransaction.commit();
            }
        });

        worried.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Fragment noteFragment = new NoteFragment();

                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,noteFragment);

                fragmentTransaction.commit();
            }
        });

        sad.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Fragment noteFragment = new NoteFragment();

                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,noteFragment);

                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });



        return view;
    }
}