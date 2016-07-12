package com.example.pawans.fragmentexercise;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openFirstFragment();

    }

    public void openFirstFragment(){

        FirstFragment firstFragment = new FirstFragment();
        getSupportFragmentManager().beginTransaction().addToBackStack("Fragment")
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.fragment_first, firstFragment).commit();

    }

    public void openSecondFragment(){

        SecondFragment secondFragment = new SecondFragment();
        getSupportFragmentManager().beginTransaction().addToBackStack("Fragment")
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.fragment_first, secondFragment).commit();

//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                .replace(R.id.fragment_first,secondFragment)
//                .addToBackStack(null).commit();

    }
    public void openThirdFragment(){

        ThirdFragment thirdFragment = new ThirdFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.fragment_first,thirdFragment);
        fragmentTransaction.addToBackStack("Fragment");
        fragmentTransaction.commit();
    }
    public void openFourthFragment(){

        FourthFragment fourthFragment = new FourthFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.fragment_first,fourthFragment);
        fragmentTransaction.commit();

    }

    public void clearBackStack() {
        while (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            try {
                getSupportFragmentManager().popBackStackImmediate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
