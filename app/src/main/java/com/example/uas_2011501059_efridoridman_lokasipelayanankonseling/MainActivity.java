package com.example.uas_2011501059_efridoridman_lokasipelayanankonseling;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.uas_2011501059_efridoridman_lokasipelayanankonseling.fragment.HomeFragment;
import com.example.uas_2011501059_efridoridman_lokasipelayanankonseling.fragment.ListFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    void init(){
        getSupportActionBar().hide();
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }
    HomeFragment homeFragment = new HomeFragment();
    ListFragment listFragment = new ListFragment();

    Fragment fragment = null;
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home:
                fragment = homeFragment;
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, fragment).detach(fragment).commitNow();
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, fragment).attach(fragment).commitNow();
                break;
            case R.id.map:
                fragment = listFragment;
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, fragment).detach(fragment).commitNow();
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, fragment).attach(fragment).commitNow();
                break;

        }
        return true;
    }

}