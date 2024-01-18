package com.example.scoutingapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;


public class MainActivity extends AppCompatActivity {

    boolean navBarOpen = false;


    public void onClick(View v) {

        if (v.getId() == R.id.pitScouting) {
            setContentView(R.layout.pit_scouting);
        } else if (v.getId() == R.id.matchScouting) {
            setContentView(R.layout.match_scouting);
        } else if (v.getId() == R.id.navBarArrow) {
            toggleNavBar();
        }

    }

    public void toggleNavBar() {
        if (navBarOpen == false) {

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home_screen);


        VPadapter vpAdapter = new VPadapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        //vpAdapter.addFragment(new Auto(), "Auto");
        //vpAdapter.addFragment(new Teleop(), "Teleop");
        //vpAdapter.addFragment(new endgame(), "Endgame");
        //vpAdapter.addFragment(new save(), "Save");


//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);


    }


}