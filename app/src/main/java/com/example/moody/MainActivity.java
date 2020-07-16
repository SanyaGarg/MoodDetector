package com.example.moody;

import android.os.Bundle;
import android.view.Display;

import com.example.moody.acitivity.AcitivityFragment;
import com.example.moody.acitivity.EmojiFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity  {

    private EmojiFragment emojiFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_Todo, R.id.navigation_calendar, R.id.navigation_profile)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
       // NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        if(findViewById(R.id.nav_host_fragment) != null){
            if(savedInstanceState!=null){
                return;
            }

            AcitivityFragment activityFragment = new AcitivityFragment();

            getSupportFragmentManager().beginTransaction().add(R.id.nav_host_fragment,activityFragment,null).commit();
        }

    }

}