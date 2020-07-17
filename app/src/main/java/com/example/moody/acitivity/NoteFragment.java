package com.example.moody.acitivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.moody.R;

import org.w3c.dom.Text;

public class NoteFragment extends Fragment {

    EditText editText;
    TextView feeling;
    Button save;
    String[] array;
    String arrayName;

    public static final String SHARED_PREF = "sharedPref";
    public static final String TEXT = "text";
    public static final String BUTTON = "SAVED";

    public NoteFragment() {
        // Required empty public constructor
    }

    public static NoteFragment newInstance(String param1, String param2) {
        NoteFragment fragment = new NoteFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_note, container, false);

        editText = view.findViewById(R.id.editText);
        save = view.findViewById(R.id.save_button);

        save.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                    arrayName = "Array";
                    //array[0] = editText.getText().toString();
                    saveData(array,arrayName);
                Fragment activityFragment = new AcitivityFragment();

                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,activityFragment);

                fragmentTransaction.commit();
            }
        });
        return view;
    }

    public void saveData(String[] array,String arrayName) {

        SharedPreferences sharedPreferences = getActivity().getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.apply();
    }
}